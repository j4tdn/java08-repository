package java08.datetime;

import java08.utils.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class Ex08 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = DateUtils.toDate(c);
        String s = DateUtils.toString(date, "dd.MM.yyyy EEEE");

        System.out.println("calendar: " + c);
        System.out.println("date: " + date);
        System.out.println("string: " + s);
    }
}
