/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kristian.layouttilsud;


import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author erik
 */
public class PuzzleGenerator {
    private Puzzle puzzle;
    private List<Integer> var1,var2;
    private int a,b,c,d,e,f,g,h,i;
    private int[] base;
    
    public Puzzle getPuzzle(){
        int difficulty = 40;
        generatePuzzle();
        while(fieldsWithNumbers()>difficulty) remove();
        return this.puzzle;
    }
    
    private void generatePuzzle(){
        this.var1 = Arrays.asList(0,1,2,3,4,5,6,7,8);
        this.var2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        this.puzzle = new Puzzle();
        
        Collections.shuffle(var2);
        a=var2.get(0);
        b=var2.get(1);
        c=var2.get(2);
        d=var2.get(3);
        e=var2.get(4);
        f=var2.get(5);
        g=var2.get(6);
        h=var2.get(7);
        i=var2.get(8);
        base = new int[]
        {
            a,b,c,d,e,f,g,h,i,
            d,e,f,g,h,i,a,b,c,
            g,h,i,a,b,c,d,e,f,
            b,c,d,e,f,g,h,i,a,
            e,f,g,h,i,a,b,c,d,
            h,i,a,b,c,d,e,f,g,
            c,d,e,f,g,h,i,a,b,
            f,g,h,i,a,b,c,d,e,
            i,a,b,c,d,e,f,g,h
        };
        for(int i = 0;i<81;i++){
            this.puzzle.setField(i, (int) base[i]);
        }
    }
    
    
    
    private void remove(){
        int[] arr;
        int r = (int) (Math.random() * 3);
        int i = (int) (Math.random() * 9);
        int n = (int) (Math.random() * 9);
        if (r==0){
            arr = Puzzle.BOXES[i];
        }
        if (r==1){
            arr = Puzzle.ROWS[i];
        }
        else {
            arr = Puzzle.COLS[i];
        }
        int field = arr[var1.get(n)];
        this.puzzle.setField(field, 0);
    }

    
    
    private int fieldsWithNumbers(){
        int count =0;
        for (int i=0;i<81;i++){
            if (this.puzzle.getField(i)!= 0) count++;
        }
        return count;
    }
}
