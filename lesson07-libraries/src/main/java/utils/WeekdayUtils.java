package utils;

public final class WeekdayUtils {
	private WeekdayUtils() {

	}

	public static DayOfWeeK getDayOfWeek(int weekdayindex) {
		if (weekdayindex < 1 || weekdayindex > 7) {
			return DayOfWeeK.NULL;
		}
		return DayOfWeeK.values()[weekdayindex -1];
	}
}

enum DayOfWeeK {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY, NULL
}