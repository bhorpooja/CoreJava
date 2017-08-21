package DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by i net on 16/08/2017.
 */
public class JavaDateFormatDemo1 {
    public static void main(String[] args){
        System.out.println("Java DateFormat : String to Date");
       Date date= new Date();
        try {
            date = DateFormat.getDateInstance().parse("17 Aug,2017");
            System.out.println("Date is : "+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}