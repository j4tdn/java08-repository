package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

public final class DateUtils {
	private DateUtils() {

	}

	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		if (weekdayIndex < 1 || weekdayIndex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdayIndex - 1];
	}

	public static String toString(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date can not be null!!");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}
