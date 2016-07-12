package com.company;

/**
 * Created by vakula on 10.7.2016.
 */
public class SumCounter_Task7 {

    public static long countSum (int n){
        long sum = 0;
        for (; n > 0; n--){
            sum += n;
        }
        return sum;
    }
}
