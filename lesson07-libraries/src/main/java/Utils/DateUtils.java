package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Date;

public final class DateUtils {
	private DateUtils() {
		
	}
	public static String toString(Date date,String pattern) {
		if (date == null ) {
			throw new RuntimeException(" Date cannot be null");
		}
		if (pattern == null) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
		
		
	}
	public static DateFormat df = new SimpleDateFormat();
	public static DayOfWeeks getDayOfWeek(int weekdayIndex) {
		if (weekdayIndex < 1 || weekdayIndex > 7) {
			return DayOfWeeks.NULL;
		}
		
		return DayOfWeeks.values()[weekdayIndex -1];
	}
}

enum DayOfWeeks{
	SUNDAY , MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}