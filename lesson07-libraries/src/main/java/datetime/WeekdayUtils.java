package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class WeekdayUtils {
	private WeekdayUtils() {
		
	}
	
	public static Date toDate(Calendar	c) {
		if(c==null) {
			throw new RuntimeException("date cannot be null!!");
		}
		return c.getTime();
	}
	
	public static Date toDate(String s,String pattern) throws ParseException {
		if(s==null||pattern==null) {
			throw new RuntimeException("date cannot be null!!");
		}
		return new SimpleDateFormat().parse(s);
	}
	
	public static String toStringCalendar( Date date, String pattern) {
		if(date == null) {
			throw new RuntimeException("date cannot be null!!");
		}
		if(pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static String toStringDate( Date date, String pattern) {
		if(date == null) {
			throw new RuntimeException("date cannot be null!!");
		}
		if(pattern == null) {
			return new SimpleDateFormat().format(date.getTime());
		}
		return new SimpleDateFormat(pattern).format(date.getTime());
	}
	
	public static Calendar toCalendar(Date date) {
		if(date == null) {
			throw new RuntimeException("date cannot be null!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	public static Calendar toCalendar(String s, String pattern) throws ParseException {
		if(s == null) {
			throw new RuntimeException("date cannot be null!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(toDate(s, pattern));
		return c;
	}
	
	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		if(weekdayIndex<1||weekdayIndex>7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdayIndex-1];
	}

}

enum DayOfWeek {
	SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURDAY,FRIDAY,SATURDAY,NULL;
}
