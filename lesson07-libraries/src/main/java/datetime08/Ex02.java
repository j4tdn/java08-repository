package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, 6, 22, 23, 5, 10);
		LocalDateTime lend = LocalDateTime.now();
		if (lstart.isAfter(lend)) {
			throw new RuntimeException("Start date should not greater than End");
		}
		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		Period period = Period.between(ldateStart, ldateEnd);

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		Duration duration = Duration.between(ltimeStart, ltimeEnd);
		long durationAtSeconds = duration.getSeconds();
		if (durationAtSeconds < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				period = period.withDays(ldateStart.lengthOfMonth() - 1);
			}
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}
		long hour = TimeUnit.SECONDS.toHours(durationAtSeconds);
		long minute = TimeUnit.SECONDS.toMinutes(durationAtSeconds - TimeUnit.HOURS.toSeconds(hour));
		long seconds = durationAtSeconds - TimeUnit.HOURS.toSeconds(hour) - TimeUnit.MINUTES.toSeconds(minute);

		System.out.println("Year: " + period.getYears());
		System.out.println("Month: " + period.getMonths());
		System.out.println("Day: " + period.getDays());
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
		System.out.println("Seconds: " + seconds);

	}

}
