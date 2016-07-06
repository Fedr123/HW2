package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vakula on 5.7.2016.
 */
public class TicketCounter {
    private final int DIGITS = 6;


    public void countTickets () {
        int count = 0;
        Map<Integer, Integer> SumsHM = new HashMap<Integer, Integer>(27);

        for (int j = 0; j < 28; j++) {
            SumsHM.put(j, 0);
        }

        for (int i = 0; i < 1000; i++) {
            int key = i % 10
                    + i / 10 % 10
                    + i / 100;
            SumsHM.put(key, SumsHM.get(key) + 1);
        }

        for (int v : SumsHM.values()) {
            count = count + v*v;
        }
        System.out.println(count);

    }
}
