package com.example.javaFileHandling;

import java.io.*;

/**
 * Created by pooja on 6/9/17.
 */
class Demo
{
    FileInputStream fin = new FileInputStream("/home/pooja/out.txt");
    int len,c;
    byte[] b = new byte[1024];
    char[] ch = new char[100];
    StringBuffer stb = new StringBuffer();
    String st = new String();

    Demo() throws IOException {
    }

    void readFromFile1() {
        try {
            while ((len = fin.read()) != -1) {
               // System.out.print((char) len);
                char c = (char) len;
                ch = stb.append(c).toString().toCharArray();
            }
            System.out.println(st=new String(ch));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void writeToFile1() throws IOException {
        FileOutputStream fout1 = new FileOutputStream("/home/pooja/out1.txt");
        b=st.getBytes();
        fout1.write(b);
        fout1.close();
        System.out.println("File1 copied Successfully");
    }
    void readFromFile2() throws IOException {
        while ((c=fin.read())!=-1){
           // System.out.print((char)c);
            char ch1=(char)c;
            st= String.valueOf(stb.append(ch1));
        }
        System.out.println(st);
    }
    void writeToFile2() throws IOException {
        FileOutputStream fout2 = new FileOutputStream("/home/pooja/out2.txt");
        b=st.getBytes();
        fout2.write(b);
        System.out.println("File2 Copied Successfully");
    }

    void readFromFile3() throws IOException {
        while ((len=fin.read(b))>0){
            // System.out.print((char)len);
            st= new String(b).toString();
        }
        System.out.println(st);
        fin.close();
    }
    void writeToFile3() throws IOException {
       // byte[] buf=new byte[1024];
        FileOutputStream fout3 = new FileOutputStream("/home/pooja/out3.txt");
            b=st.getBytes();
            fout3.write(b);
        System.out.println("File copied successfully");
        fout3.close();
//        fin.close();
    }

    void writeToFile4() throws IOException {
        FileOutputStream fout4 = new FileOutputStream("/home/pooja/out4.txt");
        while ((len = fin.read(b)) > 0) {
            fout4.write(b,0,len);
            System.out.println("File4 copied successfully");
        }
        fout4.close();
    }
    void writeToFile5() throws IOException {
        FileOutputStream fout5 = new FileOutputStream("/home/pooja/out5.txt");
        while ((c=fin.read())!=-1){
            fout5.write((char)c);
        }
        System.out.println("File5 copied successfully");
        fout5.close();
       // fin.close();
    }

    FileReader fr=new FileReader("/home/pooja/out.txt");
    FileWriter fw=new FileWriter("/home/pooja/out6.txt");
   // BufferedReader br=new BufferedReader(new FileInputStream("/home/pooja/out.txt"));
    //int c;
    void readFromFileReader() throws IOException {
        while ((c=fr.read())!=-1){
            System.out.print((char)c);
        }
    }
    void writeToFileWriter() throws IOException {
        c=fr.read();
        while (c!=-1){
//           fw.write(c);
//           c=fr.read();
//            char ch=(char)c;
//            char[] ch1=new String(String.valueOf(ch)).toCharArray();
//            fw.write(ch1);
            st= String.valueOf(c).toString();
            System.out.println(st);
        }
        System.out.println("File6 copied successfully");
        fw.close();
        fr.close();
    }
}
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        Demo d=new Demo();
//        d.readFromFile1();
//        d.writeToFile1();
//        d.readFromFile2();
//        d.writeToFile2();
//        d.readFromFile3();
//        d.writeToFile3();
//        d.writeToFile4();
//        d.writeToFile5();
//      d.readFromFileReader();
        d.writeToFileWriter();
    }
}
