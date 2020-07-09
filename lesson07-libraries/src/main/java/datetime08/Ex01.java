package datetime08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy E");
		LocalDate sdate = LocalDate.parse("1930/06/23", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
				
		LocalDate ldate = LocalDate.now().withMonth(8);

		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 17);
		
		LocalDateTime ldatetime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");

		System.out.println("ldate: " + ldate);
		System.out.println("ldate dd/MM/yyy: " + df.format(ldate));
		System.out.println("ltime: " + ltime);
		System.out.println("ltime minute: " + ltime.getMinute());
		System.out.println("sdate: " + sdate);
		System.out.println("ldatetime: " + dtf.format(ldatetime));
	}
}
