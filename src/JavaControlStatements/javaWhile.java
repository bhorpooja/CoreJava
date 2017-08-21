package JavaControlStatements;

import java.util.Scanner;

/**
 * Created by i net on 09/08/2017.
 */
public class javaWhile {
    Scanner s = new Scanner(System.in);

    void palindrome() {
        int num, n = 0, rem;

        System.out.println("Enter no. to check whether it is palindrome or not");
        num = s.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            n = (n * 10) + rem;
            num = num / 10;
        }
        if (n == temp) {
            System.out.println(" Number is Palindrome");
        } else {
            System.out.println(" Number is not Palindrome");
        }

    }

    void armstrong() {
        int num, sum = 0, temp, rem;
        System.out.println("\n Enter no. to check whether it is Armstrong or not");
        num = s.nextInt();
        temp = num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + (rem * rem * rem);
        }
        if (temp == sum) {
            System.out.println("Number is Armstrong Number");
        } else {
            System.out.println("Number is Not Armstrong Number");
        }

    }

    void factorial() {
        int num, fact = 1, temp;
        System.out.println("\n Enter number for factorial");
        num = s.nextInt();
        temp = num;
        while (num > 0) {
            fact = fact * num;
            num = num - 1;
        }
        System.out.println(" Factorial of " + temp + " is " + fact);

    }

    void fibonacci() {
        int n1 = 0, n2 = 1, n3, cnt;
        System.out.println("\n Enter count num for fibonacci series");
        cnt = s.nextInt();
        System.out.println(n1 + " " + n2);
        for (int i = 2; i < cnt; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    void bubblesort() {
        int n;
        System.out.println("\n Enter num of array element u want");
        n = s.nextInt();
        int[] num = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        System.out.println("Array element");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        for (int k = 0; k < num.length; k++) {
            int len = num.length;
            int temp = 0;
            for (int i = 0; i < len; i++) {
                for (int j = 1; j < (len - i); j++) {
                    if (num[j] < num[j - 1]) {
                        temp = num[j - 1];
                        num[j - 1] = num[j];
                        num[j] = temp;
                    }
                }
            }

        }
        System.out.println("\n Array after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
    void prime()
    {
        int num,m,flag=0;
        System.out.println("\n Enter number to check whether it is prime or not");
        num=s.nextInt();
        m=num/2;
        for (int i=2;i<=m;i++)
        {
            if (num%2==0)
                System.out.println(num+" Is not Prime");
                flag=1;
                break;
        }
        if (flag==0)
        {
            System.out.println(num+" Is Prime");
        }
    }

    public static void main(String[] args) {
        javaWhile j = new javaWhile();
        j.palindrome();
        j.armstrong();
        j.factorial();
        j.fibonacci();
        j.bubblesort();
        j.prime();

    }
}
