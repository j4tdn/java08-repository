package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		// print the day (dd/MM/yyyy EEEE) in a range
		// today -> 07/08/2020
		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		
		Calendar today = Calendar.getInstance();
		Calendar endDay = Calendar.getInstance();
		endDay.set(2020, Calendar.AUGUST, 7);

		while (today.before(endDay)) {
			System.out.println(df.format(today.getTime()));
			today.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}