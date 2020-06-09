package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

public final class DateUtils {
	private DateUtils() {

	}

	public static String Tostring(Date date, String pattern) {
		if (date == null) {
			throw new RuntimeException("Date cann't be null!!");
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