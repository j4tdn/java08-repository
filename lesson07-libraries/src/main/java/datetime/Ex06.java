package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		// Print months has 5 sunday in 2020
		int[] months = getMonthsHasFiveSundays(Calendar.getInstance());
		for (int i = 0 ; i < months.length; i++) {
			System.out.println("month: " + months[i]);
		}
	}
	
	private static int[] getMonthsHasFiveSundays(Calendar c) {
		int[] months = new int[12];
		int mindex = 0;
		
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		for (int month = 0; month <= 11; month++) {
			ctmp.set(Calendar.MONTH, month);
			if (hasFiveSundays(ctmp)) {
				months[mindex++] = (month + 1);
			}
		}
		
		return Arrays.copyOfRange(months, 0, mindex);
	}

	private static boolean hasFiveSundays(Calendar c) {
		return totalOfSundays(c) == 5;
	}

	private static int totalOfSundays(Calendar c) {
		int count = 0;
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);

		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		// find the first sunday of month
		while(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		// find the left sundays in month
		while(start.before(end)) {
			count ++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		return count;
	}
}
