package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class nEvenOdd {
    nEvenOdd(){
        Scanner s=new Scanner(System.in);
        int n,even=0,odd=0;
        System.out.println("Program to display Even & Odd Numbers between 1 to n..");
        System.out.println("Enter value of n..");
        n=s.nextInt();
        System.out.println("EVEN Numbers..");
        for (int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                ++even;
            }

        }
        System.out.println("");
        System.out.println("ODD Numbres..");
        for (int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                ++odd;
            }
        }
        System.out.println("");
        System.out.println("You have "+even+" EVEN Numbers within "+n+" Numbres");
        System.out.println("You have "+odd+" ODD Numbers within "+n+" Numbres");

    }
    public static void main(String[] args) {
        nEvenOdd e=new nEvenOdd();
    }
}
