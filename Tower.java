package com.company;

import java.util.Stack;

/**
 * Created by vakula on 10.7.2016.
 */
public class Tower {
    Stack<Integer> start;
    Stack<Integer> fin;
    Stack<Integer> tmp;
    int step;



    public Tower(int n) {
        this.step = 0;
        this.fin = new Stack<>();
        this.tmp = new Stack<>();
        this.start = new Stack<>();
        for (; n > 0; n--){
            start.push(n);
        }
        System.out.println(this.toString());
    }

    public void tower (int n){

        this.tower(n, this.start, this.fin, this.tmp);
    }


    public void tower (int n, Stack start, Stack fin, Stack tmp){
        if (n > 0) {
            tower(n-=1, start, tmp, fin);

            fin.push(start.pop());
            step++;
            System.out.println(this.toString());

            tower(n, tmp, fin, start);
        }
    }


    @Override
    public String toString() {
        return  "\nStep " + step + ":" +
                "\n  start=" + start +
                "\n  fin=" + fin +
                "\n  tmp=" + tmp ;
    }
}
