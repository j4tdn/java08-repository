package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {
	public static DateFormat df = new SimpleDateFormat();

	private DateUtils() {

	}

	public static String toString(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date cannot be null!!!");
		}
		return pattern == null ? new SimpleDateFormat().format(date) : new SimpleDateFormat(pattern).format(date);
	}

	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		return weekdayIndex < 1 || weekdayIndex > 7 ? DayOfWeek.NULL : DayOfWeek.values()[weekdayIndex - 1];
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL
}