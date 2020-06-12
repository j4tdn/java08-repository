package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		
		String[] s = TimeZone.getAvailableIDs();
		System.out.println("def tz: "+ TimeZone.getDefault() );

		for (String string : s) {
			System.out.println(" tz : "+  string);
		}
		
		TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c = Calendar.getInstance(berlin);
		
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println("c tz :" + c.getTimeZone().getRawOffset());
		
		// dateformat an timezone con date thi k
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(berlin);
		
		System.out.println("date: " + df.format(date));
		System.out.println(date.getTimezoneOffset());
	}
}
