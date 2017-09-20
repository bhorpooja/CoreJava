package com.example.javaFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by pooja on 20/9/17.
 */
class SequenceInputStreamExample{
    void readTwoFiles(){
        try {
        FileInputStream f1=new FileInputStream("/home/pooja/Data.txt");
        FileInputStream f2=new FileInputStream("/home/pooja/out.txt");
        SequenceInputStream sin=new SequenceInputStream(f1,f2);
        int j;
        while ((j=sin.read())!=-1){
            System.out.print((char)j);
        }
        sin.close();
        f1.close();
        f2.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
    void writeThirdFile(){
        try {
            FileInputStream f1=new FileInputStream("/home/pooja/Data.txt");
            FileInputStream f2=new FileInputStream("/home/pooja/Desktop/BufferStream.txt");
            SequenceInputStream sin=new SequenceInputStream(f1,f2);
            FileOutputStream fout=new FileOutputStream("/home/pooja/Desktop/SequenceStream.txt");
            int j;
            while ((j=sin.read())!=-1){
                fout.write(j);
            }
            sin.close();
            fout.close();
            f1.close();
            f2.close();
            System.out.println("\nData write successfully");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    void readUsingEnumeration(){
        try {
            FileInputStream f1=new FileInputStream("/home/pooja/Desktop/SequenceStream.txt");
            FileInputStream f2=new FileInputStream("/home/pooja/Desktop/gg.txt");
            FileInputStream f3=new FileInputStream("/home/pooja/Desktop/BufferStream.txt");
            Vector v=new Vector();
            v.add(f1);
            v.add(f2);
            v.add(f3);
            Enumeration e=v.elements();
            SequenceInputStream sin=new SequenceInputStream(e);
            int j=0;
            while ((j=sin.read())!=-1){
                System.out.print((char)j);
            }

            sin .close();
            f1.close();
            f2.close();
//            f3.close();

        }
        catch (java.io.IOException e){
            System.out.println(e);
        }

    }
}
public class SequenceInputDemo {
    public static void main(String[] args) {
       SequenceInputStreamExample s = new SequenceInputStreamExample();
        System.out.println("Reading Two Files");
        s.readTwoFiles();
        System.out.println("Read Two Files & Write to Third file");
        s.writeThirdFile();
        System.out.println("Read data from more than two Files using enumeration");
        s.readUsingEnumeration();
    }

}
