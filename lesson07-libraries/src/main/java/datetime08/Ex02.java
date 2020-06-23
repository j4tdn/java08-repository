package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

public class Ex02 {

	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE, 27, 16, 20, 20);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 22, 10);

		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		if(lstart.isAfter(lend)) {
		 throw new RuntimeException("Start date should not greater than End date");	
		}
		
		Period period = Period.between(ldateStart, ldateEnd);
		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		long duraitionAtSeconds = duration.getSeconds();

		if (duraitionAtSeconds < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				int dayOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(dayOfMonth - 1);
			}
			duraitionAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}
		long hours = TimeUnit.SECONDS.toHours(duraitionAtSeconds);
		long remainingMinutes = duraitionAtSeconds - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);
		long second = remainingMinutes - TimeUnit.MINUTES.toSeconds(minutes);

		System.out.println("year :" + period.getYears() + " month: " + period.getMonths() + " day: " + period.getDays()
				+ "\nHours: " + hours + " Minute: " + minutes + " Second: " + second);
	}

}
