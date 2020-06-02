package datetime;

import java.util.Calendar;

import util.WeekDayUtils;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.println(WeekDayUtils.getDayOfWeek(weekDay));
		
		
	}
}


