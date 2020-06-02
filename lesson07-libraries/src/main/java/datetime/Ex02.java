package datetime;

import java.util.Calendar;

import utils.WeekDayUtils;

public class Ex02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		WeekDayUtils.getDayOfWeek(weekday);
		//DayOfWeek[] dayOfWeeks = DayOfWeek.values();
		//System.out.println("DayOfWeek: " + dayOfWeeks[weekday - 1]);	

	}

}

/* enum DayOfWeek {
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7);
	
	private int value;
	private DayOfWeek(int value) {
		this.value = value;
	}
	private int getValue() {
		return value;
	}
}*/
