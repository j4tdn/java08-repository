package datetime;

import java.util.Calendar;

import utils.WeekdayUtils;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		WeekdayUtils.getDayOfWeek(weekday);
	}

	
}
