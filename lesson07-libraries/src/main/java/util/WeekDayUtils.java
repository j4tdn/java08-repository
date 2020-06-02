package util;

public class WeekDayUtils {

	private WeekDayUtils() {
		
	}
	
	public static dayOfWeek getDayOfWeek(int weekDayIndex) {
		
		if(weekDayIndex < 1 || weekDayIndex > 7) {
			return dayOfWeek.NULL;
		}
		
		return dayOfWeek.values()[weekDayIndex - 1 ];
	}
	
}
enum dayOfWeek{
	SUNDAY,
	MONTHDAY,
	TUESDAY,
	WEDNESDAY,
	THURDAY,
	FRIDAY,
	STATURDAY, NULL
	;	
}
