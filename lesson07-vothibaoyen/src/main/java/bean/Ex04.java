package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


public class Ex04 {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private static DateFormat df1 = new SimpleDateFormat("dd/MM/yyy");

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		// getTimeInNewYork(c);
		// getLengDayOfMonth(c);
		// getLastDayOfMonth(c);
		// getFirstDayAndLastDayOfWeek(c);
		// getWeekOfYear(c);
		// getAdd8Hour(c);
		// get20DayAfter(c);
		// getMonth(c);
		Calendar c = Calendar.getInstance();
		c.set(1999, 6, 14);
		getAge(c, c1);
	}

	private static void getTimeInNewYork(Calendar c) {
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		df.setTimeZone(tz);
		System.out.println(df.format(c.getTime()));

	}

	private static void getLengDayOfMonth(Calendar c) {
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));

	}

	private static void getLastDayOfMonth(Calendar c) {
		int a = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, a);
		System.out.println(df1.format(c.getTime()));
	}

	private static void getFirstDayAndLastDayOfWeek(Calendar c) {

		c.set(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_WEEK) + 1);

		System.out.println(df.format(c.getTime()));

		c.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println(df.format(c.getTime()));
	}

	private static void getWeekOfYear(Calendar c) {
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	}

	private static void getAdd8Hour(Calendar c) {
		c.add(Calendar.HOUR, 8);
		System.out.println(df.format(c.getTime()));
	}

	private static void get20DayAfter(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 20);
		DateFormat df = new SimpleDateFormat("dd EEEE");
		System.out.println(df.format(c.getTime()));

	}

	private static void getMonth(Calendar c) {
		int a = 12 - c.get(Calendar.MONTH) - 1;
		System.out.println(a);
	}

	private static void getAge(Calendar c, Calendar c1) {
		int year = c1.get(Calendar.YEAR) - c.get(Calendar.YEAR);

		int monthStart = c.get(Calendar.MONTH);
		int monthEnd = c1.get(Calendar.MONTH);
		int month;

		int dayStart = c.get(Calendar.DATE);
		
		int dayEnd = c1.get(Calendar.DATE);
		
		int day;

		if (dayEnd >= dayStart) {
			day = dayEnd - dayStart;
			if (monthEnd >= monthStart) {
				month = monthEnd - monthStart;
				System.out.println(" year " + year + " month " + month + " day " + day);
			} else {
				year--;
				month = 12 + monthEnd - monthStart;
				System.out.println(" year " + year + " month " + month + " day " + day);
			}
			
			
		} 
		else {
			day = dayEnd;
			if (monthEnd == monthStart) {
				month = 11;
				year--;
				System.out.println(" year " + year + " month " + month + " day " + day);
				
			} else if (monthEnd > monthStart) {
				month = monthEnd - monthStart;
				System.out.println(" year " + year + " month " + month + " day " + day);
			} else if (monthEnd < monthStart) {
				year--;
				month = 12 + monthEnd - monthStart;
				System.out.println(" year " + year + " month " + month + " day " + day);
			}
			
			
		}

	}

}