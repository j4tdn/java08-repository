package utils;

public final class WeekdayUtils {

	private WeekdayUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static DateOfWeek getDayOfWeek(int weekdayIndex) {
		if(weekdayIndex<1 || weekdayIndex>7) {
			return DateOfWeek.NULL;
		}
		
		
		return DateOfWeek.values()[weekdayIndex-1];
	}
}

enum DateOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,NULL;
}
