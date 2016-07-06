package com.company;

import java.util.ArrayList;

/**
 * Created by vakula on 6.7.2016.
 */
public class Clock {
    final int MAX_LEFT = 23;
    final int MAX_RIGHT = 59;

    ArrayList<String> leftArr;
    ArrayList<String> rightArr;

    public Clock() {
        this.leftArr = new ArrayList<>(MAX_LEFT);
        this.rightArr = new ArrayList<>(MAX_LEFT);

        for (int i = 0; i <= MAX_LEFT; i++){
            String currValue = String.valueOf(i);
            if (currValue.length() == 1){
                currValue = "0" + currValue;
            }
            this.leftArr.add(i, currValue);
            currValue = currValue.substring(1) + currValue.substring(0, 1);
            this.rightArr.add(i, currValue);
        }
    }

    public int countSymm () {
        for (int i = 0; i < this.rightArr.size(); i++) {
            if (Integer.parseInt(this.rightArr.get(i)) > MAX_RIGHT) {
                this.rightArr.remove(i);
                i--;
            }
        }
        this.rightArr.trimToSize();
        return this.rightArr.size();
    }
}
