package datetime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, 6, 27, 15, 30);
		LocalDateTime lend = LocalDateTime.of(2020, Month.JULY, 27, 10, 30);
		LocalDate ldatestart = lstart.toLocalDate();
		LocalDate ldateend = lend.toLocalDate();
		// tinh khoan cach giua ngay thang nam
		Period period = Period.between(ldatestart, ldateend); // chi lay trong khoan thoi gian tu dau den truoc ngay ket
																// thuc
		System.out.println("period: " + period);
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
				//2020 Month.June, 27, 15, 30
				//2020 Month.July, 26, 10, 30
				
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
