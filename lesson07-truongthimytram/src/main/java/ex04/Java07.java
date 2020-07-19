package ex04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Java07 {

	private static DateFormat dt = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.set(2021, 02, 06);
		Calendar bd = Calendar.getInstance();
		bd.set(1998, 02, 06);
		
	    getTimeInNewYork();
		getTotalDayOfMonths(cal);
		getLastDateOfMonth(cal);
		getFirstAndLastDayOfWeek(cal);
		getWeekInYear(cal);
		getDuration(cal, end);
		getDayafter20days(cal);
		getRemainingMonthInYear(cal);
		getAge(cal, bd);
	}

	private static void getTimeInNewYork() {
		Calendar calNewYork = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		dt.setTimeZone(tz);
    	System.out.println(dt.format(calNewYork.getTime()));

	}

	private static void getTotalDayOfMonths(Calendar cal) {
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	private static void getLastDateOfMonth(Calendar cal) {
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(dt.format(cal.getTime()));
	}

	private static void getFirstAndLastDayOfWeek(Calendar cal) {
		cal.add(Calendar.DATE, 1 - cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(dt.format(cal.getTime()));
		cal.add(Calendar.DATE, 7);
		System.out.println(dt.format(cal.getTime()));

	}

	private static void getWeekInYear(Calendar cal) {
		System.out.println("Week in year: " + cal.get(Calendar.WEEK_OF_YEAR));
	}

	private static void add8Hour(Calendar cal) {
		cal.add(Calendar.HOUR, 8);
	}

	private static void getDuration(Calendar calStart, Calendar calEnd) {
		int year = calEnd.get(Calendar.YEAR) - calStart.get(Calendar.YEAR);
		int month;
		int monthStart = calStart.get(Calendar.MONTH);
		int monthEnd = calEnd.get(Calendar.MONTH);

		if (monthEnd >= monthStart) {
			month = monthEnd - monthStart;
		} else {
			year--;
			month = monthEnd - monthStart + 12;
		}

		System.out.println("Duration: " + year + " year " + month + " month");

	}

	private static void getDayafter20days(Calendar cal) {
		
		cal.add(Calendar.DATE, 20);

		System.out.println(dt.format(cal.getTime()));
	}

	private static void getRemainingMonthInYear(Calendar cal) {

		System.out.println("Remaining Month in Year: " + (12 - cal.get(Calendar.MONTH) - 1));
	}
	
	private static void getAge(Calendar now, Calendar dayOfBirth) {
		getDuration(dayOfBirth, now);
	}
}
