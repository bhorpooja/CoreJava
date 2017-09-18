package com.example.javaArray;

import java.util.Scanner;

/**
 * Created by pooja on 1/9/17.
 */
class multiArray {

    Scanner s = new Scanner(System.in);
    int i, j, n = 0,len=0;

    int[][] get() {

        System.out.println("Enter size of array");
        n = s.nextInt();
        System.out.println("Enter array element");
        int[][] arr = new int[n][n];
        len = arr.length;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
        void printArray(){
         int[][] arr=get();
            System.out.println("Actual Array");
            for (i = 0; i < len; i++) {
                for (j = 0; j < len; j++) {
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println("");
            }
            System.out.println("Left Diagonal Element of array");
            for (i = 0; i < len; i++) {
                for (j=0; j < len; j++){
                    if (i==j)
                        System.out.print(arr[i][j]);
                    System.out.print("  ");
                }
                System.out.println("");
            }
            System.out.println("Right Diagonal Element of array");
            for (i = 0; i <= len; i++) {
                for (j=0; j <=len; j++){
                    if(i+j==len-1){
                        System.out.print(arr[i][j]);
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println("");

            }
    }



    void arraySort() {
        int[] arr = {3, 4, 2, 5, 6, 1};
        len = arr.length;
        int temp, min;
        System.out.println("Before sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (i = 0; i < len; i++) {
            for (j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    void arrayMin1()
    {
        int[] arr = {3, 4, 2, 5, 6, 1};
        int[] arr1={0};
        len = arr.length;
        int min=0,flag=0;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    min = arr[j+1];
                    flag=1;
                    continue;
                }
            }
        }
        if(flag==1){
            System.out.println("MINIMUM Element = "+min);
        }
        else
            System.out.println("wrong result");

    }
    void arrayMin2()
    {
        int[] arr = {3, 4, 2, 5, 6, 1};
        int[] arr1={0};
        len = arr.length;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr1[0] = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=arr1[0];
                }
            }
        }
        System.out.println("Minimum Array Element : "+arr1[0]);

    }

}
public class javaArrayDemo {
    public static void main(String[] args) {
        multiArray m=new multiArray();
        m.printArray();
       // m.arraySort();
       // m.arrayMin1();
        //m.arrayMin2();
    }

}
