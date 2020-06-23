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
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

// caculate date we love
public class Ex02 {
	public static void main(String[] args) {

		LocalDateTime lstart = LocalDateTime.of(2020, Month.MAY, 27, 6, 20, 20);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 4, 17, 10);

		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		// lấy include, không lấy exclude=> tính khoảng cách ngày tháng năm
		Period period = Period.between(ldateStart, ldateEnd);
		// lấy include, không lấy exclude=> tính khoảng cách hms
		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		if (lstart.isAfter(lend)) {
			throw new RuntimeException("Start date should not greater than end date");
		}

		long durationAtSecond = duration.getSeconds();
		if (durationAtSecond < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				// (2020, Month.JUNE, 27, 16, 20, 20);
				// (2020, Month.JULY, 27, 16, 20, 20);
				period = period.minusMonths(1);
				int dateOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(dateOfMonth - 1);
			}
			durationAtSecond += TimeUnit.DAYS.toSeconds(1);
		}
		long hours = TimeUnit.SECONDS.toHours(durationAtSecond);
		long remainingMinutes = durationAtSecond - TimeUnit.HOURS.toSeconds(hours);
		long minute = TimeUnit.SECONDS.toMinutes(remainingMinutes);
		long second = remainingMinutes - TimeUnit.MINUTES.toSeconds(minute);

		System.out.println("year:   " + period.getYears() + "\nmonth:  " + period.getMonths() + "\nday:  "
				+ period.getDays() + "\n===================" + "\nhours: " + hours + "\nminute: " + minute
				+ "\nsecond: " + second);

	}
}
