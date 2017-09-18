package com.example.javaString;

/**
 * Created by i net on 17/08/2017.
 */
public class StringDemo2 {
    void show(){
        //string concatenation
        String a="Pooja";
        System.out.println("String Concatenation");
        a.concat("Bhor");
        System.out.println(a);//print "Pooja" bcz string is immutable object
        a=a.concat("Bhor");
        System.out.println(a);//print "PoojaBhor" bcz we pass reference variable
    }
    public static void main(String[] args) {
       StringDemo2 s=new StringDemo2();
       s.show();

    }
}
