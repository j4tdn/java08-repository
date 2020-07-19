package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class DateUtils {
	
	
	public static Date toDate(Calendar c) {
	
		if(c == null) {
			throw new RuntimeException(" Calendar cannot  is nul");
		}
		
		
		return c.getTime();
	}
	
	public static Calendar toCalendar(Date date) {
		
		if(date == null ) {
			throw new RuntimeException("some thing went wrong ");
		}
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		return c ;
	}
	
	
	public static Calendar toCalendar(String str, String pattern) throws ParseException {
		
		if(str ==null || pattern ==null) {
			throw new RuntimeException();
		}
		return  toCalendar(new SimpleDateFormat(pattern).parse(str));
				
	}
	
	
	public static LocalDate toLocalDate(String str , String pattern) throws ParseException {
		
		if(str == null || pattern == null) {
			throw new RuntimeException();
		}
		
		Calendar today = toCalendar(new SimpleDateFormat(pattern).parse(str));
		
		return LocalDate.of(today.get(Calendar.YEAR), today.get(Calendar.MONTH)+1, today.get(Calendar.DAY_OF_MONTH));
		
			
			
	}
	
	
	public static Date toDate(String str, String pattern) throws ParseException {
		
		
		if(str == null || pattern == null) {
			throw new RuntimeException("Date String cannot be null !!!");
		}
		
		return new SimpleDateFormat().parse(str);
	
	}
	
public static String toString(Calendar c, String pattern) {
		
		if(pattern ==null || pattern == null) {
			throw new RuntimeException("date cannot be null !!! " );
		}
		
		if(pattern == null ) {
			return new SimpleDateFormat().format(c.getTime());
		}
		return new SimpleDateFormat(pattern).format(c.getTime());
		
		
		
	}
	
	
	
	
	

	private DateUtils() {
		
	}
	
	public static dayOfWeek getDayOfWeek(int weekDayIndex) {
		
		if(weekDayIndex < 1 || weekDayIndex > 7) {
			return dayOfWeek.NULL;
		}
		
		return dayOfWeek.values()[weekDayIndex - 1 ];
	}
	
	public static String toString(Date date, String pattern) {
		
		if(date ==null ) {
			throw new RuntimeException("date cannot be null !!! " );
		}
		
		if(pattern == null ) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
		
		
		
	}
	
	public static month getMonth(int monthIndex) {
		
		if(monthIndex < 0 || monthIndex >11 ) {
			return month.Null;
		}
		
		return month.values()[monthIndex];
			
			
			
			
	}
	
	
	
	
}
enum dayOfWeek{
	SUNDAY,
	MONTHDAY,
	TUESDAY,
	WEDNESDAY,
	THURDAY,
	FRIDAY,
	STATURDAY, NULL
	;	
}

enum month{
	January,
	February,
	March,
	April,
	May,
	June,
	July,
	August,
	September,
	October,
	November,
	December, 
	Null
}
