package datetime;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("month now has " + totalOfSunday(cal) + " sunday");
		int[] a = coutMonthsHasFiveSunday(cal);
		for (int i = 0; i < a.length; i++) {
			System.out.println("  " + a[i]);
		}
	}

	private static int[] coutMonthsHasFiveSunday(Calendar c) {
		int[] months = new int[12];
		int mindex = 0;
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		for (int i = 0; i <= 11; i++) {
			ctmp.set(Calendar.MONTH, i);
			if (hasFiveSunDays(ctmp)) {
				months[mindex++] = (i + 1);
			}
		}

		return Arrays.copyOfRange(months, 0, mindex);
	}

	private static boolean hasFiveSunDays(Calendar c) {
		return totalOfSunday(c) == 5;
	}

	private static int totalOfSunday(Calendar c) {
		int cout = 0;
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);
		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		// System.out.println("xxx : " + end.get(Calendar.DAY_OF_MONTH));

		while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);

		}
		while (start.before(end)) {
			cout++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}

		return cout;
	}
}
