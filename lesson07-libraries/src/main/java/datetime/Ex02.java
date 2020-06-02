package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.WeekdayUtils;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2020);
		GregorianCalendar a = new GregorianCalendar();
		System.out.println(a.isLeapYear(c.get(Calendar.YEAR)));
		
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		
		
		System.out.println("Weekday: " + WeekdayUtils.getDayOfWeek(weekday));
	}
}


