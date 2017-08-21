package JavaConstructor;

import java.util.Scanner;

/**
 * Created by i net on 09/08/2017.
 */
public class javaStatic
{
    static String clg_name = "SVCET";
    int roll_no;
    String name;
    Scanner s = new Scanner(System.in); //static var

    static void data()
    { //static method
        System.out.println("College Name:" + clg_name);
    }
    static void change()
    {
        clg_name="COEP";
    }
     javaStatic(int r, String nm) {
        roll_no = r;
        name = nm;
        System.out.println("Roll Num:" + roll_no + "\t Name:" + name + "\t College Name:" + clg_name);
    }

    void display() {

        System.out.println("Enter Roll Num");
        roll_no = s.nextInt();
        System.out.println("Enter Name");
        name = s.next();
        System.out.println("Roll Num:" + roll_no + "\t Name:" + name + "\t College Name:" + clg_name);


    }
    public static void main(String[] args) {
        javaStatic.data(); //static method call
        javaStatic.change();
        javaStatic j = new javaStatic(1,"pooja");
        j.display();


    }




}
