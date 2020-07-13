package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import utils.DateUtils;

public class Ex03 {
	private static DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 25);

		int weekday = c.get(Calendar.DAY_OF_WEEK);
		int monthday = c.get(Calendar.MONTH);
		
		System.out.println(df.format(c.getTime()) 
							+ " is a: " + DateUtils.getDayOfWeek(weekday));
		
		System.out.println("--------------");
		System.out.println("It is day number " + c.get(Calendar.DAY_OF_YEAR) 
							+ " of the year, " + (c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR)) 
							+ " days left");

		System.out.println("--------------");
		System.out.println( "It is " 	 + DateUtils.getDayOfWeek(weekday) 
							+ " number " + c.get(Calendar.WEEK_OF_YEAR)
							+ " out of " + c.getActualMaximum(Calendar.WEEK_OF_YEAR) 
							+ " in " 	 + c.get(Calendar.YEAR));

		System.out.println("--------------");
		System.out.println("It is " + DateUtils.getDayOfWeek(weekday) 
							+ " number " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH)
							+ " out of " + c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH) 
							+ " in " 	 + DateUtils.getDayOfMonth(monthday)
							+ " " 		 + c.get(Calendar.YEAR));

		System.out.println("--------------");
		System.out.println("Year "    + c.get(Calendar.YEAR) 
							+ " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) 
							+ " days");

		System.out.println("--------------");
		System.out.println(DateUtils.getDayOfMonth(monthday)
							+ " "		+ c.get(Calendar.YEAR) 
							+ " has " 	+ c.getActualMaximum(Calendar.DAY_OF_MONTH) 
							+ " days");
	}
}
