package DateTime08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now().withMonth(Month.AUGUST.getValue());

		

		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy E");
		
		LocalDate sdate = LocalDate.parse("1930/06/23",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		
		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 17);
		
		LocalDateTime ldateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'phd'HH:mm:ss");
		
		
		System.out.println("sdate " +sdate);
		
		
		System.out.println("ldate " +ldate);
		System.out.println("ltime "+ltime);
		
		System.out.println("ldate : dd/MM/yyyy" + df.format(ldate));
		
		System.out.println("ltime minute " + ltime.getMinute());
		
		System.out.println("ldateTime" + dtf.format(ldateTime));
		
	}
}
