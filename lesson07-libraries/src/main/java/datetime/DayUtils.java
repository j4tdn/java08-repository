package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DayUtils {
	private DayUtils() {

	}

	public static Date toDate(Calendar c) {
		if (c == null) {
			throw new RuntimeException("Calander can not be null!!!");
		}
		return c.getTime();
	}

	public static Date toDate(String s, String pattern) throws ParseException {
		if (s == null || pattern == null) {
			throw new RuntimeException("Date string can not be null!!!");
		}
		return new SimpleDateFormat(pattern).parse(s);
	}

	public static String toString(Date date, String partten) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null !!");
		}
		if (partten == null) {
			new SimpleDateFormat().format(date);
		}

		return new SimpleDateFormat(partten).format(date);
	}

	public static String toString(Calendar c, String partten) {
		if (c == null) {
			throw new RuntimeException("Date cannot be null !!");
		}
		if (partten == null) {

			new SimpleDateFormat().format(c.getTime());
		}

		return new SimpleDateFormat(partten).format(c.getTime());
	}

	public static Calendar toCalendar(Date date) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null !!");
		}

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	public static Calendar toCalendar(String s, String pattern) throws ParseException {
		if (s == null || pattern == null) {
			throw new RuntimeException("Date string can not be null!!!");
		}

		Calendar c = Calendar.getInstance();
		c.setTime(toDate(s, pattern));
		return c;
	}

	//////////////////////////////////////////////////////////////

	public static DateFormat df = new SimpleDateFormat();

	public static DayOfWeek getDayOfWeek(int weekDayIndex) {
		if (weekDayIndex < 1 || weekDayIndex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekDayIndex - 1];
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}