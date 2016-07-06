package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("Task 1: Count sum of all digits.");
        Scanner in = new Scanner(System.in);
        System.out.println("Input INT number 19 digits or less.");
        long someLong = in.nextLong();
        System.out.println("Sum of all digits is " + SumCounter.countSum(someLong));


        System.out.println("Task 2: Print count of members of Fibonacci sequence.");
        System.out.println("How many members of fibonacci sequence would you print? Input INT, please.");
        FibSeq someFS = new FibSeq(in.nextInt());
        someFS.printFibonacci();


        System.out.println("Task 3: How many lucky tickets in 6 digits seq.");
        TicketCounter tc = new TicketCounter();
        tc.countTickets();*/


        System.out.println("Task 4: Find symmetric combinations on clock [23:59].");
        Clock cl = new Clock();
        System.out.println("Symmetric combinations: " + cl.countSymm());

    }
}