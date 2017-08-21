package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class ChangeSign {

    void show()
    {
        Scanner s=new Scanner(System.in);
        int x1=10,x2=-10;
        System.out.println("Program to convert +ve number to -ve number & vice versa..");
        System.out.println("Value of x1 = "+x1+"\nValue of x2 = "+x2);
        System.out.println("\nConverting +ve to -ve by assigning '-' sign");
        System.out.println("or by multiplying by -1");
        //x1=-x1;
        x1=x1*(-1);
        System.out.println(x1);
        System.out.println("\nConverting -ve to +ve using absolute math function..");
        int a=Math.abs(x2);
        System.out.println(a);
        System.out.println("\nConverting -ve to +ve by taking -ve num");
        x1=x1*(-1);
        System.out.println(x1);

    }

    public static void main(String[] args) {
    ChangeSign c=new ChangeSign();
    c.show();
    }
}