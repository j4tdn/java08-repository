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
		LocalDate lDate = LocalDate.now().withMonth(Month.AUGUST.getValue());
		// builder, khi set month thi thay doi gia tri
		
		//convert String -> Date
		LocalDate sdate = LocalDate.parse("2020/06/03", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		
		
		LocalTime lTime = LocalTime.now();
		lTime=lTime.with(ChronoField.HOUR_OF_DAY,17);
		
		LocalDateTime ldaDateTime = LocalDateTime.now();
		//LocalDAtetime ->localDAte;
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		
		System.out.println("lDate: "+lDate);
		System.out.println("ldatet dd/MM/yyyy: "+df.format(lDate));
		System.out.println(lTime);
		System.out.println("lTime minutes: "+lTime.getMinute());
		System.out.println("lTime minutes: "+sdate);
		System.out.println("lTime minutes: "+dtf.format(ldaDateTime));		
		
		
	}
}
