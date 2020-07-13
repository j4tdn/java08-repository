package Ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01_Java08 {
	public static LocalDate date = LocalDate.now();
	public static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday();
	}
	
	public static void getAllSundaysInYear() {
		int year = 2020;
		
		LocalDate date = LocalDate.of(year, 1, 1);
		while ( date.getDayOfWeek() != DayOfWeek.SUNDAY )
		{
		  date = date.plusDays(1);
		}

		while (date.getYear() == year )
		{
		  System.out.println(date.format(df));
		  date = date.plusWeeks(1);
		}
	}
	
	public static void getLastSunday() {
		int year = 2020;
		LocalDate finalMonth = LocalDate.of(year, 12, 31);
		
		while(finalMonth.getDayOfWeek() != DayOfWeek.SUNDAY) {
			finalMonth = finalMonth.minusDays(1);
    	}
		System.out.println("Chủ nhật cuối cùng: " + finalMonth.format(df));
	}
}
