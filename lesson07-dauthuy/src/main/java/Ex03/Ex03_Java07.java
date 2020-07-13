package Ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03_Java07 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//cal.set(1995, 8, 25);
		calculatorYearMonthDate(cal);
	}

	public static void calculatorYearMonthDate(Calendar cal) {
		DateFormat dfMonth = new SimpleDateFormat("MMMM");
		DateFormat dfDate = new SimpleDateFormat("EEEE");
		
		int dayOfyearCal = cal.get(Calendar.DAY_OF_YEAR);
		int maxDayOfYearCal = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		int remainDaysInYear = maxDayOfYearCal - dayOfyearCal;
		System.out.println("It is day number " + dayOfyearCal + " of year, " + remainDaysInYear + " days left");
		
		String date = dfDate.format(cal.getTime());
		int numberWeekCalInYear = cal.get(Calendar.WEEK_OF_YEAR);
		int totalNumberWeekInYear = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int yearCal = cal.get(Calendar.YEAR);
		System.out.println("It is "+ date  + " number " + numberWeekCalInYear + " out of " + totalNumberWeekInYear + " in " + yearCal);
		
		int numberWeekOfMonthCal = cal.get(Calendar.WEEK_OF_MONTH) - 1;
		int totalNumberWeekOfnMonth = cal.getActualMaximum(Calendar.WEEK_OF_MONTH) - 1;
		String monthCal = dfMonth.format(cal.getTime());
		System.out.println("It is " + date + " number " + numberWeekOfMonthCal + " out of " + totalNumberWeekOfnMonth + " in " + monthCal + " " + yearCal);

		System.out.println("Year " + yearCal + " has " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " day");
		
		System.out.println(monthCal + " " + yearCal + " has " + cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
	}
}
