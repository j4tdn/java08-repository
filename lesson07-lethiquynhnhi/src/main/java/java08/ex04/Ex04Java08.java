package java08.ex04;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex04Java08 {
    private static Scanner ip = new Scanner(System.in);
    private static String DATE_PATTERN = "dd/MM/yyyy";
    private static DateTimeFormatter df = DateTimeFormatter.ofPattern("E dd/MM/yyyy");
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        String idZone = "America/New_York";
        LocalDateTime localDateTime = localDateTimeOfAPlace(idZone);
        System.out.println("1. Time now at " + idZone + " : " + dtf.format(localDateTime));
        System.out.println("==========================================");

        LocalDate localDate = localDateTime.toLocalDate();
        int lengthDaysOfMonth = lengthDaysOfMonth(localDate);
        System.out.println("2. " + localDateTime.getMonth() + " has " + lengthDaysOfMonth + " days");

        System.out.println("================================");
        printLastDateOfMonth(localDate);
        System.out.println("================================");
        firstDateAndLastDate(localDate);

        System.out.println("================================");
        System.out.println("5. Order of this week: " + orderOfWeek(localDate));

        System.out.println("================================");
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("6. Add 8 hours: " + add8Hours(localTime));

        System.out.println("================================");
        LocalDate inputDate = LocalDate.of(2020, Month.JUNE, 17);
        distinct2Date(inputDate);

        System.out.println("================================");
        LocalDate nextDate = after20Days(localDate);
        System.out.println("8. After 20 days: " + df.format(nextDate));

        System.out.println("================================");
        int monthsLeft = monthsLeft(localDate);
        System.out.println("9. Months Left: " + monthsLeft);

        System.out.println("================================");
        LocalDate birthday = inputDate(localDate);
        yourAge(birthday);
    }

    private static LocalDateTime localDateTimeOfAPlace(String idZone) {
        ZoneId zoneId = ZoneId.of(idZone);
        return LocalDateTime.now(zoneId);
    }

    private static int lengthDaysOfMonth(LocalDate localDate) {
        return localDate.lengthOfMonth();
    }

    private static void printLastDateOfMonth(LocalDate localDate) {
        LocalDate lastDate = LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.lengthOfMonth());
        System.out.println("3. Last date of " + localDate.getMonth() + " : " + df.format(lastDate));
    }

    private static void firstDateAndLastDate(LocalDate localDate) {
        // Go backward to get Monday
        LocalDate firstDate = localDate;
        while (firstDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDate = firstDate.minusDays(1);
        }

        System.out.println("4. First date of current week: " + df.format(firstDate));
        LocalDate lastDate = firstDate.plusDays(6);
        System.out.println("   Last date of current week: " + df.format(lastDate));
    }

    private static int orderOfWeek(LocalDate localDate) {
        WeekFields weekField = WeekFields.of(DayOfWeek.MONDAY, 1);
        TemporalField weekOfMonth = weekField.weekOfMonth();

        return localDate.get(weekOfMonth);
    }

    private static LocalTime add8Hours(LocalTime localTime) {
        return localTime.plusHours(8);
    }

    private static void distinct2Date(LocalDate inputDate) {
        LocalDate localDate = LocalDate.now();

        Period period = Period.between(inputDate, localDate);

        if (period.getDays() < 0) {
            period = period.minusMonths(1);
            int dayOfMonth = YearMonth.of(inputDate.getYear(), inputDate.getMonth()).lengthOfMonth();
            period = period.withDays(dayOfMonth - 1);
        }
        System.out.println("7. Year: " + period.getYears() + " months: " + period.getMonths() + " days: " + period.getDays());
    }

    private static LocalDate after20Days(LocalDate localDate) {
        return localDate.plusDays(20);
    }

    private static int monthsLeft(LocalDate localDate) {
        return (12 - localDate.getMonthValue());
    }

    private static LocalDate inputDate(LocalDate localDate) {
        do {
            System.out.print("Enter your date " + DATE_PATTERN + " : ");
            String dateString = ip.nextLine();
            try {
                LocalDate birthday = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(DATE_PATTERN));
                if (birthday.isBefore(localDate)) {
                    return birthday;
                } else {
                    System.out.println("Your Birthday must is before current date!!!");
                }
            } catch (RuntimeException e) {
                System.out.println("Please enter the valid date! " + DATE_PATTERN);
            }
        } while (true);
    }

    private static void yourAge(LocalDate birthday) {
        distinct2Date(birthday);
    }

}
