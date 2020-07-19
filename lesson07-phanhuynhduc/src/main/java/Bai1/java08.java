package Bai1;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.previous;

import java.time.DayOfWeek;

public class java08 {
	public static final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyyy");
	
	
	public static void main(String[] args) {
		getAllSundaysInYear(2020);
		getLastSunday(2020);
	}
	
	
	public static void getAllSundaysInYear( int year) {
		LocalDate today = LocalDate.of(year, 1, 1);
		
//		System.out.println(today.getDayOfWeek());
//		
//		today = today.plusDays(1);
//		
//		 
//		
//		
//		
//		System.out.println(df.format(today));
		
		
		while(today.getYear() == year) {
			
			if(today.getDayOfWeek() == DayOfWeek.SUNDAY) {
				
				
				System.out.println(df.format(today));
				today = today.plusDays(1);
				
			}
			else {
								
				today = today.plusDays(1);
			}
		}
		
	}
	
	public static void getLastSunday(int year) {
		
		LocalDate today = LocalDate.of(year, 12, 31);
		
		while(today.getDayOfWeek() != DayOfWeek.SUNDAY) {
			
			today = today.minusDays(1);
		}
		
		System.out.println(df.format(today));
	}
	
	
}
