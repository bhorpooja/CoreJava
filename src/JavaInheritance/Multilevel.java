package JavaInheritance;

import java.util.Scanner;

/**
 * Created by i net on 14/08/2017.
 */
public class Multilevel {
    Scanner s=new Scanner(System.in);
    int a,b,add;
    void get()
    {
        System.out.println("Enter Values:");
        a=s.nextInt();
        b=s.nextInt();
    }

}
class child1 extends Multilevel
{
    void display()
    {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        add=a+b;
    }
}
class subchild extends child1
{
    void result()
    {
        System.out.println("Addition = "+add);
    }

    public static void main(String[] args) {
        subchild s=new subchild();
        s.get();
        s.display();
        s.result();
    }
}
