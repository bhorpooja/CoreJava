package com.example.javaControlStatements;

import java.util.Scanner;

/**
 * Created by i net on 09/08/2017.
 */
public class javaSwitch {
    int ch, a;
    Scanner s = new Scanner(System.in);

    void swich() {
        System.out.println("Switch Program");
        System.out.println("Enter Num to perform operation...");
        a = s.nextInt();
        do {
            System.out.println("\n 1.EVEN/ODD\n2.Result\n3.Print STAR\n4.Exit");
            System.out.println("\n Enter ur choice");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    if (a % 2 == 0)
                        System.out.println("\n EVEN NUM");
                    else
                        System.out.println("\n ODD NUM");
                    break;
                case 2:
                    if (a >= 40) {
                        if (a > 40 && a <= 64) {
                            System.out.println("\n First Class...");
                        } else if (a >= 65) {
                            System.out.println("\n Distinction....");
                        }

                    } else
                        System.out.println("\n Failed...");
                    break;
                case 3:
                    int i, j, k, ch1;

                    do {
                        System.out.println("\n 1.Triangle\n2.Reverse\n3.Exit");
                        System.out.println("\n Enter ur choice");
                        ch1 = s.nextInt();
                        switch (ch1) {
                            case 1:
                                for (i = 1; i <= a; i++) {
                                    for (j = a; j >= i; j--) {
                                        System.out.print(" ");
                                    }
                                    for (k = 1; k <= (2 * i - 1); k++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                for (i = a; i >= 1; i--) {
                                    for (j = a; j >= i; j--) {
                                        System.out.print(" ");
                                    }
                                    for (k = 1; k <= (2 * i - 1); k++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                swich();
                                return;
                            default:
                                System.out.println("\n Invalid Choice");
                        }

                    } while (ch1 <= 3);
                    break;

                case 4:
                    return;
                default:
                    System.out.println("\n Invalid choice");
            }
        } while (ch <= 4);

    }


    public static void main(String[] args) {
        javaSwitch j = new javaSwitch();
        j.swich();
    }
}
