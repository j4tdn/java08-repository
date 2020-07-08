package java08.ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03Java07 {
    private static Scanner ip = new Scanner(System.in);
    private static final String FORMATED_DATE = "dd/MM/yyyy";
    private static Calendar cal = Calendar.getInstance();

    public static void main(String[] args) {
        Date date = inputDate();
        valiDate(date);
        System.out.println("=====================================");
        daysOfYear(date);
        System.out.println("=====================================");

        dayNumberOfYear(date);
        System.out.println("=====================================");

        dayNumberOfWeek(date);
        System.out.println("=====================================");

        numberDaysOfYear(date);
        System.out.println("=====================================");

        numberDaysOfMonth(date);
    }

    private static Date inputDate() {
        Date result = null;

        // convert từ string sang date
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATED_DATE);
        do {
            System.out.print("Enter your date " + FORMATED_DATE + " : ");
            String sdate = ip.nextLine();

            // is date/time being passed the valid date/time
            sdf.setLenient(false);
            try {
                result = sdf.parse(sdate);
                break;
            } catch (ParseException e) {
                System.out.println("Please enter the valid date!" + FORMATED_DATE);
            }
        } while (true);

        return result;
    }

    private static String getWeekDayAsText(Calendar dayNow) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return weekdays[dayNow.get(Calendar.DAY_OF_WEEK) - 1];
    }

    private static String getMonthDayAsText(Calendar monthNow) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        return months[monthNow.get(Calendar.MONTH)];
    }

    private static void valiDate(Date date) {
        cal.setTime(date);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + " " + getMonthDayAsText(cal) + " " + cal.get(Calendar.YEAR)
                + " " + "is a " + getWeekDayAsText(cal));
    }

    private static void daysOfYear(Date date) {
        cal.setTime(date);

        int daysLeft = cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(
                "It is day number " + cal.get(Calendar.DAY_OF_YEAR) + " of the year, " + daysLeft + " days left");

    }

    private static void dayNumberOfYear(Date date) {
        cal.setTime(date);
        Calendar from = Calendar.getInstance();
        from.set(cal.get(Calendar.YEAR), Calendar.JANUARY, 1);

        Calendar to = Calendar.getInstance();
        to.set(cal.get(Calendar.YEAR), Calendar.DECEMBER, 31);

        int count = 0;
        while (from.before(to)) {
            if (from.get(Calendar.DAY_OF_WEEK) == cal.get(Calendar.DAY_OF_WEEK)) {
                from.add(Calendar.DAY_OF_YEAR, 7);
                count++;
            } else {
                from.add(Calendar.DAY_OF_YEAR, 1);
            }
        }
        int numberDays = (cal.get(Calendar.DAY_OF_YEAR) / 7) + 1;
        System.out.println("It is " + getWeekDayAsText(cal) + " number " + numberDays + " out of " + count + " in "
                + cal.get(Calendar.YEAR));
    }

    private static void dayNumberOfWeek(Date date) {
        cal.setTime(date);
        Calendar from = Calendar.getInstance();
        from.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1);

        int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        Calendar to = Calendar.getInstance();
        to.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), dayOfMonth);

        int count = 0;
        while (from.before(to)) {
            if (from.get(Calendar.DAY_OF_WEEK) == cal.get(Calendar.DAY_OF_WEEK)) {
                from.add(Calendar.DAY_OF_MONTH, 7);
                count++;
            } else {
                from.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

        int numberDays = (cal.get(Calendar.DAY_OF_MONTH) / 7) + 1;
        System.out.println("It is " + getWeekDayAsText(cal) + " number " + numberDays + " out of " + count + " in "
                + getMonthDayAsText(cal) + " " + cal.get(Calendar.YEAR));
    }

    private static void numberDaysOfYear(Date date) {
        cal.setTime(date);
        int dayOfYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println("Year " + cal.get(Calendar.YEAR) + " has " + dayOfYear + " days");

    }

    private static void numberDaysOfMonth(Date date) {
        cal.setTime(date);
        int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(getMonthDayAsText(cal) + " has " + dayOfMonth + " days");
    }
}
