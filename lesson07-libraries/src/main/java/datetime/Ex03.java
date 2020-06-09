package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.MONTH, c.get(Calendar.MONTH));
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));

		for (int date = 1; date <= maxDayOfMonth; date++) {
			ctmp.set(Calendar.DAY_OF_MONTH, date);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy EEE");
			System.out.println(
					df.format(ctmp.getTime()));// + " " + WeekDayUtils.getDayOfWeek(ctmp.get(Calendar.DAY_OF_WEEK)));
		}

	}
}
