package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("sundays:" + totalOfSunday(today));
		int[] a = countMonthsHasFiveSunday(today);
		for (int i : a) {
			System.out.println("month:" + i);
		}

	}

	private static int totalOfSunday(Calendar c) {
		int count = 0;
		Calendar start = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		boolean isFirstSunday = false;

		
		  while (start.before(end)) { if (start.get(Calendar.DAY_OF_WEEK) !=
		  Calendar.SUNDAY) { start.add(Calendar.DAY_OF_MONTH, 1);
		  
		  } else { count++; start.add(Calendar.DAY_OF_MONTH, 7); }
		  
		  }
		 
		/* cach 2
		 * while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) { // tim chu nhat
		 * dau tien start.add(Calendar.DAY_OF_MONTH, 1); } while (start.before(end)) {
		 * // duyet chu nhat count++; start.add(Calendar.DAY_OF_MONTH, 7); }
		 * 
		 * 
		 */
		  return count;
	}

	private static boolean hasfiveSundays(Calendar c) {
		return totalOfSunday(c) == 5;
	}

	private static int[] countMonthsHasFiveSunday(Calendar c) {
		int indext = 0;
		int[] month = new int[12];

		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));

		for (int i = 0; i < 12; i++) {
			ctmp.set(Calendar.MONTH, i);
			if (hasfiveSundays(ctmp)) {

				month[indext++] = (i + 1);
			}

		}
		return Arrays.copyOfRange(month, 0, indext);
	}

}
