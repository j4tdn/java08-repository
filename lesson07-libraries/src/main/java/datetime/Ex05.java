package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex05 {
	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

		Calendar fdowCal = Calendar.getInstance();
		fdowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DATE));
		fdowCal.set(Calendar.DAY_OF_WEEK, today.getFirstDayOfWeek());

		Calendar ldowCal = Calendar.getInstance();
		ldowCal.set(fdowCal.get(Calendar.YEAR), fdowCal.get(Calendar.MONTH), fdowCal.get(Calendar.DATE) + 7);
		
		System.out.println(DateUtils.toString(ldowCal.getTime(), DATE_PATTERN));
		System.out.println("=====================");
		while (fdowCal.before(ldowCal)) {
			System.out.println(DateUtils.toString(fdowCal.getTime(), DATE_PATTERN));
			fdowCal.add(Calendar.DATE, 1);
		}

	}

}