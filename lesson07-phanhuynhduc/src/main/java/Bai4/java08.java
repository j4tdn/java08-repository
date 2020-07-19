package Bai4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Set;

public class java08 {
	public static void main(String[] args) {
		java08.getTimeInNewYork();
		
		getDayofMonth();
		
		
		Duration();
		weekofYear();
	}
	
	public static void getTimeInNewYork() {
		
		LocalDateTime ld = LocalDateTime.now(ZoneId.of("America/New_York"));
		
		String time = ld.toString();
		
		String[] ldString = time.split("T");
		
		for(String hello : ldString) {
			System.out.println(hello);
		}
		
				
//			Set<String> timezoneid = 	ZoneId.getAvailableZoneIds();
//			
//			timezoneid.forEach(timezone -> System.out.println(timezone));
			
	}
	
	
	public static void getDayofMonth() {
		
		LocalDateTime ld = LocalDateTime.now();
		
		LocalDateTime ld1 = LocalDateTime.now().withDayOfMonth(1);
		
		int count = 0 ;
		
		while(ld1.getMonth() == ld.getMonth()) {
			count ++ ;
			
			ld1 = ld1.plusDays(1);
		}
		System.out.println(count);
	}
	
	public static void getLastDayofMonth() {
		
		int lastDay = 0 ;
		
		LocalDateTime ld = LocalDateTime.now();
		
		LocalDateTime ld1 = LocalDateTime.now().withDayOfMonth(1);
		
		while(ld1.getMonth() == ld.getMonth()) {
			
			lastDay ++ ;
			ld1 = ld1.plusDays(1);
		}
		
		
		System.out.println(lastDay);
		
	}
	
	//5 
	
	public static void weekofYear() {
		
		// bien null trong java 
		
		LocalDateTime ld = null;
		
		ld = LocalDateTime.now();
		
		
		LocalDateTime ld1 = LocalDateTime.now().withDayOfMonth(1).withMonth(1);
		
		
		int count = 0 ;
		
		while(ld1.isBefore(ld)) {
			
			count ++ ;
			ld1 = ld1.plusDays(7);
		}
		
		if(ld.getDayOfWeek() == DayOfWeek.MONDAY) {
			count ++ ;
		}
		
		System.out.println(" tuan thu " +count);
	}
	
	// 6 
	public static void add8Hour() {
		
		LocalDateTime ld = LocalDateTime.now().plusHours(8);
		
		System.out.println(ld);
	}
	
	
	//7
	
	public static void Duration() {
		
		LocalDateTime ld1 = LocalDateTime.now();
		
		LocalDateTime ld2 = LocalDateTime.of(2020, 4, 23, 3, 32,7);
		
		
	
		
		
	}
	
	
	
	
}
