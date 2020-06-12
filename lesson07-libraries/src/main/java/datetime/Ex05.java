package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex05 {

	public static void main(String[] args) {
		Calendar dateOfWeek = Calendar.getInstance();
		
		int date = dateOfWeek.get(Calendar.DAY_OF_WEEK);

		int dateFirst = dateOfWeek.getFirstDayOfWeek();

		dateOfWeek.set(Calendar.DAY_OF_MONTH, dateOfWeek.get(Calendar.DAY_OF_MONTH) - date + dateFirst);
		for (int i = 0; i < 7; i++) {
			System.out.println(WeekdayUtils.toStringDate(dateOfWeek.getTime(), "dd/MM/YYYY EEEE"));
			dateOfWeek.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
