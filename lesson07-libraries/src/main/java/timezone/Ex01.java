package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		
		String[] timzones = TimeZone.getAvailableIDs();
	//	System.out.println("default timezone: " + TimeZone.getDefault());
		
		
		for (String tz: timzones) {
			System.out.println("timezone: " + tz);
		}
		
		TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println("hour: " + c.get(Calendar.HOUR_OF_DAY));
		//System.out.println(c);
		//System.out.println("c tz offset: " + c.getTimeZone().getRawOffset());
		
		System.out.println("=================================================");
		
		Date date = c.getTime(); //in ngay thang nam h p s ICT, date ko nhan timezone calendar
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(berlin);
		System.out.println("date: " + df.format(date));
	}
}
