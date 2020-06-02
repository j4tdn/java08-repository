package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.WeekdayUtils;

public class Ex03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cals = Calendar.getInstance();
		int maxDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i < maxDayOfMonth; i++) {
			cals.set(Calendar.DAY_OF_MONTH, i);
			DateFormat df = new SimpleDateFormat("EE-dd-MM-YYYY");
			System.out.println(
					df.format(cals.getTime()) + " - " + WeekdayUtils.getDayOfWeek(cals.get(Calendar.DAY_OF_WEEK)));
		}
	}
}
