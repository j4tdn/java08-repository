package datetime08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
		LocalDate sdate = LocalDate.parse("1930/06/23", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		
		LocalDate ldate = LocalDate.now().withMonth(Month.AUGUST.getValue());	
		
		// ldate.withMonth(3);  // withMonth create new object, not set value
		// ldate = ldate.withMonth(3); // it work
		
		// push: add day, minus: sub day

		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 17);
		// ltime.atDate(ldate);
		
		LocalDateTime ldatetime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		// ldatetime.toLocalDate();
		
		System.out.println("ldate: " + ldate);
		System.out.println("ldate dd/MM/yyyy: " + df.format(ldate));
		System.out.println("\nltime: " + ltime);
		System.out.println("ltime minute: " + ltime.getMinute());
		
		System.out.println("\nsdate: " + sdate);
		System.out.println("ldatetime: " + dtf.format(ldatetime));
	}
}
