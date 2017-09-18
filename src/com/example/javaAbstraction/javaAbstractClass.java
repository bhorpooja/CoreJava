package com.example.javaAbstraction;

/**
 * Created by pooja on 31/8/17.
 */
abstract class Demo{
    Demo(){
        System.out.println("Abstract class constructor");
    }
    abstract void show();
    void disp(){
        System.out.println("concrete method");
    }

}
public class javaAbstractClass {



    public static void main(String[] args) {

        Demo d=new Demo() {
        @Override
        void show() {
            System.out.println("java abstract method");
        }
        @Override
        void disp() {
            super.disp();
            System.out.println("hiii");
        }
    };
     d.show();
     d.disp();
    }

//    @Override
//    void show() {
//
//    }
}
