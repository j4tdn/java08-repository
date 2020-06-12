package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

	private DateUtils() {
		// TODO Auto-generated constructor stub
	}

	public static Date toDate(Calendar c) {
		if (c == null) {
			throw new RuntimeException("Calender cannot be null !");
		} else {
			return c.getTime();
		}
	}

	public static Date toDate(String s, String pattern) throws ParseException {
		if (s == null) {
			throw new RuntimeException("Date cannot be null !");
		}
		return new SimpleDateFormat(pattern).parse(s);
	}

	public static Calendar toCalendar(Date date) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null !");
		} else {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			return c;
		}
	}
	
	public static Calendar toCalendar(String s, String pattern) throws ParseException {
		if (s == null) {
			throw new RuntimeException("Date cannot be null !");
		} else {
			Calendar c = Calendar.getInstance();
			c.setTime(toDate(s, pattern));
			return c;
		}
	}


	public static String toString(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null");
		}

		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		} else {
			return new SimpleDateFormat(pattern).format(date);
		}
	}

	public static String toString(Calendar c, String pattern) {
		if (c == null) {
			throw new RuntimeException("Date cannot be null");
		}

		if (pattern == null) {
			return new SimpleDateFormat().format(c.getTime());
		} else {
			return new SimpleDateFormat(pattern).format(c.getTime());
		}
	}

	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		if (weekdayIndex < 1 || weekdayIndex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdayIndex - 1];
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}