package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println("time default: " + TimeZone.getDefault());
		/*for(String tz:timezones) {
			System.out.println(tz);
		}*/
		TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c = Calendar.getInstance(berlin);
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println("=============================");
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(berlin);
		System.out.println("date: "+ df.format(date));
	}

}
