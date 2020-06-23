package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE, 27, 16, 20, 20);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 27, 30);

		LocalDate ldatestart = lstart.toLocalDate();
		LocalDate ldateend = lend.toLocalDate();

		LocalTime ltimestart = lstart.toLocalTime();
		LocalTime ltimeend = lend.toLocalTime();
		
		if(lstart.isAfter(lend)) {
			throw new RuntimeException("start date should not greater than End date");
		}

		Period period = Period.between(ldatestart, ldateend);
		Duration duration = Duration.between(ltimestart, ltimeend);
		long durationAtSeconds = duration.getSeconds();

		if (durationAtSeconds < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				//2020, Month.JUNE, 27, 16, 20, 20
				//2020, Month.JULY, 27, 10, 20, 20
				period = period.minusMonths(1);
				int dayOfMonth = YearMonth.of(ldatestart.getYear(), ldatestart.getMonth()).lengthOfMonth();
				period = period.withDays(dayOfMonth - 1);
			}
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}

		long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);

		long remainingminutes = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainingminutes);

		long seconds = remainingminutes - TimeUnit.MINUTES.toSeconds(minutes);

		System.out.println(" years: " + period.getYears() + "\n month: " + period.getMonths() + "\n date: "
				+ period.getDays() + "\n hours: " + hours + "\n minute: " + minutes + "\n second: " + seconds);
	}
}