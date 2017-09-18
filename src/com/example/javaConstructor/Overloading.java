package com.example.javaConstructor;

/**
 * Created by i net on 14/08/2017.
 */
public class Overloading
{
    Overloading()
    {
        System.out.println("It's Default Constructor");
    }
    Overloading(int a)
    {
        System.out.println("It's int type single parameterized constructor : "+a);
    }
    Overloading(int a,int b)
    {
        System.out.println("It's int type double parameterized constructor : "+(a+b));
    }
    Overloading(String s)
    {
        System.out.println("It's string type parameterized constructor : "+s);
    }
    public static void main(String[] args)
    {
        Overloading o=new Overloading();
        Overloading o1=new Overloading(10);
        Overloading o2=new Overloading(10,10);
        Overloading o3=new Overloading("Pooja");
    }

}
