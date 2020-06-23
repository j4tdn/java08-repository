package datetime;

import java.util.Arrays;
import java.util.Calendar;

import utils.DateUtils;

public class Ex06 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int[] months = getMonthHasFiveSundays(cal);
		System.out.println("=======================");
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}

	}

	private static int[] getMonthHasFiveSundays(Calendar c) {
		int[] months = new int[12];

		Calendar ctemp = Calendar.getInstance();
		c.set(Calendar.YEAR, c.get(Calendar.YEAR));
		int index = 0;
		for (int i = 0; i < 12; i++) {
			ctemp.set(Calendar.MONTH, i);
			if (hasFiveSundays(ctemp)) {
				System.out.println(DateUtils.toString(ctemp.getTime(), "MMM"));
				months[index++] = (i + 1);
			}
		}
		return Arrays.copyOfRange(months, 0, index);

	}

	private static boolean hasFiveSundays(Calendar c) {
		return totalOfSunday(c) == 5;
	}

	private static int totalOfSunday(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);

		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		int countSunday = 0;
		/*
		 * while (start.before(end)) { if (start.get(Calendar.DAY_OF_WEEK) ==
		 * Calendar.SUNDAY) { countSunday++; start.add(Calendar.DATE, 7);
		 * 
		 * } else { start.add(Calendar.DATE, 1); } }
		 */
		
		while(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DATE, 1);
		}
		while(start.before(end)) {
			countSunday++;
			start.add(Calendar.DATE, 7);
		}

		return countSunday;

	}
}