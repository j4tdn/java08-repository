package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;

public class Ex09 {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, 5, 8, 17, 0, 0);
		Calendar today = Calendar.getInstance();
		long duration = today.getTimeInMillis()-start.getTimeInMillis();
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long hours = TimeUnit.MILLISECONDS.toHours(duration - TimeUnit.DAYS.toMillis(days));
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration- TimeUnit.DAYS.toMillis(days) -TimeUnit.HOURS.toMillis(hours));
		System.out.println(days+ ", " + hours+", "+ minutes);
		
	}

}
