package java08.datetime08;

import java.time.*;
import java.util.concurrent.TimeUnit;

public class Ex02 {
    public static void main(String[] args) {
        LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE, 27, 16, 20, 20);
        LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 27, 30);

        LocalDate ldateStart = lstart.toLocalDate();
        LocalDate ldateEnd = lend.toLocalDate();

        LocalTime ltimeStart = lstart.toLocalTime();
        LocalTime ltimeEnd = lend.toLocalTime();

        if (lstart.isAfter(lend)) {
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

        System.out.println("years: " + period.getYears()
                + "\nmonths: " + period.getMonths()
                + "\ndays: " + period.getDays()
                + "\nhours: " + hours
                + "\nminutes: " + minutes
                + "\nseconds: " + seconds);
    }
}
