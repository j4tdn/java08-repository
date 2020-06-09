package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int[] a = countMonthhasFiveSundays(c);
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + 1 + "\t");
		}

	}

	private static int totalOfSunday(Calendar c) {
		int count = 0;
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
		end.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
		// System.out.println(end.get(Calendar.DAY_OF_MONTH));
		
		/*
		 * while (start.before(end)) {
		 * 
		 * if (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
		 * 
		 * start.add(Calendar.DAY_OF_MONTH, 1); } else { count++;
		 * start.add(Calendar.DAY_OF_MONTH, 7); }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) { // tim chu nhat dau tien
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		while (start.before(end)) { // duyet chu nhat
			count++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		return count;
	}

	private static boolean hasfivesundays(Calendar c) {
		return totalOfSunday(c) == 5;
	}

	private static int[] countMonthhasFiveSundays(Calendar c) {
		int[] months = new int[12];
		int index = 0;
		Calendar cmp = Calendar.getInstance();
		cmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		for (int i = 0; i <= 11; i++) {
			cmp.set(Calendar.MONTH, i);
			if (hasfivesundays(cmp)) {
				// System.out.println(i+1);
				months[index++] = i;
			}
		}
		return Arrays.copyOfRange(months, 0, index);
	}
}
