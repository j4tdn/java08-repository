package datetime;

import java.util.Calendar;
import java.util.Date;
import utils.DayUtils;

public class Ex08 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = DayUtils.toDate(c);
		String s = DayUtils.toString(date, "dd/MM/yy EEEEE");

		System.out.println("calender: " + c);
		System.out.println("date: " + date);
		System.out.println("string: " + s);

	}
}
