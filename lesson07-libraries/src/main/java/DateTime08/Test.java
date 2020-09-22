package DateTime08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test {
	public static void main(String[] args) {
	
		LocalDate dateStart = LocalDate.now().of(2020,Month.OCTOBER,20);
		
		LocalDate dateEnd = LocalDate.now().of(2020,Month.NOVEMBER,20);
		
		Period period = Period.between(dateStart, dateEnd);
		
		System.out.println(period.getMonths());
		
		System.out.println(period.getDays());
		
		period.minusDays(1);
		
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		
	
		
	}
	
	
	
}
