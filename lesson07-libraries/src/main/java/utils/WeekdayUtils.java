package utils;

public final class WeekdayUtils {
	private WeekdayUtils() {

	}

	public static DayOfWeek getDayOfWeek(int weekdaynIdex) {
		if (weekdaynIdex < 1 || weekdaynIdex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdaynIdex-1];

	}
}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY, NULL
}
