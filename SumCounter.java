package com.company;

/**
 * Created by vakula on 5.7.2016.
 */

/// Task_1
public  class SumCounter {


    static public int countSum (Long someLong){
        int sum = 0;

        for (char c : someLong.toString().toCharArray()){
            String digit = String.valueOf(c);
            sum += Integer.valueOf(digit);
        }

        return sum;
    }
}
