package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	private static final String DATE_PATTEN = "dd/MM/yyyy EEEE";

	// dem trong thang o bao nhieu nga CN
	public static void main(String[] args) {
		// System.out.println("The munber of Sunday of month
		// "+current.get(Calendar.MONTH)+" is "+totalOfSundays(Calendar.getInstance()));
		int[] months = countMonthsHasFiveSunday(Calendar.getInstance());
		System.out.println("=============");

		// for(Calendar c = current;c.get(Calendar.YEAR)<=2020;c.add(arg0, arg1);)
	}

	private static int[] countMonthsHasFiveSunday(Calendar c) {
		int[] months = new int[12];
		int mindex = 0;

		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));

		for (int i = 0; i <= 11; i++) {
			ctmp.set(Calendar.MONTH, i);
			if (hasFiveSunday(ctmp)) {
				System.out.println("month: " + (i + 1));
				months[mindex++] = i;
			}
		}

		return Arrays.copyOfRange(months, 0, mindex);
	}

	public static boolean hasFiveSunday(Calendar c) {
		return totalOfSundays(c) == 5;
	}

	public static int totalOfSundays(Calendar c) {
		int count = 0;

		Calendar start = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);

		start.set(year, month, 1);
		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
		// System.out.println("xxxxxx: "+c.getActualMaximum(Calendar.DAY_OF_MONTH+1));
		/*
		 * while (start.before(end)) { // boi vi before chi so sanh truoc cai ngay cua
		 * end if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) { count++;
		 * start.add(Calendar.DAY_OF_MONTH, 7); } else {
		 * start.add(Calendar.DAY_OF_MONTH, 1); } }
		 */
		
		// C2: 
		//find the first sunnday of month
		while(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		//find the left sundays in month
		while (start.before(end)) { // boi vi before chi so sanh truoc cai ngay cua end
				count++;
				start.add(Calendar.DAY_OF_MONTH, 7);
		}
		return count;
	}
}
