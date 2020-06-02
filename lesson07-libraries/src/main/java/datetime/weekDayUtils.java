package datetime;

public final class weekDayUtils {
	private weekDayUtils() {

	}

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