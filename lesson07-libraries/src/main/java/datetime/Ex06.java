package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
//		System.out.println(today.get(Calendar.MONTH));
//		
//		Calendar firstMonth = Calendar.getInstance();
//		
//		firstMonth.set(today.get(Calendar.YEAR),0 );
//		
//		Calendar lastMonth = Calendar.getInstance();
//		
//		lastMonth.set(today.get(Calendar.YEAR), 11);
//		
//		
//		Calendar firstDay = Calendar.getInstance();
		
		
		
		//firstDay.set(today.getActualMaximum(Calendar.DAY_OF_MONTH), month, date);
		
		
		System.out.println(totalOfSunday(today));
		
		
		getMonthHasFiveSundays(today);
		
		for(int a : getMonthHasFiveSundays(today)) {
			if(a != 0 ) {
				System.out.print("Month: ");
				System.out.println(a +1);
			}
		}
		
	}
	
	public static void checkMonth(Calendar c) {
		
		//for()
		
	}
	
	
	
	private static int[] getMonthHasFiveSundays(Calendar c) {
		
		int[] months = new int[12];
		
		int index = 0;
		
		Calendar ctmp = Calendar.getInstance();
		
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		for(int month = 0; month<12; month++) {
			ctmp.set(Calendar.MONTH,month);
			
			if(hasFiveSunday(ctmp)) {
				
				System.out.println("month : " +(month+1));
				
				months[index++] = month ;
			}
		}
		
		
		return Arrays.copyOfRange(months, 0, index ); // lay toi index -1 ;
		
	}
	
	
	private static boolean hasFiveSunday(Calendar c) {
		return totalOfSunday(c) == 5;
	}
	
	
	private static int totalOfSunday(Calendar c) {
		
		int count  = 0;
		
		Calendar start = Calendar.getInstance();
	
		int year = c.get(Calendar.YEAR);
		
		int month = c.get(Calendar.MONTH);
		
		start.set(year, month, 1);
		
		Calendar end = Calendar.getInstance();
		
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
		
		
		//find the first sunday 
		while(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		//find the left sundays in month
		while(start.before(end)) {
			count ++ ;
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		
//			 while(start.before(end)) {
//			
//			 
//						
//			
//			if(start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
//				start.add(Calendar.DAY_OF_MONTH, 1);
//				
//			}
//			else {
//				count ++;
//				start.add(Calendar.DAY_OF_MONTH, 7);
//			}
//			
//			
//			
//		}
		
		
		return count ;
		
		
	}
	
}
