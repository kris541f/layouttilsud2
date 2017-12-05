package com.example.kristian.layouttilsud;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.example.kristian.layouttilsud.Solver;
import com.example.kristian.layouttilsud.Speculator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 *
 * @author erik
 */
class SolverThreadPool {
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);
    
    static Future submitMain(Solver solver){
        return executor.submit(solver);
    }
    
    static Future submitThread(Speculator s){
        return executor.submit(s);
    }

    static void shutDownNow() {
        executor.shutdownNow();
    }
    
}
