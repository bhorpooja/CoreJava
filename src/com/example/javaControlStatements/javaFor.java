package com.example.javaControlStatements;

/**
 * Created by i net on 09/08/2017.
 */
public class javaFor {

    void check() {
        System.out.println("Simple For Loop");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n Nested For Loop");
        System.out.println("Printing STAR pyramid");
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Printing Reverse STAR pyramid");
        for (i = 5; i >= 1; i--) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (i = 1; i <= 6; i++) {
            for (j = 1; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println("");
        for (i = 6; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }


    }

    void forEach() {
        String[] arr = {"1", "2", "3", "4"};
        for (String a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        javaFor j = new javaFor();
        j.check();
        j.forEach();
    }
}
