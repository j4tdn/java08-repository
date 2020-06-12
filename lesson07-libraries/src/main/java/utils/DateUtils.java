package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {
	public static DateFormat df = new SimpleDateFormat();

	private DateUtils() {

	}

	public static String toString(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null!!!");
		}
		return pattern == null ? df.format(date) : new SimpleDateFormat(pattern).format(date);
	}

	public static String toString(Calendar c, String pattern) {
		if (c == null) {
			throw new RuntimeException("Calender cannot be null!!!");
		}
		return pattern == null ? df.format(c.getTime()) : new SimpleDateFormat(pattern).format(c.getTime());
	}

	public static Date toDate(Calendar c) {
		if (c == null) {
			throw new RuntimeException("Calendar cannot be null!!! ");
		}
		return c.getTime();
	}

	public static Date toDate(String s, String pattern) throws ParseException {
		if (s == null || pattern == null) {
			throw new RuntimeException("Date string cannot be null!!! ");
		}
		return df.parse(s);
	}

	public static Calendar toCalender(Date date) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null!!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	public static Calendar toCalender(String s, String pattern) throws ParseException {
		if (s == null) {
			throw new RuntimeException("Date string cannot be null!!! ");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(toDate(s, pattern));
		return c;
	}

	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		return weekdayIndex < 1 || weekdayIndex > 7 ? DayOfWeek.NULL : DayOfWeek.values()[weekdayIndex - 1];
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL
}