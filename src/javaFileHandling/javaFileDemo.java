package javaFileHandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by pooja on 4/9/17.
 */
class CreateFile{
    void create(){
        try (FileOutputStream file = new FileOutputStream("/home/pooja/pooja.txt")) {
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
public class javaFileDemo {
    public static void main(String[] args) {
        CreateFile c=new CreateFile();
        c.create();
    }
}
