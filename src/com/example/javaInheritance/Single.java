package com.example.javaInheritance;

/**
 * Created by i net on 14/08/2017.
 */
public class Single
{
    String name="Pooja";
    void name()
    {
        System.out.println("Hii... My name is : ");
    }
}
 class child extends Single{

    void display()
    {
        System.out.print(super.name);
    }
     public static void main(String[] args) {
         child c=new child();
         c.name();
         c.display();
     }
 }
