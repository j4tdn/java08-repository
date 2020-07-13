
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Bai1 {
	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();
		getAllSundaysInYears(cd);
		getLastSunday(2019);

	}

	public static void getAllSundaysInMonth(Calendar d) {
		Calendar start = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);
		int month = d.get(Calendar.MONTH);
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, d.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		while (start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				start.add(Calendar.DAY_OF_MONTH, 1);

			} else {
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy EEE");
				System.out.println(df.format(start.getTime()));
				start.add(Calendar.DAY_OF_MONTH, 7);
			}

		}

	}

	public static void getAllSundaysInYears(Calendar d) {
		for (int i = 0; i < 12; i++) {
			d.set(Calendar.MONTH, i);
			getAllSundaysInMonth(d);
		}
	}

	public static void getLastSunday(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, Calendar.DECEMBER, 1);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy EEE");

		int maxdayofmonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = maxdayofmonth; i >= 1; i--) {
			c.set(Calendar.DAY_OF_MONTH, i);
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(df.format(c.getTime()));
				break;
			}
		}

	}

}