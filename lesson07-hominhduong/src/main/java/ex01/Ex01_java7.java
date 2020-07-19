package ex01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex01_java7 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public static void main(String[] args) {
		getAllSundaysInYear(2020);
		getLastSunday(2020);
	}

	private static void getAllSundaysInYear(int year) {
		Calendar cal = new GregorianCalendar(year, Calendar.JANUARY, 1);
		for (int i = 0; i < 52; i++) {
			cal.add(Calendar.WEEK_OF_YEAR, +1);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			System.out.println("List all Sunday of the year:");
			System.out.println(sdf.format(cal.getTime()));
		}
	}

	private static void getLastSunday(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.DECEMBER, 31);
		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.add(Calendar.DATE, -1);
		}
		System.out.println("the last Sunday of the year is "+sdf.format(cal.getTime()));

	}
}
