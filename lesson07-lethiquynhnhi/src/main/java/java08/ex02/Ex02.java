package java08.ex02;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex02 {
    private static Scanner ip = new Scanner(System.in);
    private static String DATE_PATTERN = "dd/MM/yyyy";
    private static DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static void main(String[] args) {
        LocalDate localDate = inputDate();
        LocalDateTime lstartDate = localDate.atStartOfDay();
        System.out.println("Do you break down the relationship(Y/N)?: ");
        String choice = ip.nextLine();
        switch (choice) {
            case "y":
            case "Y":
                LocalDate lend = inputDate();
                lend.atStartOfDay();
                durationHoneyMoonTime(lstartDate, lend.atStartOfDay());
                break;

            case "n":
            case "N":
                LocalDateTime lendDate = LocalDateTime.now();
                durationHoneyMoonTime(lstartDate, lendDate);
                break;

            default:
                break;
        }
    }

    private static LocalDate inputDate() {
        do {
            System.out.print("Enter your date: ");
            String dateString = ip.nextLine();
            try {
                LocalDate startdate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(DATE_PATTERN));
                return startdate;
            } catch (RuntimeException e) {
                System.out.println("Please enter the valid date! " + DATE_PATTERN);
            }
        } while (true);
    }

    private static void durationHoneyMoonTime(LocalDateTime startDate, LocalDateTime lend) {

        LocalDate ldateStart = startDate.toLocalDate();
        LocalDate ldateEnd = lend.toLocalDate();

        LocalTime ltimeStart = startDate.toLocalTime();
        LocalTime ltimeEnd = lend.toLocalTime();

        if (startDate.isAfter(lend)) {
            throw new RuntimeException("Start date should not greater than End date");
        }
        Period period = Period.between(ldateStart, ldateEnd);
        Duration duration = Duration.between(ltimeStart, ltimeEnd);

        long durationAtSeconds = duration.getSeconds();
        if (durationAtSeconds < 0) {
            period = period.minusDays(1);
            if (period.getDays() < 0) {
                // 2020, Month.JUNE, 27, 16, 20, 20
                // 2020, Month.JULY, 27, 10, 27, 30
                period = period.minusMonths(1);
                int dayOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
                period = period.withDays(dayOfMonth - 1);
            }
            durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
        }
        long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);

        long remainingMinutes = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours);
        long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);
        long seconds = remainingMinutes - TimeUnit.MINUTES.toSeconds(minutes);

        System.out.println("The relationship began at: " + ldateStart.getDayOfWeek());

        System.out.println("The relationship began \nyears: " + period.getYears()
                + "\nmonths: " + period.getMonths()
                + "\ndays: " + period.getDays()
                + "\nhours: " + hours
                + "\nminutes: " + minutes
                + "\nseconds: " + seconds);
    }

}

