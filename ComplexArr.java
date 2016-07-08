package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vakula on 8.7.2016.
 */
public class ComplexArr {
    int[][] cubeArrInt;

    public ComplexArr() {
        this.cubeArrInt = new int [7][4];
        Random rnd  = new Random();

        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 4; j++){
                this.cubeArrInt[i][j] = -5 + rnd.nextInt(10);
            }
        }
    }

    public int[] findBiggestMult (){
        int[] multArr = {1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < 7; i++){
            for (int j: this.cubeArrInt[i]){
                multArr[i] *= j;
            }
            multArr[i] = multArr[i];
            if (multArr[i] < 0 ){
                multArr[i] *= -1;
            }
        }
        int max = -1;
        int index = 0;
        for (; index < 7; index++ ){
            if (max < multArr[index]){
                max = multArr[index];
            }
        }

        return new int[] {max, index};
    }



    @Override
    public String toString() {
        return "ComplexArr{" +
                "cubeArrInt=" + Arrays.deepToString(cubeArrInt) +
                '}';
    }
}
