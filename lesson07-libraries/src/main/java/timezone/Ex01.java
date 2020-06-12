package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println(TimeZone.getDefault());
		for (String timezone : timezones) {
			System.out.println(timezone);
		}

		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		
		TimeZone berlin =TimeZone.getTimeZone("Europe/Berlin");
		
		Calendar c = Calendar.getInstance(berlin);
		Date date1 = c.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(berlin);
		System.out.println(df.format(date1));
	}
}
