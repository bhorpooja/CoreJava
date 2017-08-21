package JavaInheritance;

import java.util.Scanner;

/**
 * Created by i net on 14/08/2017.
 */
public class Hybrid {
    Scanner s=new Scanner(System.in);
    int a=10,b=10;
}
class ch extends Hybrid
{
    void show()
    {
        System.out.println("Value of a : "+a);
    }
}
class ch1 extends Hybrid
{
    void show()
    {
        System.out.println("Value of b : "+b);
    }
}
class ch2 extends ch
{

    void show1()
    {
        System.out.println("Enter value of b : ");
        int b=s.nextInt();
        int add=a+b;
        System.out.println("ADDITION = "+add);
    }
}
class test
{
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        ch c=new ch();
        c.show();
        ch1 cc=new ch1();
        cc.show();
        System.out.println("\n Single Inheritance");
        ch2 ccc=new ch2();
        ccc.show();
        ccc.show1();
    }
}