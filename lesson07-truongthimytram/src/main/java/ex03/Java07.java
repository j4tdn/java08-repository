package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Java07 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		getNumberOfYear(cal);
		getNumberOfWeekPerYear(cal);
		getNumberOfDayPerWeek(cal);
		getDaysOfYear(cal);
		getDaysOfMonth(cal);
		
	}

	private static void getNumberOfYear(Calendar cal) {
		System.out.println("today is day number " + cal.get(Calendar.DAY_OF_YEAR) + " of the year, "
	                       + (cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR)) + " days left" );
		
	}
	
	private static void getNumberOfWeekPerYear(Calendar cal) {
		DateFormat dt = new SimpleDateFormat("EEEE");
		System.out.println("today is " + dt.format(cal.getTime()) + " number " + cal.get(Calendar.WEEK_OF_YEAR) 
		                   + " out of " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + cal.get(Calendar.YEAR));
	}
	
	private static void getNumberOfDayPerWeek(Calendar cal) {
		DateFormat dt = new SimpleDateFormat("EEEE");
		DateFormat dtMonth = new SimpleDateFormat("MMMM");
		System.out.println("today is " + dt.format(cal.getTime()) + " number " + (cal.get(Calendar.WEEK_OF_MONTH) - 1)
        + " out of " + (cal.getActualMaximum(Calendar.WEEK_OF_MONTH) - 1) + " in " + dtMonth.format(cal.getTime()) + " " + cal.get(Calendar.YEAR));
		
	}
	
	private static void getDaysOfYear(Calendar cal) {
		System.out.println("year " + cal.get(Calendar.YEAR) + " has " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
	}
	
	private static void getDaysOfMonth(Calendar cal) {
		DateFormat dtMonth = new SimpleDateFormat("MMMM");
		System.out.println(dtMonth.format(cal.getTime()) + " " + cal.get(Calendar.YEAR) + " has " + cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}

}