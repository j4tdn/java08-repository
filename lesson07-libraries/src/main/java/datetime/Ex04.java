package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	
	public static void main(String[] args) {
	
		//print the days (dd/MM/yyyy EEEE) in a range
		//today -> 07/08/2020
		
		Calendar today = Calendar.getInstance();
		Calendar until = Calendar.getInstance();
		
		until.set(2020, 7, 7);
		today.before(until);
		for(Calendar c = today;c.before(until);c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println(WeekdayUtils.toStringDate(c.getTime(), "dd/MM/YYYY EEEE"));
		}
	}

}
