package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		int year = 2019;
		getAllSundaysInYearJava7(year);
		getLastSundayJava7(year);
	}

	private static void getAllSundaysInYearJava7(int year) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();

		start.set(year, Calendar.JANUARY, 1);
		end.set(year, Calendar.DECEMBER, 31);

		while (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		while (start.before(end)) {
			System.out.println(df.format(start.getTime()));
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
	}

	private static void getLastSundayJava7(int year) {
		Calendar end = Calendar.getInstance();

		end.set(year, Calendar.DECEMBER, 31);

		while (end.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			end.add(Calendar.DAY_OF_MONTH, 1);
		}
		end.add(Calendar.DAY_OF_MONTH, -7);

		System.out.println("Last Sunday: " + df.format(end.getTime()));

	}
}
