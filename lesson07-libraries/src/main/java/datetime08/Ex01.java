package datetime08;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import javax.swing.text.DateFormatter;

public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
		
		LocalDate sdate=LocalDate.parse("1930/06/23",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate ldate=LocalDate.now().withMonth(Month.AUGUST.getValue());//set lai
		//ldate.plus// cong them
		//ldate.minus// giam 
		
		LocalTime ltime=LocalTime.now();
		ltime=ltime.with(ChronoField.HOUR_OF_DAY, 17);
		
		LocalDateTime ldatetime=LocalDateTime.now();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
		
		System.out.println("Ltime minute: "+ltime.getMinute());
		System.out.println("Ldate: "+ldate);
		System.out.println("Ldate dd/MM/yyyy: "+df.format(ldate));
		System.out.println("Ltime: "+ltime);
		System.out.println("sdate: "+sdate);
		System.out.println("Ldatetime: "+dtf.format(ldatetime));
	}
}
