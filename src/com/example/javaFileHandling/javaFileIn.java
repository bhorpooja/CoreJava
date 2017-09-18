package com.example.javaFileHandling;

import java.io.FileInputStream;

/**
 * Created by pooja on 6/9/17.
 */
class ReadFile{
    void readFromFile(){
        try {
            FileInputStream file=new FileInputStream("/home/pooja/out.txt");
            int i=0;
            while ((i=file.read())!=-1) {
                System.out.print((char)i);
            }
           // file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class javaFileIn {
    public static void main(String[] args) {
        ReadFile r = new ReadFile();
        r.readFromFile();
    }
}
