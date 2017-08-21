package JavaConstructor;

import java.util.Scanner;

/**
 * Created by i net on 14/08/2017.
 */
public class Chaining
{
       static int a,b;
      // Scanner s=new Scanner(System.in);
        Chaining()
        {

       //  System.out.println("Enter Value of a : ");
      // a=s.nextInt();
      // this.a=a;
           System.out.println("Value of a : "+a);

        }
        Chaining(int b)
        {
            this();
        //    System.out.println("Enter Value of b : ");
          //  b=s.nextInt();
            System.out.println("Value of b : "+b);
            //System.out.println("Values are : "+a+" "+b);
        }
        Chaining(int a,int b)
        {
            this(b);
           // this.a=a;

            //add=a+b;
            System.out.println("Addition = "+(a+b));
        }

    public static void main(String[] args) {
        Chaining c=new Chaining(100,10);

    }
}
