package JavaArray;

import java.text.DateFormat;

/**
 * Created by pooja on 1/9/17.
 */
class Demo{
    void stringReverse(){
        String s="pooja bhor";
        StringBuilder str=new StringBuilder();
        for (String st:s.split(" ")){
            String ss=new StringBuffer(st).reverse().toString();
            ss=ss.substring(0);
            str.append(ss).append(" ");

        }
        System.out.println(str);

    }
}
public class javaStringDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.stringReverse();
    }
}
