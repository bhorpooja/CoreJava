package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by i net on 17/08/2017.
 */
public class javaSimpleDateFormatDemo {
    public static void main(String[] args) {
        System.out.println("SimpleDateFormat : Date to String");
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY");
        String str=formatter.format(date);
        System.out.println("Date Format DD/MM/YYYY : "+str);

        formatter=new SimpleDateFormat("MM/dd/YYYY");
        str=formatter.format(date);
        System.out.println("Date Format MM/dd/YYYY: "+str);

        formatter=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        str=formatter.format(date);
        System.out.println("Date format MM/dd/yyyy hh:mm:ss : "+str);

        formatter=new SimpleDateFormat("MM-d-yyyy hh:mm:ss");
        str=formatter.format(date);
        System.out.println("Date format MM-d-yyyy hh:mm:ss : "+str);

        formatter=new SimpleDateFormat("d MMMM, yyyy hh:mm:ss");
        str=formatter.format(date);
        System.out.println("Date format d MMMM, yyyy hh:mm:ss : "+str);

        formatter=new SimpleDateFormat("d MMMM, yy z");
        str=formatter.format(date);
        System.out.println("Date format d MMMM, yy z : "+str);

        formatter=new SimpleDateFormat("E, d MMMM, yy zzzz");
        str=formatter.format(date);
        System.out.println("Date format E, d MMMM, yy zzzz : "+str);

        formatter=new SimpleDateFormat("E, d MMM, yy hh:mm:ss zzzz");
        str=formatter.format(date);
        System.out.println("Date format E, d MMM, yy hh:mm:ss zzzz : "+str);
    }
}
