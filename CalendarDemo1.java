package object;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 48);
        calendar.add(Calendar.WEEK_OF_MONTH, -1);
        calendar.set(Calendar.DAY_OF_WEEK, 5);//跳转 跳转到一周的第五天（周日为第一周的第一天）
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
