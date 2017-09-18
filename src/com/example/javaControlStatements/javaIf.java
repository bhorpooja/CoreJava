package com.example.javaControlStatements;

import java.util.Scanner;

/**
 * Created by i net on 09/08/2017.
 */
public class javaIf {
    int a;
    Scanner s = new Scanner(System.in);

    void check() {
        System.out.println("  \n Simple IF Statement....");
        a = 10;
        if (a % 2 == 0)
            System.out.println("Number is EVEN");

    }
    void check1() {
        System.out.println("\n If-Else Statement....");
        System.out.println("Enter value to check....");
        a = s.nextInt();
        if (a % 2 == 0) {

            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }
    }



    void check2() {
        System.out.println(" \n If-else if Statement....");

        System.out.println("Enter Marks...");
        a = s.nextInt();
        if (a >= 65)
            System.out.println("Distinction...");
        else if (a < 65 && a >= 55)
            System.out.println("First Class...");
        else if (a < 55 && a >= 40)
            System.out.println("Second Class....");
        else
            System.out.println("Failed...");

    }

    void check3() {
        System.out.println(" \n  Nested If Statement....");
        System.out.println("Enter Marks...");
        a = s.nextInt();
        if (a >= 40) {
            if (a > 40 && a <= 64) {
                System.out.println("First Class...");
            } else if (a >= 65) {
                System.out.println("Distinction....");
            }

        } else
            System.out.println("Failed...");

    }

    void check4() {
        System.out.println(" \n  Double Nested If Statement....");
        System.out.println("Enter Number...");
        a = s.nextInt();
        if (a >= 40) {
            if (a >= 40 && a <= 64) {
                if (a % 2 == 0)
                    System.out.println("First Class....EVEN NUM");
                else
                    System.out.println("First Class....ODD NUM");
            } else if (a >= 65) {
                if (a % 2 == 0)
                    System.out.println("Distinction....EVEN NUM");
                else
                    System.out.println("Distinction....ODD NUM");
            }

        } else
            System.out.println("Failed...");

    }

    public static void main(String[] args) {
        javaIf j=new javaIf();
        j.check();
        j.check1();
        j.check2();
        j.check3();
        j.check4();

    }
}
