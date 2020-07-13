package Ex02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex02_Java08 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		LocalDateTime lstart = LocalDateTime.of(2015, Month.JUNE, 27, 16, 20, 20);
		LocalDateTime lend = LocalDateTime.now();
		
		System.out.println("Bạn đang ở tình trạng nào: 1. Đang yêu    2. Đã chia tay");
		int state = ip.nextInt();
		
		switch (state) {
		case 1:
			break;

		case 2: 
			System.out.println("Nhập thời gian chia tay năm-tháng-ngày H:p:s: ");
			int year = ip.nextInt();
			int month = ip.nextInt();
			int day = ip.nextInt();
			
			int hours = ip.nextInt();
			int minutes = ip.nextInt();
			int seconds = ip.nextInt();
			
			lend = lend.of(year, month, day, hours, minutes, seconds);
			break;
			
		default:
			break;
		}
		
		
		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();
		
		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();
		
		if (lstart.isAfter(lend)) {
			throw new RuntimeException("start date should not greater than end date");
		}
		
		Period period =  Period.between(ldateStart, ldateEnd); //ldateEnd - 1
		
		Duration duration = Duration.between(ltimeStart, ltimeEnd); 
		
		long durationAtSeconds = duration.getSeconds();
		if (durationAtSeconds < 0) {
			period = period.minusDays(1); //tru
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				int dayOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(dayOfMonth - 1);
			}
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}
		
		long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);
		
		long remainingMinutes = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);
		
		long seconds = remainingMinutes - TimeUnit.MINUTES.toSeconds(minutes);
		
		System.out.println("years: " + period.getYears() + 
							"\nmonths: " + period.getMonths() + 
							"\ndays: " + period.getDays() + 
							"\nhours: " + hours +
							"\nminutes: " + minutes + 
							"\nseconds: " + seconds);
	}
}