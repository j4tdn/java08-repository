package datetime08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withMonth(Month.AUGUST.getValue());
		
		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 5);
		
		LocalDateTime ldatetime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy'T'HH:mm:ss");
		
		System.out.println("ldatee: " + ldate);
		System.out.println("ltime: " + ltime);
		
		System.out.println("ltime minutes: " + ltime.getMinute());
		
		System.out.println("ldate dd/MM/yyyy: " + ldate.format(df) );
		
		LocalDate sdate = LocalDate.parse("24/07/2020", df);
		System.out.println("sdate: " + sdate);
		
		System.out.println("ldatetime" + dtf.format(ldatetime));

	}
}
