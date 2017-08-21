package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 15/08/2017.
 */
public class perfectSquare {
    void display(){
        Scanner s=new Scanner(System.in);
        int n,m,root,count=0;
        System.out.println("Program to find perfect square number within range n to m..");
        System.out.println("Enter value for n and m..");
        n=s.nextInt();
        m=s.nextInt();
        System.out.println("Perfect Square Numbers");
        for (int i=n;i<=m;i++)
        {
            // int num=i;
            root= (int) Math.sqrt(i);
            if((root*root)==i) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n Total Perfect Square Numbers are = "+count);

    }
    public static void main(String[] args) {
        perfectSquare p=new perfectSquare();
        p.display();
      }
}
