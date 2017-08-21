package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class DecimalToOctal {
    void DecToOct(){
        Scanner s = new Scanner(System.in);
        int num, rem, temp;
        String binary="";
        System.out.println("Program to find octal equivalent of decimal..");
        System.out.println("Enter number..");
        num=s.nextInt();
        while (num>0)
        {
            rem=num%8;
            binary=rem+binary;
            num=num/8;
        }
        System.out.println(binary);
        System.out.println("By using predefined function");
        System.out.println(Integer.toOctalString(5496));

    }
    public static void main(String[] args) {
        DecimalToOctal d=new DecimalToOctal();
        d.DecToOct();
    }
}
