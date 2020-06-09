package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex05 {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy EEE");
		Calendar today = Calendar.getInstance();
		Calendar fdowCal = Calendar.getInstance();
		Calendar IdowCal = Calendar.getInstance();
		int a = today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK) + today.getFirstDayOfWeek();

		fdowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), a);
		IdowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), a + 7);

		for (Calendar c = fdowCal; c.before(IdowCal); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println(DateUtils.toString(c.getTime(), "dd/MM/yyyy EEEE"));
		}

	}
}
