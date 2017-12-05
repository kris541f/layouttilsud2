/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kristian.layouttilsud;


/**
 *
 * @author erik
 */
public class SpeculatorResult {
    private boolean valid;
    private  int field;
    private int num;
    private Puzzle puzzle;
    
    public SpeculatorResult(boolean valid, int field, int num){
        this.valid =valid;
        this.field=field;
        this.num=num;
    }
    
    public SpeculatorResult(boolean valid, int field, int num, Puzzle puzzle){
        this(valid,field,num);
        this.puzzle = puzzle;
    }
    
    public Puzzle getPuzzle(){
        return puzzle;
    }
    
    public int getField(){
        return this.field;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public boolean isValid(){
        return valid;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("valid: " + this.valid + "\n");
        sb.append("num: " + this.num+ "\n");
        sb.append("field: " + this.field+ "\n");
        if (this.puzzle != null) sb.append(this.puzzle.toString() + "\n");
        return sb.toString();
    }
    
}
