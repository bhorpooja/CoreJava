package com.example.JavaExceptionHandling;

/**
 * Created by pooja on 19/9/17.
 */
class FinallyExample{
    void check1(){
        try {
           int num=25/5;
            System.out.println(num);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code");

    }
    void check2(){
        try {
            int a=10;
            int res=a/0;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println("Exception Handled");
        }
        finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("rest of code");
    }
    void check3(){
        try {
            int num=100/0;
            System.out.println(num);
        }
        catch (NullPointerException e){
            System.out.println(e);
            }
            finally {
            System.out.println("finally block is executed");
        }
        System.out.println("rest of code");
    }
}
public class FinallyDemo {
    public static void main(String[] args) {
        FinallyExample f=new FinallyExample();
        System.out.println("CASE 1-exception doesn't occur");
        f.check1();
        System.out.println("\nCASE 2-exception occur & handled");
        f.check2();
        System.out.println("\nCASE 3-exception occur & not handled");
        f.check3();
    }

}
