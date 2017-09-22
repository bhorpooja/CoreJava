package com.example.javaConstructor;

/**
 * Created by i net on 09/08/2017.
 */
public class javaConstructor
{
    int a,b,add;

    javaConstructor() //default constructor
    {
        System.out.println("It's Default Constructor");
    }
    javaConstructor(int c,int d) //parameterized construcctor
    {
        System.out.println("It's parameterized constructor");
       a=c;
       b=d;
       add=a+b;

    }

    javaConstructor(javaConstructor jj)//using this constructor we access above constructor object
    {                                   //call constructor into another one
        System.out.println("copy the values of one object to another by using constructor");
        System.out.println("Here we call Parameterized Constructor");
        a=jj.a;
        b=jj.b;
        add=a+b;

    }
    void display()
    {
        System.out.println("Addition="+add);
    }

    public static void main(String[] args)
    {
        //call default constructor
       javaConstructor j=new javaConstructor();
        System.out.println();
       //call parameterized constructor
        javaConstructor j1=new javaConstructor(22,22);
        j1.display();
        System.out.println();
        //copy the values of one object to another by using constructor
        javaConstructor j2=new javaConstructor(j1);
        j2.display();
        System.out.println();
        //copy the values of one object to another by assigning
        // the values of one object into another
        //without using constructor
        javaConstructor j3=new javaConstructor(20,20);
        javaConstructor j4=new javaConstructor();
        j4.a=j3.a;
        j4.b=j3.b;
        j4.add=j3.add;
        j3.display();
        j4.display();



    }
}
