package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {

	private static final String DATE_PATTEN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) { // pritnt the day (dd-MM-yyyy EEEE) in a range
		// today - 07/08/2020
		DateFormat df = new SimpleDateFormat(DATE_PATTEN);

		Calendar today = Calendar.getInstance();
		Calendar until = Calendar.getInstance();
		until.set(2020, 7, 7);
		for (Calendar c = today; c.before(until); c.add(Calendar.DATE, 1)) {
			System.out.println(df.format(c.getTime()));
		}
	}

	/*
	 * private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";
	 * 
	 * public static void main(String[] args) { // print the day (dd/MM/yyyy EEEE)
	 * in range // today -> 07.08.2020
	 * 
	 * Calendar today = Calendar.getInstance(); Calendar until =
	 * Calendar.getInstance();
	 * 
	 * 
	 * until.set(2020, 7, 7);
	 * 
	 * 
	 * DateFormat df = new SimpleDateFormat(DATE_PATTERN); for (Calendar c = today;
	 * c.before(until); c.add(Calendar.DATE, 1)) {
	 * System.out.println(df.format(c.getTime())); } // for (Calendar c = today;
	 * today.before(until); c.add(Calendar.DATE, 1)) { //
	 * System.out.println(df.format(c.getTime())); // } }
	 */
}
