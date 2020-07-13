import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class Bai3 {
	private final static DateFormat df = new SimpleDateFormat("EEEE");

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(1995, 9, 25);
		c.add(Calendar.MONTH, -1);

		System.out.println("25 september 1995 is a " + df.format(c.getTime()));

		Calendar start = Calendar.getInstance();
		start.set(c.get(Calendar.YEAR), 1, 1);
		start.add(Calendar.MONTH, -1);

		c.add(Calendar.DAY_OF_MONTH, 1);
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayleft = max - dayNumber(start, c);
		int number = max -dayleft;
		System.out.println("it is day number " + number+ " of the year " + dayleft + " days left");

		getAllDayOfWeekInYears(c);

		System.out.println("Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " day.");
		DateFormat df2 = new SimpleDateFormat("MMMM");
		System.out.println(df2.format(c.getTime()) + " " + c.get(Calendar.YEAR) + " has "
				+ c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");

	}

	public static int dayNumber(Calendar d, Calendar c) {
		int count = 0;

		while (d.before(c)) {
			d.add(Calendar.DAY_OF_MONTH, 1);
			count++;

			if (d.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)
					&& d.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
				break;
			}
		}
		return count;
	}

	public static int getAllDayOfWeekInMonth(Calendar d, int t) {
		int count = 0;
		Calendar start = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);
		int month = d.get(Calendar.MONTH);
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, d.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		while (start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) != t) {
				start.add(Calendar.DAY_OF_MONTH, 1);

			} else {
				count++;
				start.add(Calendar.DAY_OF_MONTH, 7);

			}
		}
		return count;

	}

	public static void getAllDayOfWeekInYears(Calendar d) {
		Calendar c = Calendar.getInstance();
		c.set(d.get(Calendar.YEAR), d.get(Calendar.MONTH), d.get(Calendar.DAY_OF_MONTH));
		int t = d.get(Calendar.DAY_OF_WEEK);
		int month = d.get(Calendar.MONTH);

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < 12; i++) {
			c.set(Calendar.MONTH, i);
			count += getAllDayOfWeekInMonth(c, t);
			if (i < month) {
				count1 += getAllDayOfWeekInMonth(c, t);
			}
		}

		int maxdayofmonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i < maxdayofmonth; i++) {
			c.set(Calendar.DAY_OF_MONTH, i);
			if (c.get(Calendar.DAY_OF_WEEK) == t) {
				count1++;
				count2++;
				if (c.get(Calendar.DAY_OF_MONTH) == d.get(Calendar.DAY_OF_MONTH))
					break;
			}
		}
		c.set(Calendar.DAY_OF_MONTH, month);
		System.out.println("it is " + df.format(d.getTime()) + " number " + count1 + " out of " + count + " in "
				+ d.get(Calendar.YEAR));
		System.out.println("it is " + df.format(d.getTime()) + " number " + count2 + " out of "
				+ getAllDayOfWeekInMonth(c, t) + " in " + d.get(Calendar.YEAR));
	}

}
