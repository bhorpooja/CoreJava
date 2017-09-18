package com.example.javaString;

/**
 * Created by i net on 17/08/2017.
 */
public class StringDemo4 {
    void show(){
        System.out.println("String compareTo() Method");
        String s1="pooja";
        String s2="poojaBhor";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println("contains() : matching seq. of char value");
        System.out.println(s1.contains(s2));
        System.out.println(s1.contentEquals(s2));
    }

    public static void main(String[] args) {
        StringDemo4 s=new StringDemo4();
        s.show();
    }
}
