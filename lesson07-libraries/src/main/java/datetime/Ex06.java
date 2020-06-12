package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {

	public static void main(String[] args) {
		int[] months = getMonthsHasFiveSundays(Calendar.getInstance());
		for(int i = 0; i < months.length; i++) {
			
			System.out.println("month: " + months[i]);			
		}
		
	}
	private static int[] getMonthsHasFiveSundays(Calendar c) {
		int[] months = new int[12];
		int minIndex = 0;
		
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		for(int month = 0; month <= 11; month++) {
			ctmp.set(Calendar.MONTH, month);
			if(hasFiveSundays(ctmp)) {
				//System.out.println("month: " + (month + 1));
				months[minIndex++] = (month + 1);
			}
			
		}
		return Arrays.copyOfRange(months, 0, minIndex);
		
	}
	private static boolean hasFiveSundays(Calendar c) {
		return totalOfSundays(c) == 5;
		 
	}
	private static int totalOfSundays(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int count = 0;
		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);
		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH)+1);
		/*while(start.before(end)) {
			if(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				start.add(Calendar.DAY_OF_MONTH, 1);
			}
			else {
				count++;
				start.add(Calendar.DAY_OF_MONTH, 7);
			}
			
		}*/
		while(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		while(start.before(end)) {
			count++;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		return count;
		
	}

}
