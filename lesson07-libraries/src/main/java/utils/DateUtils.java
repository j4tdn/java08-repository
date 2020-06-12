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
			throw new RuntimeException("Calendar cannot be null!!");
		}
		return c.getTime();
	}

	private static Date toDate(String date, String Pattern) throws ParseException {
		if (date == null || Pattern == null) {
			throw new RuntimeException("Date String cannot be null!!");
		}
		return new SimpleDateFormat(Pattern).parse(date);
	}

	private static String toString(Calendar c, String Pattern) throws ParseException {
		if (c == null || Pattern == null) {
			throw new RuntimeException("Date String cannot be null!!");
		}
		return new SimpleDateFormat().format(c.getTime());
	}

	public static Calendar tocalendar(Date date) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	public static Calendar tocalendar(String s, String pattern) throws ParseException {
		if (s == null) {
			throw new RuntimeException("String cannot be null!!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(toDate(s, pattern));
		return c;
	}

	public static String Tostring(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null!!");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
	}

	public static DateFormat df = new SimpleDateFormat();

	public static DayOfWeeK getDayOfWeek(int weekdayindex) {
		if (weekdayindex < 1 || weekdayindex > 7) {
			return DayOfWeeK.NULL;
		}
		return DayOfWeeK.values()[weekdayindex - 1];
	}
}

enum DayOfWeeK {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY, NULL
}