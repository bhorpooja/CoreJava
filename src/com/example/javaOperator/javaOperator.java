package com.example.javaOperator;

/**
 * Created by i net on 10/08/2017.
 */
public class javaOperator {
    void unaryOperator() {
        int a = 10, b = 10;
        System.out.println("Unary Operator Eg.1 ++ & --");
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println("\nUnary Operator Eg.2 ++ & --");
        a = 10;
        b = 10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);
        System.out.println("\nUnary Operator Eg. ~ & !");
        a = 10;
        b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true


    }
    void arithmaticOperator()
    {
        int a=10,b=10,res;
        System.out.println("\nArithmatic Operator Eg. + - * /");
        System.out.println("Addition="+(a+b));
        System.out.println("Subtraction="+(a-b));
        System.out.println("Multiplication="+(a*b));
        System.out.println("Division="+(a/b));
    }
    void shiftOperator()
    {
        System.out.println("\nShift Operator Eg. << & >>");
        System.out.println("Left Shift Operator");
        System.out.println(10<<2);
        System.out.println("Right Shift Operator");
        System.out.println(10>>2);
    }
    void ternaryOperator()
    {
        System.out.println("\nTernary Operator Eg. ? :");
        int a=5,b=10;
        int max=(a>b)?a:b;
        System.out.println("Answer="+max);
    }
    void assignmentOperator()
    {
        System.out.println("\nAssignment Operator Eg. =");
        int a=10,b=10;
        a+=4;
        b-=4;
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);

    }

    public static void main(String[] args) {
        javaOperator j = new javaOperator();
        j.unaryOperator();
        j.arithmaticOperator();
        j.shiftOperator();
        j.ternaryOperator();
        j.assignmentOperator();
    }
}
