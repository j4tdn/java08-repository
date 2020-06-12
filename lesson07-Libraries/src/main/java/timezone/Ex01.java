package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {

		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println("default : " + TimeZone.getDefault());

		for (String tz : timezones) {
			System.out.println(tz);
		}

		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println(c);

		System.out.println("====================");

		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println("date : " + df.format(date));
	}
}
