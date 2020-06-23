package datetime08;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate lday = LocalDate.now().withMonth(Month.AUGUST.getValue());
		LocalDate sdate = LocalDate.parse("1997-04-24");

		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 17);
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyy'T'HH:mm:ss");

		System.out.println(lday);
		System.out.println("lday dd/MM/yyy: " + df.format(lday));
		System.out.println(ltime);
		System.out.println(ltime.getMinute());
		System.out.println("sdate : " + dft.format(sdate));
	}
}
