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
		LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE.getValue(), 27, 16, 20, 20);

		relationshipCalculator(lstart, null);
	
	}
	
	private static void relationshipCalculator(LocalDateTime lstart, LocalDateTime lend) {
		if(lend == null) {
			lend = LocalDateTime.now();
		}
		
		if(lstart.isAfter(lend)) {
			throw new RuntimeException("Start date can not after end date");
		}
		
		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		Period period = Period.between(ldateStart, ldateEnd);

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		long durationAtSecond = duration.getSeconds();

		if (durationAtSecond < 0) {
			period.minusDays(1);
			if (period.getDays() < 0) {

				period = period.minusMonths(1);
				int dayOfMonths = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(dayOfMonths - 1);
			}

			durationAtSecond += TimeUnit.DAYS.toSeconds(1);
		}

		long hours = TimeUnit.SECONDS.toHours(durationAtSecond);

		long minutes = TimeUnit.SECONDS.toMinutes((durationAtSecond - TimeUnit.HOURS.toSeconds(hours)));

		long seconds = durationAtSecond - TimeUnit.HOURS.toSeconds(hours) - TimeUnit.MINUTES.toSeconds(minutes);

		System.out.println("day: " + period.getDays());
		System.out.println("month: " + period.getMonths());
		System.out.println("year:  " + period.getYears());

		System.out.println("===========================");

		System.out.println("hour: " + hours);
		System.out.println("minute: " + minutes);
		System.out.println("second: " + seconds);
	}
}
