package java08.datetime;

import java08.utils.DateUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ex05 {
    private static final String DATE_PATTERN = "dd/MM/yyy EEEE";
    private static final int OFFSET = 7;

    public static void main(String[] args) {
        // printDayOfWeek(Calendar.getInstance());

        printDayOfWeek2(Calendar.getInstance());
    }

    private static void printDayOfWeek(Calendar c) {
        DateFormat df = new SimpleDateFormat(DATE_PATTERN);
        int firstDayOfWeek = c.getFirstDayOfWeek();
        int lastDayOfWeek = firstDayOfWeek + OFFSET;
        for (int i = firstDayOfWeek; i < lastDayOfWeek; i++) {
            c.set(Calendar.DAY_OF_WEEK, i);
            System.out.println(df.format(c.getTime()));
        }
    }

    private static void printDayOfWeek2(Calendar c) {
        int firstDayOfWeek = c.get(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_WEEK) + c.getFirstDayOfWeek();
        Calendar fdowCal = Calendar.getInstance();
        fdowCal.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), firstDayOfWeek);

        Calendar ldowCal = Calendar.getInstance();
        ldowCal.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), firstDayOfWeek + OFFSET);
        for (Calendar calendar = fdowCal; calendar.before(ldowCal); calendar.add(Calendar.DAY_OF_MONTH, 1)) {
            System.out.println(DateUtils.toString(calendar.getTime(), "dd/MM/yyy EEE"));
        }
    }



}
