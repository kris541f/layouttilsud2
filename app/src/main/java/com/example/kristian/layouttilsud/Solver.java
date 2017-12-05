/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kristian.layouttilsud;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik
 */
public class Solver implements Callable{
    private Puzzle puzzle;
    private HashSet[] excludedFields;
    private Future<SpeculatorResult>[] results;
    private Speculator[] speculators;
    private boolean done;
    
    public Solver(Puzzle puzzle){
        this.done = false;
        this.puzzle = puzzle;
        excludedFields = new HashSet[9];
        results = new Future[9];
        speculators = new Speculator[9];
        for (int i=0;i<9;i++){
            excludedFields[i] = new HashSet();
        }
    }
    
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void solve() {
        SolveObvious s = new SolveObvious(puzzle);

        if (s.solve()){
            this.puzzle = s.getPuzzle();
        }
        else{
            try {
                speculate();
            } catch (InterruptedException ex) {
                Logger.getLogger(Solver.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Solver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Puzzle getPuzzle(){
        return this.puzzle;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void speculate() throws InterruptedException, ExecutionException {
        SolveObvious so = new SolveObvious(this.puzzle);
        so.solve();
        this.puzzle = so.getPuzzle();
        for (int num=1;num<10;num++){
            if (numberIsDone(num))continue;
            int field = getPossibleField(num);
            if (field != -1) {
                if (speculators[num-1]==null){
                    speculators[num-1] = new Speculator(puzzle, num,field, this);
                    speculators[num-1].excludeAll(excludedFields);
                    results[num-1] = SolverThreadPool.submitThread(speculators[num-1]);
                }
            }
        }
        while(true){
            int countNull =0;
            for (int i=0;i<9;i++){
                if (results[i]==null) {
                    countNull++;
                    continue;
                }
                if (results[i].isDone()){
                    SpeculatorResult result = results[i].get();
                    if (result.isValid()){
                        this.puzzle = result.getPuzzle();
                        return;
                    }
                    else {
                        int f = result.getField();
                        int num = result.getNum();
                        this.excludedFields[num-1].add(f);
                    }
                    speculators[i] = null;
                    results[i]=null;
                    return;
                }
            }
            if (countNull == 9 ) return;
        }
    }

    private int getPossibleField(int num) {
        boolean flag=false;
        for (int i=0;i<81;i++){
            if (puzzle.getField(i)==0){
                if (inArray(puzzle.getFieldsInBox(Puzzle.getBoxFor(i)),num)){
                    flag = true;
                }
                if (inArray(puzzle.getFieldsInRow(Puzzle.getRowFor(i)),num)){
                    flag = true;
                    
                }
                if (inArray(puzzle.getFieldsInCol(Puzzle.getColFor(i)),num)){
                    flag = true;
                }
                if (excludedFields[num-1].contains(i)){
                    flag = true;
                }
                if (!flag){
                    return i;
                }
            }
            flag =false;
        }
        return -1;
    }
    
    private boolean inArray(int[] array, int num){
        for(int i:array) {if (i==num) return true;}
        return false;
    }
    
    public synchronized HashSet[] getExcluded(){
        return this.excludedFields;
    }

    public Future start() {
        return SolverThreadPool.submitMain(this);
    }
    
    public void stop(){
        done = true;
        SolverThreadPool.shutDownNow();
    }
    
    public boolean isDone(){
        return done;
    }
    
    private boolean numberIsDone(int num){
        int count=0;
        for(int i=0;i<81;i++){
            if (puzzle.getField(i)==num) count++;
            if (count ==9) return true;
        }
        return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public Object call() throws Exception {
        while(!this.puzzle.isSolved()){
            solve();    
        }
        this.stop();
        return this.puzzle;
    }
}