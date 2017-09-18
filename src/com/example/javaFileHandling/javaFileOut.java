package com.example.javaFileHandling;

import java.io.*;

/**
 * Created by pooja on 4/9/17.
 */
class WriteFile{
    void writeToFile(){
        try (FileOutputStream fout = new FileOutputStream("/home/pooja/out.txt")) {
            String str="Write to file using FileOutputStream";
            byte[] b=str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    void writeUsingBuffer(){
        try {
            FileOutputStream fout=new FileOutputStream("/home/pooja/file.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String str="Write to file using BufferedOutputStream";
            byte[] b=str.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class javaFileOut {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        WriteFile c=new WriteFile();
        c.writeToFile();
        //time1=System.currentTimeMillis();
        long time1=System.currentTimeMillis();
        c.writeUsingBuffer();
    }
}
