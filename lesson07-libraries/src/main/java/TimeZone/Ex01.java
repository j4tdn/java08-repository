package TimeZone;

import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		
		String[] timezones = TimeZone.getAvailableIDs();
		System.out.println("def tz : " +TimeZone.getDefault());
		// expected : 22h05
		
		//actual : 7h
//		int count = 0;
////		for(String timezone : timezones) {
////			count ++;
////			System.out.println(timezone);
////		}
//		System.out.println(count);
		
		TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
		
		Calendar c = Calendar.getInstance(berlin);
		
		System.out.println("calendar " +c.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("===========================");
		
		Date date = c.getTime();
		
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		
		df.setTimeZone(berlin);
		
		System.out.println("date : " +df.format(date));
		
	}
}
