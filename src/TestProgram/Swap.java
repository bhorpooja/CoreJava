package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 11/08/2017.
 */
public class Swap {
    Swap(){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Swapping of two number without using Temporary Variable");
        System.out.println("Enter two Numbers");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Value of a : "+a+" Value of b : "+b);
        System.out.println("After Swapping : ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a : "+a+" Value of b : "+b);


    }
    public static void main(String[] args) {
       Swap s=new Swap();
    }
}
