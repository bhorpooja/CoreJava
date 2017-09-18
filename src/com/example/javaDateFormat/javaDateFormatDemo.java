package com.example.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by i net on 16/08/2017.
 */
public class javaDateFormatDemo {
    public static void main(String[] args) {
        System.out.println("Java javaDateFormat : Date to String");
        Date date=new Date();
        System.out.println("Current Date = "+date);

        String datetostr= DateFormat.getInstance().format(date);
        System.out.println("Date format using getInstance : "+datetostr);

        datetostr=DateFormat.getDateInstance().format(date);
        System.out.println("Date Format using getDateInstance : "+datetostr);

        datetostr=DateFormat.getTimeInstance().format(date);
        System.out.println("Date Format using getTimeInstance : "+datetostr);

        datetostr=DateFormat.getDateTimeInstance().format(date);
        System.out.println("Date Format using getDateTimeInstance : "+datetostr);

        datetostr=DateFormat.getTimeInstance(DateFormat.FULL).format(date);
        System.out.println("date Format using getTimeInstanceFULL : "+datetostr);

        datetostr=DateFormat.getTimeInstance(DateFormat.LONG).format(date);
        System.out.println("Date Format using getTimeInstanceLONG : "+datetostr);

        datetostr=DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
        System.out.println("Date Format using getTimeInstanceSHORT : "+datetostr);

        datetostr=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date);
        System.out.println("Date Format using getTimeInstanceMEDIUM : "+datetostr);

        datetostr=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
        System.out.println("Date Format using getDateTimeInstance : "+datetostr);

    }
}
