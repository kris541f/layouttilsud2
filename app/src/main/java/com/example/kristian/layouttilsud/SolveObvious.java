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
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 *
 * @author erik
 */
public class SolveObvious {
    
    private HashSet[] excludedFields;
    private Puzzle puzzle;
    private HashSet[] possibleFields;
    private HashSet<Integer> nonUniqueFits;
    private boolean newFit;
    
    SolveObvious(Puzzle p){
        this.puzzle = p;
        this.nonUniqueFits = new HashSet<Integer>();
        this.possibleFields = new HashSet[9];
        this.excludedFields = new HashSet[9];
    }
    
    
    @RequiresApi(api = Build.VERSION_CODES.N)
    boolean solve(){
        while(!puzzle.isSolved()){
            quickSolve();
            if (!newFit) altSolve();
            if (!newFit) return false;
        }
        return puzzle.isSolved()&&puzzle.isValid();
    }
    
    HashSet[] getExcluded(){
        return excludedFields;
    }
    
    HashSet[] getPossibles(){
        return possibleFields;
    }
private ArrayList<Integer> getEmptyFieldsFor(int num){
    ArrayList<Integer> emptyFields = new ArrayList<>();
    for (Object o : possibleFields[num - 1]) {
        int field = (int) o;
        if (puzzle.getField(field) == 0 && !excludedFields[num - 1].contains(field))
            emptyFields.add(field);
    }
    return emptyFields;
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
    protected Puzzle getPuzzle(){
    return puzzle;
}

@RequiresApi(api = Build.VERSION_CODES.N)
private void altSolve(){
    newFit = false;
    for(int i=0;i<81;i++){
        if(puzzle.getField(i)==0){
            int ret = checkField(i);
            int val = -1 == ret ? 0:ret;
            if (val != 0){
                puzzle.setField(i, val);
                newFit=true;
            }
        }
    }
}


private void quickSolve(){
    newFit=false;
    HashSet fits;
    updatePossibleFields();
    setNonUniqueFits();
    for (int i=0;i<9;i++){
        fits = getUniqueFits(i+1);
        if (applyFits(fits,i+1)) newFit =true;
    }
}

// Writes the fits to the puzzle and returns true if it writes to an empty field.
private boolean applyFits(HashSet fits, int num){
    boolean newFit = false;
    for (Object fit : fits) {
        int i = (int) fit;
        if (puzzle.getField(i) == 0) newFit = true;
        puzzle.setField(i, num);
    }
    return newFit;
}

private void setNonUniqueFits(){
    HashSet<Integer> fits = new HashSet<Integer>();
    this.nonUniqueFits.clear();
    for(int i=0;i<9;i++){
        for (Object o : possibleFields[i]) {
            int field = (int) o;
            if (!fits.contains(field)) fits.add(field);
            else {
                nonUniqueFits.add(field);
            }
        }
    }
}

// returns an array of ints representing the fields in which only the given number can fit.
private HashSet getUniqueFits(int num){
    HashSet fits = new HashSet();
    fits.addAll(possibleFields[num-1]);
    fits.removeAll(nonUniqueFits);
    return fits;
}


public void setExcludedFields(HashSet[] excluded){
    for (int i=0;i<9;i++){
        excludedFields[i] = new HashSet(excluded[i]);
    }
}
    
// updates possible fields with values from getFields method.
private void updatePossibleFields(){
    for (int i=0;i<9;i++){
        possibleFields[i] = getFieldsFor(i+1);
        possibleFields[i].remove(excludedFields[i]);
    }
}

// Returns -1 if no match is found, otherwise it returns what the value of the field should be.
@RequiresApi(api = Build.VERSION_CODES.N)
private int checkField(int f){
    if (puzzle.getField(f)!=0) return -1;
    int col = Puzzle.getColFor(f);
    int row = Puzzle.getRowFor(f);
    int box = Puzzle.getBoxFor(f);
    int[] colA = puzzle.getFieldsInCol(col);
    int[] rowA = puzzle.getFieldsInRow(row);
    int[] boxA = puzzle.getFieldsInBox(box);
    
    int row1 = (row+1)%3 + 3*(row/3);
    int row2=(row+2)%3  + 3*(row/3);
    int col1 = (col+1)%3 + 3*(col/3);
    int col2=(col+2)%3  + 3*(col/3);
    
    int[] row1A = puzzle.getFieldsInRow(row1);
    int[] row2A = puzzle.getFieldsInRow(row2);
    int[] col1A = puzzle.getFieldsInCol(col1);
    int[] col2A = puzzle.getFieldsInCol(col2);
                        
    HashSet colH = new HashSet(stream(colA).boxed().collect(Collectors.toList()));
    HashSet rowH = new HashSet(stream(rowA).boxed().collect(Collectors.toList()));
    HashSet boxH = new HashSet(stream(boxA).boxed().collect(Collectors.toList()));
    HashSet<Integer> all = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    all.removeAll(colH);
    all.removeAll(rowH);
    all.removeAll(boxH);
    if (all.size()==1){
        int ret = (int) all.toArray()[0];
        return ret;
    }
    
    HashSet col1H = new HashSet(stream(col1A).boxed().collect(Collectors.toList()));
    HashSet col2H = new HashSet(stream(col2A).boxed().collect(Collectors.toList()));
    HashSet row1H = new HashSet(stream(row1A).boxed().collect(Collectors.toList()));
    HashSet row2H = new HashSet(stream(row2A).boxed().collect(Collectors.toList()));
    
    
    if (rowA[col1]==0) all.retainAll(col1H);
    if (rowA[col2]==0) all.retainAll(col2H);
    if (colA[row1]==0) all.retainAll(row1H);
    if (colA[row2]==0) all.retainAll(row2H);
    if (all.size()==1){
        int ret = (int) all.toArray()[0];
        return ret;
    }
    return -1;
}

// Returns an array of integers  indicating indexes of fields in which the number could fit.
private HashSet<Integer> getFieldsFor(int num){
    HashSet<Integer> ret = new HashSet<Integer>();
    for(int i=0;i<81;i++){
        int[] row = puzzle.getFieldsInRow(Puzzle.getRowFor(i));
        int[] col = puzzle.getFieldsInCol(Puzzle.getColFor(i));
        int[] box = puzzle.getFieldsInBox(Puzzle.getBoxFor(i));
        if (!inArray(row,num) && !inArray(col,num) && !inArray(box,num)){
            ret.add(i);
        }
        if (puzzle.getField(i)==num) ret.add(i);
    }
    return ret;
}
  
private boolean inArray(int[] array, int num){
    for(int i:array) {if (i==num) return true;}
    return false;
}

    
}