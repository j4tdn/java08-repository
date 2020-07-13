import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bai2 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		Calendar start = Calendar.getInstance();
		start.set(2020, 6, 12, 0, 0, 0);

		System.out.println("da chia tay chon 1 chua chia tay chon 2");
		int n = sc.nextInt();
		if (n == 1) {

			Calendar end = Calendar.getInstance();
			end.set(2020, 6, 13, 14, 0, 0);
			caculate(start, end);

		}
		if (n == 2) {

			Calendar today = Calendar.getInstance();
			caculate(start, today);
		}

	}

	public static void caculate(Calendar start, Calendar end) {
		long duration = end.getTimeInMillis() - start.getTimeInMillis();

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long remaingHoursInMil = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaingHoursInMil);
		long remaingMinutesInMil = remaingHoursInMil - TimeUnit.HOURS.toMillis(hours);
		long minute2 = TimeUnit.MILLISECONDS.toMinutes(remaingMinutesInMil);
		long second2 = remaingMinutesInMil - TimeUnit.MINUTES.toMillis(minute2);
		long second = TimeUnit.MILLISECONDS.toSeconds(second2);

		System.out.println(days + "-" + hours + "-" + minute2 + "-" + second);
	}

}
