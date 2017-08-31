package DateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by pooja on 31/8/17.
 */
class Test{
    long date=System.currentTimeMillis();
    String str;
    void getDate(){

        str= DateFormat.getDateInstance().format(date);
        System.out.println(str);

        str=DateFormat.getDateInstance(0).format(date);
        System.out.println(str);

        str=DateFormat.getDateInstance(1).format(date);
        System.out.println(str);

        str=DateFormat.getDateInstance(2).format(date);
        System.out.println(str);

        str=DateFormat.getDateInstance(3).format(date);
        System.out.println(str);

//        str=DateFormat.getTimeInstance(DateFormat.AM_PM_FIELD).format(date);
//        System.out.println(str);

//        str=DateFormat.getTimeInstance(11).format(date);
//        System.out.println(str);



    }
    void getTime(){
        str=DateFormat.getTimeInstance().format(date);
        System.out.println(str);

        str=DateFormat.getTimeInstance(0).format(date);
        System.out.println(str);

//        str=DateFormat.getTimeInstance(1).format(date);
//        System.out.println(str);

        str=DateFormat.getTimeInstance(2).format(date);
        System.out.println(str);

        str=DateFormat.getTimeInstance(3).format(date);
        System.out.println(str);

//        str=DateFormat.getTimeInstance(5).format(date);
//        System.out.println(str);


    }
    void getInst(){
        str=DateFormat.getDateTimeInstance().format(date);
        System.out.println(str);

        str=DateFormat.getDateTimeInstance(0,0).format(date);
        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(0,1).format(date);
//        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(0,2).format(date);
//        System.out.println(str);
//
//        str=DateFormat.getDateTimeInstance(0,3).format(date);
//        System.out.println(str);
//
//        str=DateFormat.getDateTimeInstance(1,0).format(date);
//        System.out.println(str);

        str=DateFormat.getDateTimeInstance(1,1).format(date);
        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(1,2).format(date);
//        System.out.println(str);
//
//        str=DateFormat.getDateTimeInstance(1,3).format(date);
//        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(2,0).format(date);
//        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(2,1).format(date);
//        System.out.println(str);

        str=DateFormat.getDateTimeInstance(2,2).format(date);
        System.out.println(str);
//
//        str=DateFormat.getDateTimeInstance(2,3).format(date);
//        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(3,0).format(date);
//        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(3,1).format(date);
//        System.out.println(str);

//        str=DateFormat.getDateTimeInstance(3,2).format(date);
//        System.out.println(str);

        str=DateFormat.getDateTimeInstance(3,3).format(date);
        System.out.println(str);
    }
}
public class javaDateDemo  {
    public static void main(String[] args){
        Test t=new Test();
        t.getDate();
        t.getTime();
        t.getInst();
    }
}
