package java08.datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int[] months = getMonthsHasFiveSundays(c);
        for (int i = 0; i < months.length; i++) {
            System.out.println("month: " + months[i]);
        }
    }

    private static int[] getMonthsHasFiveSundays(Calendar c) {
        int[] months = new int[12];
        int mindex = 0;

        Calendar ctmp = Calendar.getInstance();
        ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
        for (int month = 0; month <= 11; month++) {
            ctmp.set(Calendar.MONTH, month);
            if (hasFiveSundays(ctmp)) {
                months[mindex++] = (month + 1);
            }
        }
        return Arrays.copyOfRange(months, 0, mindex);
    }

    private static boolean hasFiveSundays(Calendar c) {
        return totalOfSundays(c) == 5;
    }

    private static int totalOfSundays(Calendar c) {
        Calendar start = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        start.set(year, month, 1);

        Calendar end = Calendar.getInstance();
        end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
        int count = 0;
        /*while (start.before(end)) {
            if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                count++;
                start.add(Calendar.WEEK_OF_MONTH, 1);
            } else {
                start.add(Calendar.DAY_OF_MONTH, 1);
            }
        }*/

        while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            start.add(Calendar.DAY_OF_MONTH, 1);
        }

        while (start.before(end)) {
            count++;
            start.add(Calendar.DAY_OF_MONTH, 7);
        }

        return count;
    }
}
