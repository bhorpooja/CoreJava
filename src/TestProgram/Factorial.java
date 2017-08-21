package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class Factorial {
    Factorial(){
        Scanner s=new Scanner(System.in);
        int num,fact=1,temp;
        System.out.println("Program to display factorial of given number..");
        System.out.println("Enter the Number..");
        num=s.nextInt();
        temp=num;
        while (num>0)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial of "+temp+" is = "+fact);


    }
    public static void main(String[] args) {
       Factorial f=new Factorial();
    }
}
