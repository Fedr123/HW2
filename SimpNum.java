package com.company;

import java.util.ArrayList;

/**
 * Created by vakula on 10.7.2016.
 */
public class SimpNum {

    ArrayList<Integer> simpNumAL ;

    public SimpNum(int n) {
        this.simpNumAL = new ArrayList<>();
        countSimpleNumbers(n);
    }

    private void countSimpleNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (this.isSimple(i)) {
                this.simpNumAL.add(i);
            }
        }
    }

    private boolean isSimple(int n) {
        for (int i = n / 2 + 1; i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Simpe numbers from 2 to N:" + simpNumAL.toString();
    }

}