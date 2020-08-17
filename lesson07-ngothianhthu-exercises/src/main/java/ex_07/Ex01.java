package ex_07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;

public class Ex01 {

	private static String DATE_FORMAT = "dd/MM/yyyy";
	public static DateFormat df = new SimpleDateFormat(DATE_FORMAT);
	public static int year = 2020;

	public static void getAllSundaysInYear() {

		Calendar cal = Calendar.getInstance();
		cal.set(year, 0, 1);
		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}

		System.out.println("Tất cả các ngày chủ nhật trong năm: ");
		while (cal.get(Calendar.YEAR) == year) {
			System.out.println(df.format(cal.getTime()));
			cal.add(Calendar.WEEK_OF_MONTH, 1);
		}
	}

	public static void getLastSunday() {

		Calendar cal = Calendar.getInstance();
		cal.set(year, 11, 31);

		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.roll(Calendar.DAY_OF_WEEK, -1);
		}
		System.out.println("Ngày chủ nhật cuối cùng trong năm: " + df.format(cal.getTime()));
	}

	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday();
	}
}
