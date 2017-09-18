package com.example.javaInheritance;

/**
 * Created by i net on 14/08/2017.
 */
public class Heirarchical {
     String clg="SVCET";

}
class sub1 extends Heirarchical
{
    void show()
    {
        System.out.println("My college name is : "+clg);
    }
}
class sub2 extends Heirarchical
{
    void change()
    {
        clg="COEP";
        System.out.println("My college name = "+clg);
    }
}
 class call {
     public static void main(String[] args) {
         sub1 s=new sub1();
         s.show();
         sub2 ss=new sub2();
         ss.change();
     }
 }