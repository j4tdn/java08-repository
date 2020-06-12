package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex08 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = WeekdayUtils.toDate(c);
		String string = WeekdayUtils.toStringDate(date, "dd/MM/YYYY EEEE");
		
		System.out.println("Calendar: "+ c);
		System.out.println("Date: " +date);
		System.out.println("String: "+ string);
	}

}
