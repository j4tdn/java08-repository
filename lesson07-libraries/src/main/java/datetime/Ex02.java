package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.DateUtils;

public class Ex02 {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
				
		System.out.println("DayOfWeek: " + DateUtils.getDayOfWeek(weekDay));
	}
}

