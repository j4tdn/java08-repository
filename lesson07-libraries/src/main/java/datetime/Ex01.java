package datetime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println("TimeZone default: " + TimeZone.getDefault());
		System.out.println("LocalDate default: " +  Locale.getDefault(Locale.Category.FORMAT));
		
		GregorianCalendar g = new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, 4);
		System.out.println(""
				+ "\n Day: " + c.get(Calendar.DAY_OF_MONTH)
				+ "\n Month: " + (c.get(Calendar.MONTH) + 1)
				+ "\n Year: " + c.get(Calendar.YEAR)
				+ "\n Hour 12: " + c.get(Calendar.HOUR)
				+ "\n Hour 24: " + c.get(Calendar.HOUR_OF_DAY)
				+ "\n Minute: " + c.get(Calendar.MINUTE)
				+ "\n Second: " + c.get(Calendar.SECOND)
				+ "\n Weekday: " + c.get(Calendar.DAY_OF_WEEK)
				+ "\n MonthDays: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) 
				+ "\n Max day of months in year: " + c.getMaximum(Calendar.DAY_OF_MONTH)
				+ "\n YearDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+ "\n isLeapYear: " + g.isLeapYear(c.get(Calendar.YEAR)) 
				);
		
	}
}
