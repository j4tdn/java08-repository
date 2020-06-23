package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex09 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, 5, 18, 14, 0, 0);

		Calendar today = Calendar.getInstance();

		long duration = today.getTimeInMillis() - start.getTimeInMillis();

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remainingHourInMil = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHourInMil);

		long remainingMinutesInMil = remainingHourInMil - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutesInMil);

		long remainingSecondsInMil = remainingMinutesInMil - TimeUnit.HOURS.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSecondsInMil);

		System.out.println("day: " + days);
		System.out.println("hours: " + hours);
		System.out.println("minutes: " + minutes);
		System.out.println("seconds: " + seconds);

	}
}
