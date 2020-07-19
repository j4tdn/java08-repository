package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
