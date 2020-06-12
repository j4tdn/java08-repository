package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {

		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println("default tz: " + TimeZone.getDefault());
		Arrays.stream(timezones).forEach(System.out::println);

		TimeZone tz = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c = Calendar.getInstance(tz);
		System.out.println("hour: " + c.get(Calendar.HOUR_OF_DAY));
		Date date = c.getTime();
		System.out.println(date);
		
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(tz);
		System.out.println(df.format(date));
		
	}
}
