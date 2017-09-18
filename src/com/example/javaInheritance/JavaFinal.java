package com.example.javaInheritance;

/**
 * Created by pooja on 28/8/17.
 */
final class Fanal1{
    final int a;
    Fanal1(){
        a=10;
    }
     final void show(final int b){
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
     }
}
public class JavaFinal {
    public static void main(String[] args) {
        Fanal1 f=new Fanal1();
        f.show(20);
    }
}
