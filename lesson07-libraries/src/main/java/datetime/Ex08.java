package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex08 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		Date date = DayUtils.toDate(c);
		String string  = DayUtils.toString(date, "dd/MM/yyyy EEEE");
		System.out.println("calendar: " + c );
		System.out.println("date: " + date );
		System.out.println("string: " + string );
	}
}
