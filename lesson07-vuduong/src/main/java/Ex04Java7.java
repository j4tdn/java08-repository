import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex04Java7 {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

	public static void main(String[] args) {
		// getTimeInNewYork();
		System.out.println(totalDayOfMonths());
		lastDateOfMonth();

		firstAndLastDayOfWeek();
	}

	private static void getTimeInNewYork() {
		Calendar calNewYork = Calendar.getInstance();

		TimeZone tz = TimeZone.getTimeZone("America/New_York");

		df.setTimeZone(tz);

		System.out.println(df.format(calNewYork.getTime()));

	}

	private static int totalDayOfMonths() {
		Calendar cal = Calendar.getInstance();

		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	private static void lastDateOfMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(df.format(cal.getTime()));
	}

	private static void firstAndLastDayOfWeek() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1 - cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(df.format(cal.getTime()));

		cal.add(Calendar.DATE, 7);
		System.out.println(df.format(cal.getTime()));

	}

	private static void weekInYear() {
		Calendar cal = Calendar.getInstance();
		System.out.println("Week in year: " + cal.get(Calendar.WEEK_OF_YEAR));
	}

	private static void addMore8Hour() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 8);
	}

	private static void duration(Calendar start, Calendar end) {
		int year = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int month;
		int monthStart = start.get(Calendar.MONTH);
		int monthEnd = end.get(Calendar.MONTH);

		if (monthEnd >= monthStart) {
			month = monthEnd - monthStart;
		} else {
			year--;
			month = monthEnd - monthStart + 12;
		}

		System.out.println("Duration: " + year + " year " + month + " month");

	}

	private static void after20days() {
		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.DATE, 20);

		System.out.println(df.format(cal.getTime()));
	}

	private static void remainMonthInYear() {
		Calendar cal = Calendar.getInstance();

		System.out.println("Remaining Month in Year: " + (12 - cal.get(Calendar.MONTH) - 1));
	}
}
