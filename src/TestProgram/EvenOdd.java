package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class EvenOdd {
    EvenOdd(){
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("Program to check given number is EVEN or ODD..??");
        System.out.println("Enter number to check..");
        num=s.nextInt();
        if (num%2==0)
        {
            System.out.println(num+" is EVEN Number");
        }
        else
        {
            System.out.println(num+" is ODD Number");

        }
    }
    public static void main(String[] args) {
        EvenOdd e=new EvenOdd();
    }
}
