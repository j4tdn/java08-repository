package utils;

public final class WeekDayUtils {
	private WeekDayUtils() {

	}

	public static DayOfWeek getDayOfWeek(int weekdayindex) {
		if (weekdayindex < 1 || weekdayindex > 7) {
			return DayOfWeek.NULL;
		}
			return DayOfWeek.values()[weekdayindex-1];
		
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}