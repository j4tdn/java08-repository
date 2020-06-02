package datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Timezone default: " + TimeZone.getDefault());
		System.out.println("Locale default: " + Locale.getDefault());

		System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH) 
				+ "\nMonth: " + (c.get(Calendar.MONTH) + 1)
				+ "\nYear: " + c.get(Calendar.YEAR) 
				+ "\nHour 12: " + c.get(Calendar.HOUR) 
				+ "\nHour 24: " + c.get(Calendar.HOUR_OF_DAY) 
				+ "\nMinute: " + c.get(Calendar.MINUTE) 
				+ "\nSecond: " + c.get(Calendar.SECOND)
				+ "\nWeekday: " + c.get(Calendar.DAY_OF_WEEK)
				+ "\nMonthdays: " + c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+"\nYeardays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		

	}
}
