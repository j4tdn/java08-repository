package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DayUtils {
	private DayUtils() {

	}

	public static String toString(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date can't be null");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
	}

	public static DateFormat df = new SimpleDateFormat();

	public static DayOfWeek getDayOfWeek(int weekdayindex) {
		if (weekdayindex < 1 || weekdayindex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdayindex - 1];

	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}