package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		// LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE, 27, 16, 20, 20);
		// LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 27, 30);

		LocalDateTime lstart = LocalDateTime.of(2016, Month.DECEMBER, 8, 0, 0, 0);
		LocalDateTime lend = LocalDateTime.now();

		theUltimateRelationshipCalculator(lstart, lend);
	}

	public static void theUltimateRelationshipCalculator(LocalDateTime lstart, LocalDateTime lend) {

		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		Period period = Period.between(ldateStart, ldateEnd);

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		if (lstart.isAfter(lend)) {
			throw new RuntimeException("Start date should not greater than End date");
		}

		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		long durationAtSeconds = duration.getSeconds();

		if (durationAtSeconds < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {

				// 2020, Month.JUNE, 27, 16, 20, 20
				// 2020, Month.JULY, 27, 10, 27, 30

				period = period.minusMonths(1);
				int daysOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(daysOfMonth - 1);
			}
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}

		long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);
		long minutes = TimeUnit.SECONDS.toMinutes(durationAtSeconds - TimeUnit.HOURS.toSeconds(hours));
		long seconds = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours) - TimeUnit.MINUTES.toSeconds(minutes);

		System.out.println("Hai bạn đã bên nhau được " + period.getYears() + " năm, " + period.getMonths() + " tháng, "
				+ period.getDays() + " ngày, " + hours + " giờ, " + minutes + " phút, " + seconds + " giây");
	}

}