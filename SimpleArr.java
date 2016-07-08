package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vakula on 8.7.2016.
 */
public class SimpleArr {
    int[][] cubeArrInt;

    public SimpleArr() {
        this.cubeArrInt = new int [8][5];
        Random rnd  = new Random(10);

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                this.cubeArrInt[i][j] = rnd.nextInt(99);
            }
        }
    }



    @Override
    public String toString() {
        return "SimpleArr{" +
                "cubeArrInt=" + Arrays.deepToString(cubeArrInt) +
                '}';
    }
}
