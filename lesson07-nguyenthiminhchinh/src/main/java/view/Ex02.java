package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDateTime lstart = LocalDateTime.of(2020, Month.JUNE, 27, 16, 20, 20);;

		System.out.println("Chia tay chua?");
		System.out.println("1. Roi \n2.Chua");
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			LocalDateTime lendY = LocalDateTime.of(2020, Month.JULY, 27, 16, 20, 20);
			TimeRelationship(lstart, lendY);
			break;
		case 2:
			LocalDateTime lendN = LocalDateTime.now();
			TimeRelationship(lstart, lendN);
			break;
		}
	}

	private static void TimeRelationship(LocalDateTime lstart, LocalDateTime lend) {
		LocalDate ldateStart = lstart.toLocalDate();
		LocalDate ldateEnd = lend.toLocalDate();

		LocalTime ltimeStart = lstart.toLocalTime();
		LocalTime ltimeEnd = lend.toLocalTime();

		if (lstart.isAfter(lend)) {
			throw new RuntimeException("start date should not greater than end date");
		}

		// Khoang cach giua 2 ngay thang nam
		Period period = Period.between(ldateStart, ldateEnd); // ngay 1 den 4 thi chi tinh 1,2,3 ngay
		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		long durationAtSeconds = duration.getSeconds();

		if (durationAtSeconds < 0) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				// (2020, Month.JUNE, 27, 16, 20, 20);
				// (2020, Month.JULY, 27, 16, 20, 20);
				period = period.minusMonths(1);
				int dateOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				period = period.withDays(dateOfMonth - 1);
			}
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}
		long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);
		long remainingMinutes = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours);
		long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);
		long seconds = remainingMinutes - TimeUnit.MINUTES.toSeconds(minutes);

		System.out.println("Bat dau vao thu: " + ldateStart.getDayOfWeek());
		
		System.out.println("Moi tinh duoc: \n" 
				+ "years: " 	+ period.getYears() 
				+ "\nmonths: " 	+ period.getMonths() 
				+ "\ndays: " 	+ period.getDays()
				+ "\nhours: " 	+ hours
				+ "\nminutes: " + minutes
				+ "\nseconds: " + seconds
				);
	}

}
