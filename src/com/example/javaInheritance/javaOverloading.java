package com.example.javaInheritance;

/**
 * Created by pooja on 21/8/17.
 */
class Area{
             void area(int b,int h){
                int area=b*h;
                System.out.println("Area of Rectangle = "+area);
            }
           void area(double r){
                double area=3.14*(r*r);
                System.out.println("Area of Circle = "+area);
            }
           void area(int l){
                int area=l*l;
               System.out.println("Area of Square = "+area);
            }
        }
public class javaOverloading{
    public static void main(String[] args) {
        Area a=new Area();
        a.area(10,20);
        a.area(2.5);
        a.area(20);
    }
}
