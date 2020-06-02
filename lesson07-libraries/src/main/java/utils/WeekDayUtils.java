package utils;

public final class WeekDayUtils {
	
    private WeekDayUtils() {
		// TODO Auto-generated constructor stub
	}
    public static DayOfWeek getDayOfWeek(int weekdayIndex) {
    	if(weekdayIndex < 1 || weekdayIndex > 7) {
    		return DayOfWeek.NULL;
    	}
    	return DayOfWeek.values()[weekdayIndex - 1];
    }
}
enum DayOfWeek {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	NULL
}