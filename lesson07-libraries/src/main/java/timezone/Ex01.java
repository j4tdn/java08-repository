package timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		String[] timeZones = TimeZone.getAvailableIDs();
		for (String tz : timeZones) {
			System.out.println(tz);
		}
		// System.out.println("def:" +TimeZone.getDefault());
		TimeZone japan = TimeZone.getTimeZone("Asia/Tokyo");
		Calendar c = Calendar.getInstance(japan);
		System.out.println("hour:" + c.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("==========================");
		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(japan);
		
		System.out.println("date:" + df.format(date));

	}
}
