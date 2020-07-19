import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import utils.Format;

public class Ex04 {
	public static void main(String[] args) {
		// current time in New York
		TimeZone newyork = TimeZone.getTimeZone("UTC");
		Calendar c = Calendar.getInstance(newyork);			
		
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(newyork);
		System.out.println("Current time in New York: " + df.format(date));
		
		System.out.println("Day of month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));		
		System.out.println("Last day of month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
		firstLastDayOfWeek(c);
		System.out.println("Week of Year: " + c.get(Calendar.WEEK_OF_YEAR));
		
		c.add(Calendar.HOUR, 8);
		date = c.getTime();
		System.out.println("Time after 8 hours in New York: " + df.format(date));
		
		Calendar start = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		start.set(1998, 3, 1);
		timeBetween(start, now);	
		
		System.out.println("Months left is: " + (now.getActualMaximum(Calendar.MONTH) - now.get(Calendar.MONTH)));
		
		now.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("Time after 20 days: " + Format.toString(now, "dd/MM/yyyy EEEE"));
	}
	
	public static void firstLastDayOfWeek(Calendar c) {		
		int start;
		int end;		
		Calendar date = Calendar.getInstance();
		
		date.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		
		if (date.get(Calendar.DAY_OF_WEEK) != 1) {
			// find Monday
			while(date.get(Calendar.DAY_OF_WEEK) > 2) {
				date.add(Calendar.DAY_OF_MONTH, -1);			
			}
			
			start = date.get(Calendar.DAY_OF_MONTH);		
			date.add(Calendar.DAY_OF_MONTH, 6);
			end = date.get(Calendar.DAY_OF_MONTH);			
		} else {
			end = date.get(Calendar.DAY_OF_MONTH);				
			date.add(Calendar.DAY_OF_MONTH, -6);
			start = date.get(Calendar.DAY_OF_MONTH);
		}
		
		System.out.println("Current week: first day is " + start + ", last day is " + end);
	}
	
	public static void timeBetween(Calendar begin, Calendar end) {
		long duration = end.getTimeInMillis() - begin.getTimeInMillis();		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		int years = 0;
		int months = 0;
		Calendar start = Calendar.getInstance();
		start.set(begin.get(Calendar.YEAR), begin.get(Calendar.MONTH), begin.get(Calendar.DAY_OF_MONTH));
		while (start.before(end)) {
			start.add(Calendar.YEAR, 1);
			if (start.before(end)) {
				years++;
				days -= isLeapYear(start.get(Calendar.YEAR))? 366 : 365;
			} else {
				start.add(Calendar.YEAR, -1);
				while (start.before(end)) {
					start.add(Calendar.MONTH, 1);
					if (start.before(end)) {
						months++;				
						days -= start.getActualMaximum(Calendar.DAY_OF_MONTH); 			
					}
				}
			}	
		}
		
		System.out.println("Time between " + Format.toString(begin, "dd/MM/yyyy") 
				+ " and " + Format.toString(end, "dd/MM/yyyy") + " is: " + years + " years " + months + " months " + days + " days");
	}
	
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0);
	}
}
