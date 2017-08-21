package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class FibonacciSeries {
    FibonacciSeries(){
        Scanner s = new Scanner(System.in);
        int n1=0, n2=1, n3, count;
        System.out.println("Program to display fibonacci series upto count..");
        System.out.println("Enter count for fibonacci series..");
        count=s.nextInt();
        System.out.print(n1+" "+n2);
        for (int i=0;i<count;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[] args) {
       FibonacciSeries f=new FibonacciSeries();
    }

}
