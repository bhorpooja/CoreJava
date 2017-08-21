package TestProgram;

import java.util.Scanner;

/**
 * Created by i net on 16/08/2017.
 */
public class Student {
    void Class()
    {
        Scanner s = new Scanner(System.in);
        int n = 6,mark=0;
        int percentage;
        int[] marks = new int[n];
        System.out.print("Enter marks of subjects : ");
        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt();

        }
        System.out.print("Display Marks : ");
      for (int i = 0; i < n; i++) {
          System.out.print(marks[i] + " ");
      }
      for(int num:marks) {
          mark=mark+num;
      }
        System.out.println("");
        System.out.println("Total Marks = "+mark);
        percentage=(mark/6);
        System.out.println("Percentage = "+percentage+"%");
        if (percentage>40)
        {
              if(percentage>=40 && percentage<=65)
                    System.out.println("First Class");
              if(percentage>65)
                    System.out.println("Distinction");

        }
        else
        {
            System.out.println("You are failed..");
        }


    }
    public static void main(String[] args) {
        Student s=new Student();
        s.Class();

    }
}
