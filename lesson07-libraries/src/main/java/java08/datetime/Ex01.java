package java08.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("TimeZone default: " + TimeZone.getDefault());
        System.out.println("Locale default: " + Locale.getDefault(Locale.Category.FORMAT));

        GregorianCalendar g = new GregorianCalendar();

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, 4);
        System.out.println(""
                + "Day: " + c.get(Calendar.DAY_OF_MONTH)
                + "\nMonth: " + (c.get(Calendar.MONTH) + 1)
                + "\nYear: " + c.get(Calendar.YEAR)
                + "\nHour 12: " + c.get(Calendar.HOUR)
                + "\nHour 24: " + c.get(Calendar.HOUR_OF_DAY)
                + "\nMinue: " + c.get(Calendar.MINUTE)
                + "\nSecond: " + c.get(Calendar.SECOND)
                + "\nWeekday: " + c.get(Calendar.DAY_OF_WEEK)
                + "\nMonthDays: " + c.getActualMaximum(Calendar.DAY_OF_MONTH)
                + "\nYearDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
                + "\nisLeapYear: " + g.isLeapYear(c.get(Calendar.YEAR)));
    }
}
