package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

public class Ex04 {

	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		// print the day (dd/MM/yyyy EEEE) in range
		// today -> 07.08.2020

		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		Calendar today = Calendar.getInstance();
		Calendar until = Calendar.getInstance();
		
		
		until.set(2020, 7, 7);
	
		
		for (Calendar c = today; c.before(until); c.add(Calendar.DATE, 1)) {
			System.out.println(df.format(c.getTime()));
		}

	}
}
