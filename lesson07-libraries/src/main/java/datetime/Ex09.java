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
		
		long remainingHourInMil = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHourInMil);
		
		long remainingMinutesInMil = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutesInMil);
		
		System.out.println("day: " + days);
		System.out.println("hours: " + hours);
		System.out.println("minutes: " + minutes);

	}
}
