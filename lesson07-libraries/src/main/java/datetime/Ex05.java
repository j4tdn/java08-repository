package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Utils.DateUtils;

public class Ex05 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		int fd= today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK) + today.getFirstDayOfWeek();
		
		
		Calendar fdowCal = Calendar.getInstance();
		Calendar ldowCal = Calendar.getInstance();
		fdowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH),fd);
		ldowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH),fd +7);
		for (Calendar c = fdowCal; c.before(ldowCal); c.add(Calendar.DATE, 1) ) {
			System.out.println(DateUtils.toString(c.getTime(), "dd/MM/yyyy EEE") );

		}
	}
}
