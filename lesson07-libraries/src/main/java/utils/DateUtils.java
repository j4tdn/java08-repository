package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {
	
	private DateUtils() {
		
	}
	
	public static Date toDate(Calendar c) {
		if (c == null) {
			throw new RuntimeException("Calendar cannot be null");
		}
		return c.getTime();
	}
	
	public static Date toDate(String s, String pattern) throws ParseException {
		if (s == null || pattern == null) {
			throw new RuntimeException("Date string cannot be null");
		}
		return new SimpleDateFormat().parse(s);
	}

	public static String toString(Calendar c, String pattern) {
		if (c == null) {
			throw new RuntimeException("Date cannot null");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(c);
		}
		return new SimpleDateFormat(pattern).format(c.getTime());
	}

	public static Calendar toCalendar(Date date) {
		if (date == null) {
			throw new RuntimeException("Date cannot null");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		return c; // cuoi cung timemilis
	}
	
	public static Calendar toCalendar(String s, String pattern) throws ParseException {
		if (s == null) {
			throw new RuntimeException("Date cannot null");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(toDate(s, pattern));
		
		return c; 
	}
	
	public static String toString(Date date, String pattern) {
		
		if (date == null) {
			throw new RuntimeException("Date cannot null");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
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
