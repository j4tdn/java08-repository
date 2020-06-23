package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex09 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, 5, 8, 17, 0, 0);
		
		Calendar today = Calendar.getInstance();		
		long duration = today.getTimeInMillis() - start.getTimeInMillis();
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long remainingHoursInMil = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHoursInMil);
		long remainingMinuteInMil = remainingHoursInMil - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinuteInMil);
		long remainingSecondInMil = remainingMinuteInMil - TimeUnit.MILLISECONDS.toMinutes(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSecondInMil);
		long remainingMiliSecondInMil = remainingSecondInMil - TimeUnit.MILLISECONDS.toSeconds(seconds);
		
		System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds 
				+ " seconds " + remainingMiliSecondInMil + " miliSeconds");
	}
}
