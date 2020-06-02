package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.WeekdayUtils;

public class Ex02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int weekday = cal.get(Calendar.DAY_OF_WEEK);

		// System.out.println("DayOfWeek : " + WeekdayUtils[weekday + 1]);
	}
}
