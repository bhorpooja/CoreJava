package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class Armstrong {
    void show(){
        Scanner s=new Scanner(System.in);
        int num,rem,temp,sum=0;
        System.out.println("Program to display given number is armstrong or not..??");
        System.out.println("Enter Number to check..");
        num=s.nextInt();
        temp=num;
        while (num>0){
            rem=num%10;
            num=num/10;
            sum=sum+(rem*rem*rem);
        }
        if (temp==sum)
        {
            System.out.println(temp+" is Armstrong Number");
        }
        else
        {
            System.out.println(temp+" is Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
       Armstrong a=new Armstrong();
       a.show();

    }
}
