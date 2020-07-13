package datetime07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {

	public static DateFormat df = new SimpleDateFormat("dd/MM/YYYY EEEE");

	public static void getAllSundaysInYear(int year) {
		Calendar firstDayOfYear = Calendar.getInstance();
		firstDayOfYear.set(year, 0, 1);

		while (firstDayOfYear.get(Calendar.YEAR) == year) {
			if (firstDayOfYear.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(df.format(firstDayOfYear.getTime()));
				firstDayOfYear.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				firstDayOfYear.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
	}

	public static void getLastSunday(int year) {
		Calendar lastDayOfYear = Calendar.getInstance();
		lastDayOfYear.set(year, 11, 31);

		while (lastDayOfYear.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			lastDayOfYear.add(Calendar.DAY_OF_MONTH, -1);
		}

		System.out.println(df.format(lastDayOfYear.getTime()));
	}

	public static void main(String[] args) {
		getAllSundaysInYear(2020);
		getLastSunday(2020);
	}
}
