package datetime;

import java.util.Arrays;
import java.util.Calendar;

import Utils.DateUtils;

public class Ex06 {
	public static void main(String[] args) {
		//System.out.println(totalOfSunday(Calendar.getInstance()));
		int[] a = getMonthsHasFiveSunday(Calendar.getInstance());
		for (int i= 0 ; i < a.length; i ++) {
			System.out.println(a[i]);
		}
	}
	private static int totalOfSunday(Calendar c) {
		int count =0 ;
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		
		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);
		
		Calendar end = Calendar.getInstance();
		end.set(year,month, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		while(start.get(Calendar.DAY_OF_WEEK)!= Calendar.SUNDAY) {
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
	
	private static int[] getMonthsHasFiveSunday( Calendar c) {
		int[] months = new int[12];
		int mindex = 0;
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		for (int month = 0 ; month <= 11; month++) {
			ctmp.set(Calendar.MONTH, month);
			if (hasFiveSundays(ctmp)) {
				months[mindex++] = month +1 ;
				//System.out.println(month);
			}
		}
		return Arrays.copyOfRange(months, 0, mindex);
	}
}
