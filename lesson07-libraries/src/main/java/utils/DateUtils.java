package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

public final class DateUtils {
	//private static final String DATE_PATTEN = "dd/MM/yyyy EEEE";

	private DateUtils() {
		// TODO Auto-generated constructor stub
	}

	public static String toString(java.util.Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date can not null");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(pattern);
		}
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static Date toDate(String c, String patern) throws ParseException {
		if(c==null) {
			throw new RuntimeException("Calender can not null");
		}
		return new SimpleDateFormat().parse(c);
	}
	
	public static Date toDate(Calendar c) {
		if(c==null) {
			throw new RuntimeException("Calender can not null");
		}
		return c.getTime();
	}
	
	public static String toString (Calendar date, String pattern) {
		if(date == null) {
			throw new RuntimeException("Date canot be null");
		}
		
		if(pattern==null) {
			return new SimpleDateFormat().format(date.getTime());
		}
		
		return new SimpleDateFormat(pattern).format(date.getTime());
	}

	public static Calendar toCalendar(Date date) {
		if(date == null) {
			throw new RuntimeException("Date canot be null");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	public static Calendar toCalendar(String date, String pattern) throws ParseException {
		if(date == null) {
			throw new RuntimeException("Date canot be null");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(toDate(date, pattern));
		return c;
	}
	
	public static DateOfWeek getDayOfWeek(int weekdayIndex) {
		if (weekdayIndex < 1 || weekdayIndex > 7) {
			return DateOfWeek.NULL;
		}
		return DateOfWeek.values()[weekdayIndex - 1];
	}
}

enum DateOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}
