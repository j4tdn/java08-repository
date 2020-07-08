package java08.ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.*;

public class Ex01Java08 {
    private static final String DATE_PATTERN = "dd/MM/yyy EEEE";
    private static DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static void main(String[] args) {
        int year = 2020;
        System.out.println("==== Using JAVA08 ====");
        System.out.println("All Sunday in Year:");
        getAllSundaysInYear(year);
        System.out.println("=====================");
        System.out.println("Last Sunday of Year: ");
        getLastSunday(year);
    }

    public static void getAllSundaysInYear(int year) {
        LocalDate startDate = LocalDate.of(year, Month.JANUARY, 1);
        LocalDate sunday = startDate.with(firstInMonth(DayOfWeek.SUNDAY));

        do {
            // Loop to get every Sunday by adding Period.ofDays(7) the the current Sunday.
            System.out.println(df.format(sunday));
            sunday = sunday.plus(Period.ofDays(7));
        } while (sunday.getYear() == year);

    }

    private static void getLastSunday(int year) {
        LocalDate startDate = LocalDate.of(year, Month.DECEMBER, 31);
        LocalDate lastSunday = startDate.with(lastInMonth(DayOfWeek.SUNDAY));

        System.out.println(df.format(lastSunday));
    }


}
