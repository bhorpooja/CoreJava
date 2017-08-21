package JavaString;

import java.security.SecureRandom;

/**
 * Created by i net on 17/08/2017.
 */
public class StringDemo {
    void show(){
        char[] ch={'p','o','o','j','a'}; //character array
        String a = new String(ch);//converting chr[] array to string
        String b = "Pooja";//string literal
        System.out.println("char[] to String");
        System.out.println(a);
        System.out.println("String Literal");
        System.out.println(b);
    }
    public static void main(String[] args) {
        StringDemo s=new StringDemo();
        s.show();
    }

}
