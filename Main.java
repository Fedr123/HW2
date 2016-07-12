package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*System.out.println("Task 1: Count sum of all digits.");

        System.out.println("Input INT number 19 digits or less.");
        long someLong = in.nextLong();
        System.out.println("Sum of all digits is " + SumCounter_Task1.countSum(someLong));


        System.out.println("Task 2: Print count of members of Fibonacci sequence.");
        System.out.println("How many members of fibonacci sequence would you print? Input INT, please.");
        FibSeq someFS = new FibSeq(in.nextInt());
        someFS.printFibonacci();


        System.out.println("Task 3: How many lucky tickets in 6 digits seq.");
        TicketCounter tc = new TicketCounter();
        tc.countTickets();


        System.out.println("Task 4: Find symmetric combinations on clock [23:59].");
        Clock cl = new Clock();
        System.out.println("Symmetric combinations: " + cl.countSymm());


        System.out.println("Task 5: Print random array [8][5]");
        SimpleArr sa = new SimpleArr();
        System.out.println(sa.toString());


        System.out.println("Task 6: Print random array [7][5]");
        System.out.println("Find string with max multiplication by module");
        ComplexArr ca = new ComplexArr();
        System.out.println(ca.toString());
        System.out.println ("Max mult: " + ca.findBiggestMult()[0]);
        System.out.println ("Index of str: " + ca.findBiggestMult()[1]);


        System.out.println("Task 7: Find sum form 1 to N.");
        System.out.println("Input int number, please.");
        System.out.println("Sum from 0 to N = " + SumCounter_Task7.countSum(in.nextInt()));


        System.out.println("Task 8: How many times we have to find 4'th member of fibonacci series for counting 15'th member?");
        System.out.println("Task 8: But I find it once. For 15'th member i need only 14'th & 13'th members.");


        System.out.println("Task 9: Output all simple numbers from 2 to N.");

        SimpNum sn = new SimpNum(in.nextInt());
        System.out.println(sn.toString());*/


        System.out.println("Task 10: Put N circles from 1 tower to another.\n" +
                " Use 1 additional tower. 1 change in 1 step. Put smaller on bigger circle, only.");
        System.out.println("Input int number of circles, please.");
        int n = in.nextInt();
        Tower tw = new Tower(n);
        tw.tower(n);

    }
}