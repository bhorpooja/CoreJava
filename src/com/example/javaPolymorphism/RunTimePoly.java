package com.example.javaPolymorphism;

/**
 * Created by pooja on 28/8/17.
 */
class Animal{
    static String name="MOTI";
    //final String type;
    Animal()
    {
        System.out.println("In animal Constructor");
        //type = null;
    }
    Animal(final String type)
    {
        this();
        System.out.println("Aniaml Type : "+type);
    }
    void eat()
    {
        System.out.println("Animal is eating....");
    }
    void eat1()
    {
        System.out.println("Animal Eating");
    }
}
class Dog extends Animal{
    Dog(){

        System.out.println("In dog Constructor");
    }
   void eat(){
       System.out.println(name+" is eating....");
   }
}
public class RunTimePoly {
    public static void main(String[] args) {
        System.out.println("Compile Time Polymorphism....");
        Animal a1=new Animal("PET Animal");
       a1.eat();
        a1.eat1();
        System.out.println("Run Time Polymorphism....");
        Animal a2=new Dog();
        a2.eat1();
        a2.eat();


}

}
