package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex05 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

		Calendar fdowCal = Calendar.getInstance();
		fdowCal.set(Calendar.DAY_OF_WEEK, today.getFirstDayOfWeek());

		Calendar ldowCal = Calendar.getInstance();
		ldowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), fdowCal.get(Calendar.DAY_OF_MONTH) + 7);

		for (Calendar cal = fdowCal; cal.getTime().before(ldowCal.getTime()); cal.add(Calendar.DATE, 1)) {
			System.out.println("milliseconds: " + cal.getTimeInMillis() + " == " + ldowCal.getTimeInMillis());
			System.out.println(DateUtils.toString(cal.getTime(), "dd/MM/yyyy EEEE"));
		}

	}
}
