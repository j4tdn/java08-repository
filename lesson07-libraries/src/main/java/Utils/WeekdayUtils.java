package Utils;

import java.time.DayOfWeek;

public final class WeekdayUtils {
	private WeekdayUtils() {
		
	}
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