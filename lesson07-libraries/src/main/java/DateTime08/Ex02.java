package DateTime08;

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
		LocalDateTime lstart = LocalDateTime.now().of(2020, Month.JUNE,27,16, 20, 20);
		
		LocalDateTime lend = LocalDateTime.now().of(2020,Month.JULY,27,10,27,30);
		
		
		
		
		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();
		
		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();
		
		if(lstart.isAfter(lend)) {
			throw new RuntimeException("start date should not greater than end date");
		}
		
		
		// Period  support day, month , year ;
		
		Period period = Period.between(ldateStart, ldateEnd);
		
		// duration support hour, minutes, seconds 
		
		Duration dr = Duration.between(ltimeStart, ltimeEnd);
		
		long durationAtSeconds = dr.getSeconds();
		
		if(durationAtSeconds < 0) {
			period = period.minusDays(1);
			
			if(period.getDays() < 0) {
				period = period.minusMonths(1);
				
				int daysOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				
				period = period.withDays(daysOfMonth-1);
							
			}
			
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}
		
		
		
		long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);
		
		long remainingMinutes = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours);
		
		long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);
		
		long seconds = remainingMinutes - TimeUnit.MINUTES.toSeconds(minutes);
		
		
		
		System.out.println("Period " + period);
		
		System.out.println("years : " + period.getYears());
		System.out.println("month "+ period.getMonths());
		System.out.println("days :" + period.getDays());
		System.out.println("hour : " +hours);
		System.out.println("minutes" +minutes);
		System.out.println("seconds " + seconds);
	}
}
