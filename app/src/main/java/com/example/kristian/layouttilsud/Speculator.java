/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kristian.layouttilsud;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/**
 *
 * @author erik
 */
public class Speculator implements Callable{

    private final int field;
    private final int num;
    private SolveObvious solver;
    private HashSet[] possibleFields;
    private HashSet[] excludedFields;
    private Puzzle puzzle;
    private Solver parent;
    
    @Override
    public Object call() throws Exception {
        SpeculatorResult ret = speculate();
        return ret;
    }
    
    @RequiresApi(api = Build.VERSION_CODES.N)
    public Speculator(Puzzle puzzle, int n, int f, Solver parent){
        this.num =n;
        this.field = f;
        this.puzzle = new Puzzle(Arrays.copyOf(puzzle.getFields(),81));
        this.solver  = new SolveObvious(this.puzzle);
        this.solver.solve();
        this.excludedFields = solver.getExcluded();
        this.possibleFields = solver.getPossibles();
        for (int i=0;i<9;i++){
            if (excludedFields[i]==null) excludedFields[i] = new HashSet();
            if (possibleFields[i]==null) possibleFields[i] = new HashSet();
        }
        this.parent = parent;
    }
    
    public int getField(){
        return field;
    }
    
    public int getNum(){
        return  num;
    }

    private SpeculatorResult speculate() {
        if (puzzle.isSolved() && puzzle.isValid()){
            return new SpeculatorResult(true, field, num, solver.getPuzzle());
        }
        else{
            if (speculateRecursive()){
                return new SpeculatorResult(true, field, num, puzzle);
            }
            else{
                return new SpeculatorResult(false, field, num);
            }
        }
    }
    
    @RequiresApi(api = Build.VERSION_CODES.N)
    private boolean speculateRecursive(){
    int num  = getNumberWithLeastPossibilities();
    if (num==0) {
        return false;
    }
    SpeculatorResult result;
    for(int i:getEmptyFieldsFor(num)){
        int[] fields  = Arrays.copyOf(puzzle.getFields(),81);
        fields[i] = num;
        Puzzle p = new Puzzle(fields);
        SolveObvious so = new SolveObvious(p);
        if (so.solve()){
            this.puzzle = so.getPuzzle();
            return true;
        }
        if (p.isValid()){
            Speculator s = new Speculator(p,i,num, this.parent);
            s.excludeAll(excludedFields);
            s.excludeAll(parent.getExcluded());
            result = s.speculate();
            if (result.isValid()){
                this.puzzle = result.getPuzzle();
                return true;
            }      
        }
        else{
            exclude(num,i);
        }
    }
    return false;
}
    
    private int getNumberWithLeastPossibilities(){
    int ret = 0;
    int least=81;
    for(int i =0; i<9;i++){
        int empties = getEmptyFieldsFor(i+1).size();
        if (empties>0 && empties <least){
            ret = i+1;
            least = empties;
        }
    }
    return ret;
}
  private ArrayList<Integer> getEmptyFieldsFor(int num){
    ArrayList<Integer> emptyFields = new ArrayList<>();
    Iterator it = possibleFields[num-1].iterator();
    while(it.hasNext()){
        int field = (int) it.next();
        if (puzzle.getField(field) == 0 && !excludedFields[num-1].contains(field) ) emptyFields.add(field);
    }
    return emptyFields;
    }

    public void excludeAll(HashSet[] excluded) {
        for(int i=0;i<9;i++){
            excludedFields[i].addAll(excluded[i]);
        }
       
    }

    private void exclude(int num, int f) {
        excludedFields[num-1].add(f);
    }

}
