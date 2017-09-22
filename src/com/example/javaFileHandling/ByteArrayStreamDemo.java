package com.example.javaFileHandling;

import java.io.*;

/**
 * Created by pooja on 20/9/17.
 */
class ByteArrayStreamExample{
  public void writeData(){
      try {
          FileOutputStream f1=new FileOutputStream("/home/pooja/Desktop/ByteArrayOut.txt");
          FileOutputStream f2=new FileOutputStream("/home/pooja/Desktop/ByteArrayOut1.txt");
          ByteArrayOutputStream bout=new ByteArrayOutputStream();
          String str="Write common data to multiple files using ByteArrayOutputStream ";
          byte[] b=str.getBytes();
          bout.write(b);
          bout.write(65);
          bout.writeTo(f1);
          bout.writeTo(f2);
          //bout.flush();
          System.out.println("data write successfully");
          bout.close();
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }

  }
  void readData(){

          //FileInputStream fin=new FileInputStream("/home/pooja/Desktop/ByteArrayOut.txt");
          byte[] b={35,36,37,38};
          int k=0;
          ByteArrayInputStream bin=new ByteArrayInputStream(b);

          while ((k=bin.read())!=-1){
              char ch=(char)k;
              System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);            }

  }

}
public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        ByteArrayStreamExample b=new ByteArrayStreamExample();
        b.writeData();
        b.readData();

    }
}
