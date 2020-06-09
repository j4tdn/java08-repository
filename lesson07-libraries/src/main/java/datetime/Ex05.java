package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DayUtils;

public class Ex05 {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		int firstDayOfWeek = today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK)
				+ today.getFirstDayOfWeek();
		Calendar fdowCal = Calendar.getInstance();
		// fdowCal.set(Calendar.DAY_OF_MONTH, firstDayOfWeek);
		fdowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstDayOfWeek);

		Calendar ldowCal = Calendar.getInstance();
		ldowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstDayOfWeek + 7);
		
		System.out.println("ldowCal   "+ldowCal.getTimeInMillis());
		for (Calendar c = fdowCal; c.getTime().before(ldowCal.getTime()); c.add(Calendar.DAY_OF_MONTH, 1)) {
			
			System.out.println("milliseconds    "+c.getTimeInMillis());
			System.out.println(DayUtils.toString(c.getTime(), "dd-MM-yy EEE"));
		}
	}
}