package com.company;

import java.util.ArrayList;

/**
 * Created by vakula on 5.7.2016.
 */

//Task_2
public class FibSeq {

    private ArrayList <Integer> fibAL;

    public FibSeq(Integer  num) {
        fibAL = new ArrayList<>(num);
        fibAL.add(0, 1);
        fibAL.add(1, 1);
        for (int i = 2; i < num; i++){
            fibAL.add(i, fibAL.get(i-2) + fibAL.get(i-1));
        }
    }

    public void printFibonacci() {
        System.out.print("Fib seq: ");
        for (Integer i : this.fibAL) {
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println();
    }
}
