package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex02 {

	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, Month.MAY, 27, 16, 20, 20);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 27, 30);
		
		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();
		
		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();
		
		if (lstart.isAfter(lend)) {
			throw new RuntimeException("start date should not greater than end date");
		}
		
		Period period = Period.between(ldateStart, ldateEnd);
		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		
		long durationAtSecond = duration.getSeconds();
		if (durationAtSecond < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				// 2020, Month.JUNE, 27, 16, 20, 20
				// 2020, Month.JULY, 27, 10, 27, 30
				period = period.minusMonths(1);				
				int daysOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(daysOfMonth - 1);
			}
			durationAtSecond += TimeUnit.DAYS.toSeconds(1);
		}
		long hours = TimeUnit.SECONDS.toHours(durationAtSecond);
		long remainningMinutes = durationAtSecond - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainningMinutes);
		long seconds = remainningMinutes - TimeUnit.MINUTES.toSeconds(minutes);
		System.out.println(
				"years: " + period.getYears()
			  + "\nmonths: " + period.getMonths()
			  +	"\ndays: " + period.getDays()
			  +	"\nhours: " + hours
			  +	"\nminutes: " + minutes
			  +	"\nseconds: " + seconds
		);
	}

}
