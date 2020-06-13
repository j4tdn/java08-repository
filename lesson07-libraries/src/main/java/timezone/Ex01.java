package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println("default timezone: " + TimeZone.getDefault());
		/*
		 * for (String tz : timezones) { System.out.println(tz); }
		 */
		TimeZone timeZone= TimeZone.getTimeZone("Europe/Berlin");
		Calendar calendar= Calendar.getInstance(timeZone);
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		System.out.println("==========");
		System.out.println("hour: "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar);
		
		date = calendar.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(timeZone);
		System.out.println(df.format(date));
	}
}
