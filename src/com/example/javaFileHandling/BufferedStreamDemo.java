package com.example.javaFileHandling;

import java.io.*;

/**
 * Created by pooja on 20/9/17.
 */
class BufferedStreamExapmle
{
    void writeData()
    {
        try {
            FileOutputStream fout=new FileOutputStream("/home/pooja/Desktop/BufferStream.txt");
             BufferedOutputStream bout=new BufferedOutputStream(fout);
            String str="Write data to file using BufferedOutputStream Class";
            String st="Hey hiii...";
            byte[] b=str.getBytes() ;
           // b=st.getBytes();
            bout.write(b);
            bout.flush();
            fout.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File write successfully");
    }
    void readData()
    {
    try {
        FileInputStream fin=new FileInputStream("/home/pooja/Desktop/BufferStream.txt");
        BufferedInputStream bin=new BufferedInputStream(fin);
        int i;
        System.out.print("File data : ");
        while ((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
public class BufferedStreamDemo {
    public static void main(String[] args) {
            BufferedStreamExapmle b=new BufferedStreamExapmle();
            b.writeData();
            b.readData();

    }
}
