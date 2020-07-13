package Ex01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01_Java07 {
	private static String DATE_FORMAT = "dd/MM/yyyy";
	public static DateFormat df = new SimpleDateFormat(DATE_FORMAT);

	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday();
	}

	public static void getAllSundaysInYear() {
		int year = 2020;
		Calendar cal = Calendar.getInstance();
		cal.set(year, 0, 1);
		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}

		System.out.println("Tất cả các ngày chủ nhật: ");
		while (cal.get(Calendar.YEAR) == year) {
			System.out.println(df.format(cal.getTime()));
			cal.add(Calendar.WEEK_OF_MONTH, 1);
		}
	}

	public static void getLastSunday() {
    	int year = 2020;
    	Calendar cal = Calendar.getInstance();
    	cal.set(year, 11, 31);
    	
    	while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
    		cal.roll(Calendar.DAY_OF_WEEK, -1);
    	}
    	System.out.println("Chủ nhật cuối cùng: " + df.format(cal.getTime()));
    }
}
