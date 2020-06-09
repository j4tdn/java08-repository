package datetime;

import java.awt.color.CMMException;
import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {		
		int[] months = getMonthHasFiveSundays(Calendar.getInstance());
		for (int i = 0; i < months.length; i++) {
			System.out.println("month: " + months[i]);
		}
		
	}
	
	private static int[] getMonthHasFiveSundays(Calendar c) {
		int[] months = new int[12];
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		int mindex = 0;
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
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH)+1 );
		
//		while(start.before(end)) {
//			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//				count++;
//				start.add(Calendar.DAY_OF_MONTH, 7);
//			} else {
//				start.add(Calendar.DAY_OF_MONTH, 1);
//			}			
//		}
		
		// find the first Sunday of month
		while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		// find the left Sundays of month
		while (start.before(end)) {
			count++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		return count;
	}
}
