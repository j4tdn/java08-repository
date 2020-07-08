package java08.ex01;

import java08.utils.DateUtils;

import java.util.Calendar;

public class Ex01Java07 {

    private static final String DATE_PATTERN = "dd/MM/yyy EEEE";

    public static void main(String[] args) {
        int year = 2020;
        System.out.println("==== Using JAVA07 ====");
        System.out.println("All Sunday in Year:");
        getAllSundaysInYear(year);
        System.out.println("=====================");
        System.out.println("Last Sunday of Year: ");
        getLastSunday(year);
    }

    private static void getAllSundaysInYear(int year) {
        Calendar startDateOfYear = Calendar.getInstance();
        startDateOfYear.set(year, Calendar.JANUARY, 1);

        Calendar lastDateOfYear = Calendar.getInstance();
        lastDateOfYear.set(year, Calendar.DECEMBER, 31);
        lastDateOfYear.add(Calendar.DAY_OF_MONTH, 1);

        Calendar temp = Calendar.getInstance();
        temp.setTime(startDateOfYear.getTime());

        Calendar lastDateOfWeek = Calendar.getInstance();
        lastDateOfWeek.set(year, startDateOfYear.get(Calendar.MONTH), startDateOfYear.get(Calendar.DATE + 7));
        for (Calendar calendar = temp; calendar.before(lastDateOfWeek); calendar.add(Calendar.DAY_OF_WEEK, 1)) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                temp = calendar;
                break;
            }
        }

        while (temp.before(lastDateOfYear)) {
            System.out.println(DateUtils.toString(temp.getTime(), "dd/MM/yyy EEE"));
            temp.add(Calendar.DAY_OF_MONTH, 7);
        }
    }

    private static void getLastSunday(int year) {
        Calendar lastDateOfYear = Calendar.getInstance();
        lastDateOfYear.set(Calendar.MONTH, Calendar.DECEMBER);
        int maxDayOfYear = lastDateOfYear.getActualMaximum(Calendar.DAY_OF_MONTH);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.DECEMBER, maxDayOfYear);

        for (int i = maxDayOfYear; i >= (maxDayOfYear - 7); i--) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(DateUtils.toString(calendar.getTime(), DATE_PATTERN));
                return;
            } else {
                calendar.set(Calendar.DATE, i);
            }
        }
    }

}
