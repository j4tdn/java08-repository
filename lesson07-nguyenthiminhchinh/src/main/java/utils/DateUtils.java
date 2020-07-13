package utils;

public class DateUtils {
	public static DayOfWeek getDayOfWeek(int weekdayIndex) {
		if (weekdayIndex < 1 || weekdayIndex > 7) {
			return DayOfWeek.NULL;
		}
		return DayOfWeek.values()[weekdayIndex - 1];
	}

	public static DayOfMonth getDayOfMonth(int monthIndex) {
		if (monthIndex < 1 || monthIndex > 12) {
			return DayOfMonth.NULL;
		}
		return DayOfMonth.values()[monthIndex];

	}

}

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NULL;
}

enum DayOfMonth {
	January, February, March, April, May, June, July, August, September, October, November, December, NULL
}
