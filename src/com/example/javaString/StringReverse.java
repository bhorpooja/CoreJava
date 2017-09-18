package com.example.javaString;

import java.io.IOException;

/**
 * Created by pooja on 29/8/17.
 */
public class StringReverse {
   static String str="pooja";
   static char[] arr=str.toCharArray();
   static char[] arr1=new char[arr.length];
   static  String str1;
  static int i,j=0;


    public static void main(String[] args) throws IOException {
        for(i=arr.length-1;i>=0;i--)
        {
            arr1[j]=arr[i];
            j++;
        }

        str1=String.valueOf(arr1);
        System.out.println(str1);

    }
}
