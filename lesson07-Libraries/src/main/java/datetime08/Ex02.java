package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2017, Month.APRIL, 1, 17, 22);
		LocalDateTime lend = LocalDateTime.now();

		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		Period period = Period.between(ldateStart, ldateEnd);

		long durationAtSecond = duration.getSeconds();
		if (durationAtSecond < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				int daysOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(daysOfMonth - 1);
			}
		}

		period.minusDays(1);
		System.out.println(period);
		System.out.println(
				"year :" + period.getYears() + " \nmonth :" + period.getMonths() + " \nday " + period.getDays());
		System.out.println(period.toTotalMonths());

		long hour = TimeUnit.SECONDS.toHours(duration.toSeconds());
		long remainMinutes = durationAtSecond - TimeUnit.HOURS.toSeconds(hour);

		System.out.println(duration);

		System.out.println(duration.getSeconds());
	}
}
