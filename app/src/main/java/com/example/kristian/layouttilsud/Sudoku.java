/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kristian.layouttilsud;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 *
 * @author erik
 */
public class Sudoku {

    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        PuzzleGenerator pg = new PuzzleGenerator();
        Puzzle p = pg.getPuzzle();
        System.out.println("Solving: \n" + p.toString());
        Solver s = new Solver(p);
        Future response  = s.start();
        Puzzle solution = (Puzzle) response.get();
        System.out.println(solution.toString());
    }
    
}
