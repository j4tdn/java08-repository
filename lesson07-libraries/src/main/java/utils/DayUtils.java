package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DayUtils {
	
	private DayUtils() {
		
	}
	
	//Calender-Date
	public static Date toDate(Calendar c) {
		if(c==null) {
			throw new RuntimeException("Calender cannot be null!!!!");
		}
		 return c.getTime();
	}
	//String-Date => k can pattern 
	public static Date toDate(String s,String pattern) throws ParseException {
		if(s==null||pattern==null) {
			throw new RuntimeException("Date string cannot be null!!!!");
		}
		 return new SimpleDateFormat().parse(s);
	}
	// Date-String => can pattern
	public static String toString(Date date, String pattern) {
		
		if (date == null) {
			throw new RuntimeException("Date cannot null");
		}
		
		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		
		return new SimpleDateFormat(pattern).format(date);
	}
	//c-date-string
public static String toString(Calendar c, String pattern) {
		
		if (c == null) {
			throw new RuntimeException("Calender cannot null");
		}
		
		if (pattern == null) {
			return new SimpleDateFormat().format(c.getTime());
		}
		
		return new SimpleDateFormat(pattern).format(c.getTime());
	}

//date-calender
public static Calendar toCalendar(Date date) {
	if(date ==null) {
		throw new RuntimeException("Date cannot be null!!!");
		
	}
	Calendar c=Calendar.getInstance();
	c.setTime(date);
	return c;
}
//String-Calender
public static Calendar toCalendar(String s,String pattern) throws ParseException {
	if(s ==null) {
		throw new RuntimeException("Date cannot be null!!!");
		
	}
	Calendar c=Calendar.getInstance();
	c.setTime(toDate(s,pattern));
	return c;
}
	
	public static DateFormat df = new SimpleDateFormat();
	
	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		if (weekdayIndex < 1 || weekdayIndex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdayIndex - 1];
	}
}

enum DayOfWeek{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}
