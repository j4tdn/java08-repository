import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01Java7 {
	
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		getLastSunday(2020);
	}

	private static void getAllSundayInYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.FEBRUARY, 1);
		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.add(Calendar.DATE, 1);
		}
		
		while (cal.get(Calendar.YEAR) == year) {
			System.out.println(df.format(cal.getTime()));
			cal.add(Calendar.WEEK_OF_YEAR, 1);
		}
	}

	private static void getLastSunday(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, Calendar.DECEMBER, 31);

		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			cal.add(Calendar.DATE, -1);
		}

		System.out.println(df.format(cal.getTime()));

	}
}
