package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class DecimalToBinary {
    void DecToBin(){
        Scanner s = new Scanner(System.in);
        int num, rem, temp;
        String binary="";
        System.out.println("Program to find binary equivalent of decimal..");
        System.out.println("Enter number..");
        num=s.nextInt();
        while (num>0)
        {
            rem=num%2;
            binary=rem+binary;
            num=num/2;
        }
        System.out.println(binary);
        System.out.println("By using predefined function");
        System.out.println(Integer.toBinaryString(29));

    }
    public static void main(String[] args) {
       DecimalToBinary d=new DecimalToBinary();
       d.DecToBin();
    }
}
