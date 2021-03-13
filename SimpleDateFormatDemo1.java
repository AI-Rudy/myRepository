package object;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        /*
            format()
            parse()
         */
        Date date = new Date();
        System.out.println(date);
        String s = sdf.format(date);
        System.out.println(s);

        String str = "2021-11-11";
        Date d = sdf.parse(str);
        System.out.println(d);
    }
}
