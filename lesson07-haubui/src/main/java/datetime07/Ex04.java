package datetime07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex04 {

	private static DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

	private static Calendar CAL = Calendar.getInstance();

	public static void main(String[] args) {
		getTimeInNewYork();
		System.out.println(df.format(Calendar.getInstance().getTime()));
		System.out.println(getTotalDayOfMonth());
		getLastDateOfMonth();
		getFirstAndLastDateOfWeek();
		getWeekOfYear();
		getTime8HoursLater();
		Calendar start = Calendar.getInstance();
		start.set(2019, 8, 1);
		getDuration(start, CAL);
		getTime20DaysLater();
		getRemainingMonthsOfYear();
	}

	private static void getTimeInNewYork() {
		Calendar calNY = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println(df.format(calNY.getTime()));
	}

	private static int getTotalDayOfMonth() {
		return CAL.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	private static void getLastDateOfMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(df.format(cal.getTime()));
	}

	private static void getFirstAndLastDateOfWeek() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		System.out.println(df.format(cal.getTime()));

		cal.add(Calendar.DAY_OF_WEEK, 6);
		System.out.println(df.format(cal.getTime()));
	}

	private static void getWeekOfYear() {
		System.out.println(CAL.get(Calendar.WEEK_OF_YEAR));
	}

	private static void getTime8HoursLater() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 8);
		System.out.println(df.format(cal.getTime()));
	}

	private static void getDuration(Calendar start, Calendar end) {
		int month;
		int year = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);

		int monthS = start.get(Calendar.MONTH);
		int monthE = end.get(Calendar.MONTH);
		if (monthE < monthS) {
			year--;
			month = monthE - monthS + 12;
		} else {
			month = monthE - monthS;
		}

		System.out.println(+year + " year " + month + " month");

	}

	private static void getTime20DaysLater() {
		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.DAY_OF_MONTH, 20);

		System.out.println(df.format(cal.getTime()));
	}

	private static void getRemainingMonthsOfYear() {
		System.out.println(CAL.getActualMaximum(Calendar.MONTH) - CAL.get(Calendar.MONTH));
	}
}
