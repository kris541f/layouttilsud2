/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kristian.layouttilsud;

import java.util.Arrays;

/**
 *
 * @author erik
 */
class Puzzle {
    private int[] fields;
    
    final static int[] BOX0 =new int[] {0,1,2,9,10,11,18,19,20};
    final static int[] BOX1 =new int[] {3,4,5,12,13,14,21,22,23};
    final static int[] BOX2 =new int[] {6,7,8,15,16,17,24,25,26};
    final static int[] BOX3 =new int[] {27,28,29,36,37,38,45,46,47};
    final static int[] BOX4 =new int[] {30,31,32,39,40,41,48,49,50};
    final static int[] BOX5 =new int[] {33,34,35,42,43,44,51,52,53};
    final static int[] BOX6 =new int[] {54,55,56,63,64,65,72,73,74};
    final static int[] BOX7 =new int[] {57,58,59,66,67,68,75,76,77};
    final static int[] BOX8 =new int[] {60,61,62,69,70,71,78,79,80};
    final static int[][] BOXES = new int[][] {BOX0,BOX1,BOX2,BOX3,BOX4,BOX5,BOX6,BOX7,BOX8};
    
    final static int[] COL0 = new int[]{0,9,18,27,36,45,54,63,72};
    final static int[] COL1= new int[]{1,10,19,28,37,46,55,64,73};
    final static int[] COL2= new int[]{2,11,20,29,38,47,56,65,74};
    final static int[] COL3= new int[]{3,12,21,30,39,48,57,66,75};
    final static int[] COL4= new int[]{4,13,22,31,40,49,58,67,76};
    final static int[] COL5= new int[]{5,14,23,32,41,50,59,68,77};
    final static int[] COL6= new int[]{6,15,24,33,42,51,60,69,78};
    final static int[] COL7= new int[]{7,16,25,34,43,52,61,70,79};
    final static int[] COL8= new int[]{8,17,26,35,44,53,62,71,80};
    final static int[][] COLS = new int[][]{COL0,COL1, COL2,COL3,COL4,COL5,COL6,COL7,COL8};
    
    final static int[][] ROWS = new int[][]{
        {0,1,2,3,4,5,6,7,8},
        {9,10,11,12,13,14,15,16,17},
        {18,19,20,21,22,23,24,25,26},
        {27,28,29,30,31,32,33,34,35},
        {36,37,38,39,40,41,42,43,44},
        {45,46,47,48,49,50,51,52,53},
        {54,55,56,57,58,59,60,61,62},
        {63,64,65,66,67,68,69,70,71},
        {72,73,74,75,76,77,78,79,80}
    };
    
    final static int[] BOXARRAY = new int[]{
            0,0,0,1,1,1,2,2,2,
            0,0,0,1,1,1,2,2,2, 
            0,0,0,1,1,1,2,2,2, 
            3,3,3,4,4,4,5,5,5,
            3,3,3,4,4,4,5,5,5,
            3,3,3,4,4,4,5,5,5,
            6,6,6,7,7,7,8,8,8,
            6,6,6,7,7,7,8,8,8,
            6,6,6,7,7,7,8,8,8
         };
    final static int[] COLARRAY = new int[] {
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8, 
       0,1,2,3,4,5,6,7,8,
       0,1,2,3,4,5,6,7,8, 
    };
    final static int[] ROWARRAY = new int[]{
        0,0,0,0,0,0,0,0,0,
        1,1,1,1,1,1,1,1,1,
        2,2,2,2,2,2,2,2,2,
        3,3,3,3,3,3,3,3,3,
        4,4,4,4,4,4,4,4,4,
        5,5,5,5,5,5,5,5,5,
        6,6,6,6,6,6,6,6,6,
        7,7,7,7,7,7,7,7,7,
        8,8,8,8,8,8,8,8,8
    };
    
    public Puzzle(){
        fields = new int[81];
        for (int i = 0;i<81;i++){
            fields[i]=0;
        }
    }
    
    public Puzzle(int[] f){
        fields = Arrays.copyOf(f,81);
    }
    
    public boolean initPuzzle(int[] p){
        fields = p;
        return isValid();
    }

    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    for (int i=0;i<9;i++){
       sb.append( Arrays.toString(getFieldsInRow(i))+ "\n");
       }
    return sb.toString();
}
    
    public int[] getFields(){
        return fields;
    }
    
     public int[] getFieldsInCol(int i){
         int [] col = new int[]{
         fields[COLS[i][0]],
         fields[COLS[i][1]],
         fields[COLS[i][2]],
         fields[COLS[i][3]],
         fields[COLS[i][4]],
         fields[COLS[i][5]],
         fields[COLS[i][6]],
         fields[COLS[i][7]],
         fields[COLS[i][8]]
     };
         return col;
     }
 
     public int[] getFieldsInRow(int i){
         int[] row = new int[9];
         int offset=i*9;
         for (int n=0;n<9;n++){
             row[n]=fields[n+offset];
         }
         return row;
     }
     
     public int[] getFieldsInBox(int i){
         int[] box = new int[]{
             fields[BOXES[i][0]],
             fields[BOXES[i][1]],
             fields[BOXES[i][2]],
             fields[BOXES[i][3]],
             fields[BOXES[i][4]],
             fields[BOXES[i][5]],
             fields[BOXES[i][6]],
             fields[BOXES[i][7]],
             fields[BOXES[i][8]]
         };
         return box;
     }
     
     public static int getBoxFor(int i){
         return BOXARRAY[i];
     }
     
     public static int getColFor(int i){
       return COLARRAY[i];  
     }
     
     public static int getRowFor(int i){
         return ROWARRAY[i];
     }
     
     private boolean arrayIsValid(int[] a){
         int [] nums = new int[9];
         for (int i:a){
             if(i != 0){
                 nums[i-1]++;
                 if (nums[i-1]>1){
                     return false;
                 }
             }
         }
         return true;
     }
     
     public boolean isValid(){
         boolean rowBool,colBool,boxBool;
         int[] row, col, box, ret;
         for (int  i = 0;i<9;i++){
             row = getFieldsInRow(i);
             ret = needsOne(row);
             if (inArray(getFieldsInCol(ret[1]),ret[0])) return false; 
             
             col = getFieldsInCol(i);
             ret = needsOne(col);
             if (inArray(getFieldsInRow(ret[1]),ret[0])) return false; 
             
             box= getFieldsInBox(i);
             rowBool = arrayIsValid(row);
             colBool = arrayIsValid(col);
             boxBool = arrayIsValid(box);
             if (!(rowBool &&  colBool && boxBool)){
                 return false;
             }
         }
         return true;
     }
     
     
     private int[] needsOne(int[] a){
         int ret=-1;
         int count =0;
         int index = 0;
         for (int i = 0;i<9;i++){
             if (a[i]==0) {
                 count++;
                 ret = a[i];
                 index = i;
             }
         }
         ret = count == 1? ret : -1;
         int[] r = new int[]{ret,index};
         return r;
     }
     
     private boolean inArray(int[] a, int num){
         for(int i=0;i<9;i++){
             if(a[i] == num) return true;
         }
         return false;
     }
     
     public void setField(int index, int value){
         fields[index]=value;  
     }
     
     public int getField(int index){
         return fields[index];
     }
     
     public boolean isSolved(){
         for(int field:fields){
             if (field==0){
                 return false;
             }
         }
         return true;
     }
}