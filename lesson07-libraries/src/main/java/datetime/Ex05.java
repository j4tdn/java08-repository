package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex05 {
	// private static final String DATE_PATTERN = ;

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

		int firstdayofweek = today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK)
				+ today.getFirstDayOfWeek();

		Calendar fdowCal = Calendar.getInstance();
		fdowCal.set(Calendar.DAY_OF_MONTH, firstdayofweek);

		Calendar ldowCal = Calendar.getInstance();
		ldowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstdayofweek + 7);

		for (Calendar c = fdowCal; c.before(ldowCal); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println(DateUtils.Tostring(c.getTime(), "dd/MM/yyyy EEEE"));
		}

	}
}
