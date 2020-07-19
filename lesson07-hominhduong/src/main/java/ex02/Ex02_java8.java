package ex02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.concurrent.TimeUnit;

public class Ex02_java8 {
	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE.getValue(), 27, 16, 20, 20);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY.getValue(), 10, 15, 10, 7);
		relationshipCalculator(lstart, null);

	}

	private static void relationshipCalculator(LocalDateTime llstart, LocalDateTime llend) {
		LocalDateTime lstart = LocalDateTime.of(2020, 6, 27, 15, 30);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 30);
		LocalDate ldatestart = lstart.toLocalDate();
		LocalDate ldateend = lend.toLocalDate();
		System.out.println(lstart.getDayOfWeek());
		Period period = Period.between(ldatestart, ldateend);
		System.out.println(
				"year: " + period.getYears() + "\tmonth: " + period.getMonths() + "\tdate: " + period.getDays());

		LocalTime lTimeStart = lstart.toLocalTime();
		LocalTime lTimeEnd = lend.toLocalTime();
		if(lstart.isAfter(lend)){
			throw new RuntimeException("start date should not greater than end date");
		}
		Duration duration = Duration.between(lTimeStart, lTimeEnd);
		long durationAtSecond = duration.getSeconds();
		// durationAtSecond
		
		/*
		 * tinh khoan thoi gian ngay dau, ngay cuoi
		 */
		if (durationAtSecond < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				int dayOfMonth = YearMonth.of(ldatestart.getYear(),ldatestart.getMonthValue()).lengthOfMonth();
				period=period.withDays(dayOfMonth-1);
			}
			durationAtSecond += TimeUnit.DAYS.toSeconds(1);
		}
		long hours = TimeUnit.SECONDS.toHours(durationAtSecond);
		long remainingminute = durationAtSecond - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainingminute);
		long seconds = remainingminute - TimeUnit.MINUTES.toSeconds(minutes);
		System.out.println("year: " + period.getYears() + "\tmonth: " + period.getMonths() + "\tdate: "
				+ period.getDays() + "\thour: " + hours + "\tminnute: " + minutes + "\tseconds: " + seconds);
	}
}
