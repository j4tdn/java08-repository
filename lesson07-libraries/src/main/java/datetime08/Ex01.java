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
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE"); // Ldate->String
		LocalDate ldate = LocalDate.now().withMonth(Month.AUGUST.getValue());// set lai
		// ldate.plus// cong them
		// ldate.minus// giam

		LocalDate sdate = LocalDate.parse("1930/06/23", DateTimeFormatter.ofPattern("yyyy/MM/dd"));

		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 17);

		LocalDateTime ldatetime = LocalDateTime.now();
		ldatetime.toLocalDate();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		
		System.out.println("Ltime minute: " + ltime.getMinute());
		System.out.println("Ldate: " + ldate);
		System.out.println("Ldate dd/MM/yyyy: " + df.format(ldate));
		System.out.println("Ltime: " + ltime);
		System.out.println("sdate: " + sdate);
		System.out.println("ldatetiem: " + dtf.format(ldatetime));
	}
}
