package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		//System.out.println("sundays: " + totalOfSunday(Calendar.getInstance()));
		counMonthsHasFiveSundays(Calendar.getInstance());
		int[] arr = counMonthsHasFiveSundays(Calendar.getInstance());
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=0) {
			System.out.println(arr[i]);
			}
		}
	}

	private static int[] counMonthsHasFiveSundays(Calendar c) {
		int[] months = new int[12];
		int mindex = 0;
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		for (int month = 0; month <= 11; month++) {
			ctmp.set(Calendar.MONTH, month);
			if (hasFiveSundays(ctmp)) {
				//System.out.println("Month " + (month + 1));
				months[mindex++] = (month + 1);
			}
		}
		return Arrays.copyOfRange(months, 0, mindex);
	}

	private static int totalOfSunday(Calendar c) {
		int count = 0;
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);

		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
		// System.out.println(end.DAY_OF_MONTH);

		while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {

			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		while(start.before(end)) {
			count++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		return count;
	}

	private static boolean hasFiveSundays(Calendar c) {
		return totalOfSunday(c) == 5;
	}
}