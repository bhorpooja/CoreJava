package com.example.javaDateFormat;

import java.text.SimpleDateFormat;

/**
 * Created by pooja on 31/8/17.
 */
class TestDemo{
    void simpleDate(){
        long date=System.currentTimeMillis();
        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
        String str1=s.format(date);
        System.out.println(str1);

        s=new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        str1=s.format(date);
        System.out.println(str1);

        s=new SimpleDateFormat("MM/dd/yyyy");
        str1=s.format(date);
        System.out.println(str1);

        s=new SimpleDateFormat("MM/dd/yy hh:mm:ss");
        str1=s.format(date);
        System.out.println(str1);

        s=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        str1=s.format(date);
        System.out.println(str1);

        s=new SimpleDateFormat("d MMM, yyyy hh:mm:ss");
        str1=s.format(date);
        System.out.println(str1);

        s=new SimpleDateFormat("d MMMM, yyyy hh:mm:ss");
        str1=s.format(date);
        System.out.println(str1);

    }

}
public class javaSimpleDate {
    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        t.simpleDate();
    }
}
