package datetime08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex01 {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy E");
		LocalDate ldate = LocalDate.now().withMonth(Month.AUGUST.getValue());
//		ldate = ldate.withMonth(8);
		//plus,
		LocalTime ltime = LocalTime.now();
		ltime = ltime.with(ChronoField.HOUR_OF_DAY, 17);
		
		LocalDate sdate = LocalDate.parse("1930/06/23",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDateTime lDateTime = LocalDateTime.now();
//		lDateTime.toLocalDate();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		
		System.out.println(ltime.getMinute());
		System.out.println(ldate);
		System.out.println(ltime);
		System.out.println("ldate: dd/MM/yy" + df.format(ldate) );
		System.out.println("sdate: " + sdate );
		System.out.println("ldateTime: " + dtf.format(lDateTime));
	}

}
