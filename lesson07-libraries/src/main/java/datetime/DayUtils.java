package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DayUtils {
	private DayUtils() {

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