package java08.datetime;

import java08.utils.WeekdayUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        Calendar ctmp = Calendar.getInstance();
        ctmp.set(Calendar.MONTH, c.get(Calendar.MONTH));
        ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
        for (int i = 1; i <= maxDayOfMonth; i++) {
            ctmp.set(Calendar.DAY_OF_MONTH, i);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
            System.out.println(df.format(ctmp.getTime()));
        }
    }
}
