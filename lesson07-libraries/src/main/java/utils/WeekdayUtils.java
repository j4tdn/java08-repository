package utils;

public final class WeekdayUtils {
	private WeekdayUtils() {

	}

	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		return weekdayIndex < 1 || weekdayIndex > 7 ? DayOfWeek.NULL : DayOfWeek.values()[weekdayIndex - 1];
	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL
}