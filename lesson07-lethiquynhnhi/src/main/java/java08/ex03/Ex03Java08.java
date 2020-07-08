package java08.ex03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex03Java08 {

    private static Scanner ip = new Scanner(System.in);
    private static String DATE_PATTERN = "dd/MM/yyyy";
    //private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy E");

    public static void main(String[] args) {
        LocalDate ldate = inputDate();
        int lengthDaysOfYear = ldate.lengthOfYear();
        int lengthDaysOfMonth = ldate.lengthOfMonth();
        int daysOfYear = daysOfYear(ldate);
        int daysLeft = lengthDaysOfYear - daysOfYear;
        System.out.println("It is day number: " + daysOfYear + " of the year, " + daysLeft + " days left");
        System.out.println("============================================");
        dayNumberOfYear(ldate);

        System.out.println("============================================");
        dayNumberOfMonth(ldate);

        System.out.println("==========================");
        System.out.println("Year " + ldate.getYear() + " has " + lengthDaysOfYear + " days");

        System.out.println("==========================");
        System.out.println(ldate.getMonth() + " " + ldate.getYear() + " has " + lengthDaysOfMonth + " days");
    }

    private static LocalDate inputDate() {
        do {
            System.out.print("Enter your date " + DATE_PATTERN + " : ");
            String dateString = ip.nextLine();
            try {
                LocalDate startdate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(DATE_PATTERN));
                return startdate;
            } catch (RuntimeException e) {
                System.out.println("Please enter the valid date! " + DATE_PATTERN);
            }
        } while (true);
    }

    private static int daysOfYear(LocalDate localDate) {
        return localDate.getDayOfYear();
    }

    private static void dayNumberOfYear(LocalDate localDate) {
        LocalDate start = LocalDate.of(localDate.getYear(), localDate.getMonth(), 1);
        LocalDate nextLocalDate = localDate.plusDays(1);

        int numberDaysOfYear = localDate.lengthOfYear() / 7 + 1;
        int count = 0;
        while (start.isBefore(nextLocalDate)) {
            if (start.getDayOfWeek().equals(localDate.getDayOfWeek())) {
                count++;
                start = start.plusDays(7);
            } else {
                start = start.plusDays(1);
            }
        }
        System.out.println("It is " + localDate.getDayOfWeek() + " number " + count + " out of " + numberDaysOfYear + " in " + localDate.getYear());
    }

    private static void dayNumberOfMonth(LocalDate localDate) {
        int count = 0;
        int position = 0;
        LocalDate temp = LocalDate.of(localDate.getYear(), localDate.getMonth(), 1);
        LocalDate end = LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.lengthOfMonth());

        while (temp.isBefore(end)) {
            if (temp.getDayOfWeek().equals(localDate.getDayOfWeek())) {
                count++;
                if (temp.isEqual(localDate)) {
                    position = count;
                }
                temp = temp.plusDays(7);
            } else {
                temp = temp.plusDays(1);
            }
        }

        System.out.println("It is " + localDate.getDayOfWeek() + " number " + position + " out of " + count + " in " + localDate.getMonth() + " " + localDate.getYear());
    }


}
