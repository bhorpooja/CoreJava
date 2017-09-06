package javaFileHandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by pooja on 4/9/17.
 */
class WriteFile{
    void writeToFile(){
        try (FileOutputStream file = new FileOutputStream("/home/pooja/out.txt")) {
            String str="File handling Demo";
            byte[] b=str.getBytes();
            file.write(b);
            file.close();
            System.out.println("success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class javaFileOut {
    public static void main(String[] args) {
        WriteFile c=new WriteFile();
        c.writeToFile();
    }
}
