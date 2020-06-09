package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(Calendar.YEAR, 1, 1);
		getMonthHasFiveSundays(Calendar.getInstance());
		
		int month[] = getMonthHasFiveSundays(Calendar.getInstance());
		for (int i = 0; i < month.length; i++) {
			System.out.println("month :" + month[i]);
		}

	}

	private static int[] getMonthHasFiveSundays(Calendar c) {
		int[] months = new int[12];
		int mindex = 0;
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		for (int month = 0; month <= 11; month++) {
			ctmp.set(Calendar.MONTH, month);
			if (hasFiveSunday(ctmp)) {
				months[mindex++] = (month + 1) ;
			}
		}

		return Arrays.copyOfRange(months, 0, mindex);
	}

	private static boolean hasFiveSunday(Calendar c) {
		return totalOfSunDay(c) == 5;
	}

	public static int totalOfSunDay(Calendar c) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		int count = 0;

		start.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
		end.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

//		while (start.before(end)) {
//			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//				count++;
//				start.add(Calendar.DAY_OF_MONTH, 7);
//			}else {
//				start.add(Calendar.DAY_OF_MONTH, 1);
//			}
//		}
		
		while(start.get(Calendar.DAY_OF_WEEK)!= Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		while(start.before(end)) {
			count++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		return count;
	}
}
