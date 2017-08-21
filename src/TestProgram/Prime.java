package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class Prime {
    Prime(){
        Scanner s=new Scanner(System.in);
        int num,m,flag=0;
        System.out.println("Program to display given number is prime or not..??");
        System.out.println("Enter number to check..");
        num=s.nextInt();
        m=num/2;
        for (int i=2;i<=m;i++)
        {
            if(m%i==0){
                System.out.println(num+" is not Prime Number");
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println(num+" is Prime Number");
        }


    }
    public static void main(String[] args) {
       Prime p=new Prime();
    }
}
