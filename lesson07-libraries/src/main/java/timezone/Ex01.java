package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println("def tz: " + TimeZone.getDefault());

		for (String tz : timezones) {
			System.out.println(tz);
		}

		// Date date =
		// Calendar.getInstance(TimeZone.getTimeZone("America/Grenada")).getTime();

		TimeZone berlin = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar: " + c.get(Calendar.HOUR_OF_DAY));
		// System.out.println(c);

		System.out.println("++++++");
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(berlin);
		System.out.println("date: " + df.format(date));
	}
}
