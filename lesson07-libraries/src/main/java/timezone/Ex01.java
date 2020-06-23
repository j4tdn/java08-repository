package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {

		String[] timezone = TimeZone.getAvailableIDs();
		System.out.println("def tz:  " +TimeZone.getDefault() );

		for (String tz : timezone) {
			System.out.println(tz);
		}

		//System.out.println("default : " + TimeZone.getDefault());

		// expected:
		// actual

		TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println("Hour: " + c.get(Calendar.HOUR_OF_DAY));
		//System.out.println(c.getTimeZone().getRawOffset());
		System.out.println("========================");
		Date date = c.getTime();

		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(berlin);
		System.out.println(df.format(date));
		//System.out.println(date.getTimezoneOffset());
		
		
	}
}
