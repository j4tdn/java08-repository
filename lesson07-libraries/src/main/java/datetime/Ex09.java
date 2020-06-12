package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex09 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, 5, 8, 17, 0, 0);

		Calendar today = Calendar.getInstance();

		long duration = today.getTimeInMillis() - start.getTimeInMillis();

		long day = TimeUnit.MILLISECONDS.toDays(duration);

		System.out.println(day);
		
		long remainingHouresInMil = duration - TimeUnit.DAYS.toMillis(day);

		long hours = TimeUnit.MILLISECONDS.toHours(remainingHouresInMil);
		
		System.out.println("Hours: " + hours);
	}
}
