package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class Palindrome {
    void palindrome(){
        Scanner s=new Scanner(System.in);
        int num,temp,rem,sum=0;
        System.out.println("Program to display given number is palindrome or not..?? ");
        System.out.println("Enter Number to check..");
        num=s.nextInt();
        temp=num;
        while (num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+" is Palindrome Number");
        }
        else
        {
            System.out.println(temp+" is Not Palindrome Number");

        }
    }
    public static void main(String[] args) {
       Palindrome p=new Palindrome();
       p.palindrome();
    }
}
