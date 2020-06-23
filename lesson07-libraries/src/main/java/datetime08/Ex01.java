package datetime08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import javax.swing.text.DateFormatter;

public class Ex01 {
	public static void main(String[] args) {

		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy E");//date => string
	//	LocalDate sdate=LocalDate.parse("2026-09-05",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		
		
		LocalDate ldate=LocalDate.now().withMonth(10);
		//tháng :1->12
		
		//ldate.plus();
		//ldate.minus(amountToSubtract);
		
		LocalTime ltime=LocalTime.now();
		ltime=ltime.with(ChronoField.HOUR_OF_DAY,17);
		
		LocalDateTime datetime=LocalDateTime.now();
		
		
		System.out.println(ldate);
		System.out.println("ldate: dd/MM/yyyy:  "+df.format(ldate));
		System.out.println(ltime);
		System.out.println("ltime minute:  "+ltime.getMinute());
		//System.out.println("sdate:  "+sdate);
		
	}
}
