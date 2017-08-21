package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 11/08/2017.
 */
public class Time {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program to display number in hrs, min & sec Form");
        System.out.println("Enter Second");
        int num = s.nextInt();
        int hr,min,sec;
        sec=num%60;
        num=num/60;
        min=num%60;
        hr=num/60;
        System.out.print(hr+":"+min+":"+sec);


    }



}
