package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

public final class DateUtils {
	private DateUtils() {

	}

	public static Date toDate(Calendar c) {
		if (c == null) {
			throw new RuntimeException("calendar can not be null !!!");
		}
		return c.getTime();
	}

	public static Date toDate(String s) throws ParseException {
		if (s == null) {
			throw new RuntimeException("calendar can not be null !!!");
		}
		return new SimpleDateFormat().parse(s);
	}

	public static String toString(Calendar c, String pattern) {
		if (c == null) {
			throw new RuntimeException("Date cannot be null !!!");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(c.getTime());
		}
		return new SimpleDateFormat(pattern).format(c.getTime());
	}

	public static String toString(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null !!!");
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

	public static Calendar toCalendar(Date date) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null !!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		return c;
	}

	public static Calendar toCalendar(String s, String pattern) throws ParseException {
		if (s == null) {
			throw new RuntimeException("Date cannot be null !!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(toDate(s));

		return c;
	}

}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATUDAY, NULL;

}
