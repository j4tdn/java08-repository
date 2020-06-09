package utils;

import java.text.SimpleDateFormat;

public final class DateUtils {
	//private static final String DATE_PATTEN = "dd/MM/yyyy EEEE";

	public static String toString(java.util.Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date can not null");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(pattern);
		}
		return new SimpleDateFormat(pattern).format(date);
	}

	private DateUtils() {
		// TODO Auto-generated constructor stub
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
