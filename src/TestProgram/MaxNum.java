package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class MaxNum {
    MaxNum(){
        Scanner s=new Scanner(System.in);
        int a,b,max;
        System.out.println("Program to display MAX number..");
        System.out.println("Enter two number..");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("1st Way..Using Ternary Operator..");
        max=(a>b)?a:b;
        System.out.println("Maximum Number = "+max);
        System.out.println("\n 2nd Way..Using Max Function...");
        System.out.println("MAX Num = "+Math.max(20,10));
        System.out.println("MAX Num = "+Math.max(1.5,2.5));
        System.out.println("\n 3rd Way..using if-else statement..");
        if(a>b)
            System.out.println(a+" is MAX Number");
        else
            System.out.println(b+" is MAX Number");
    }
    public static void main(String[] args) {
       MaxNum m=new MaxNum();
    }
}
