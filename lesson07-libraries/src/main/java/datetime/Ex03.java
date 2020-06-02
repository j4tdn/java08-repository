package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.WeekdayUtils;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		Calendar ctemp = Calendar.getInstance();
		ctemp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		ctemp.set(Calendar.MONTH, c.get(Calendar.MONTH));

		System.out.println(c.get(Calendar.DATE));

		for (int i = 1; i <= maxDayOfMonth; i++) {
			ctemp.set(Calendar.DAY_OF_MONTH, i);

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss EEE");

			System.out.println(
					df.format(ctemp.getTime()) + " " 
			+ WeekdayUtils.getDayOfWeek(ctemp.get(Calendar.DAY_OF_WEEK)));
		}
	}
}
