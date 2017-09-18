package com.example.javaInnerClass;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * Created by i net on 15/08/2017.
 */
public class staticInnerClass {
    static String name="Pooja";

    private static int i=10;

     static void show(){
         System.out.println("Static Outer Class Method "+name);
     }
     static class inner {
            static void display() {
                show();
                System.out.println("Static Inner Class "+i);

            }
        }



    public static void main(String[] args) {

       inner i=new inner();

        i.display();



    }
}
