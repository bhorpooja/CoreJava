package DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by i net on 17/08/2017.
 */
public class javaSimpleDateFormatDemo1 {
    public static void main(String[] args) {
        System.out.println("SimpleDateFormat : String to Date");
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date=formatter.parse("17/08/2017");
            System.out.println("Date is :"+date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
