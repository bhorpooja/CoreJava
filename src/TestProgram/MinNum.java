package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class MinNum {
    MinNum(){
        Scanner s=new Scanner(System.in);
        int a,b,c,min;
        System.out.println("Program to display minimum number between 3 numbers..");
        System.out.println("Enter three numbers..");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("\n Using If-elseIf Statement..");
        if (a<b && a<c)
            System.out.println(a+" is Minimum Number");
        else if(b<a && b<c)
            System.out.println(b+" is Minimum Number");
        else
            System.out.println(c+" is Minimum Number");
        System.out.println("Using Min Function..");
        System.out.println("MIN Num = "+Math.min(a,Math.min( b,c)));
        System.out.println("Using If Statement");
        min=a;
        if(b<min)
            min=b;
        if (c<min)
            min=c;
        System.out.println("MIN Num = "+min);

    }
    public static void main(String[] args) {
        MinNum m=new MinNum();

    }
}
