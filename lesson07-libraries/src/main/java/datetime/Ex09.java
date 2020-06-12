package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex09 {

	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, 5, 8, 17, 0, 0);
		
		Calendar today = Calendar.getInstance();
		long duration = today.getTimeInMillis() - start.getTimeInMillis();
		//long days = duration/1000/60/60/24;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		//long hours = (duration - days*1000*60*60*24)/1000/60/60;
		long remainingHoursInMil = duration - TimeUnit.DAYS.toMillis(days);
		//long hours = remainingHoursInMil/1000/60/60;
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHoursInMil);
		System.out.println(days);
		System.out.println(hours);
		
		

	}

}
