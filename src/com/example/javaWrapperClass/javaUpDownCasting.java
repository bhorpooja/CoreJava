package com.example.javaWrapperClass;

/**
 * Created by i net on 17/08/2017.
 */
class Animal{
    void show1()
    {
        System.out.println("It's parent class");
    }
}
class Dog extends Animal{
    void show()
    {
        System.out.println("It's child class");
    }
}
public class javaUpDownCasting {
    public static void main(String[] args) {
        System.out.println("Here we done UpCasting.. i.e. subClass method upCasted by parentClass ");
        Animal a=new Dog();
        a.show1();
       System.out.println("Down Casting.. i.e. parentClass method is downCasted by subClass");
        Animal aa=new Dog();
        Dog d=(Dog) aa;
        d.show1();
       d.show();
        System.out.println("Change");
    }

}
