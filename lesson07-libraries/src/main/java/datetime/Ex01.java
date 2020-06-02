package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("TimeZone default: " + TimeZone.getDefault().getID());
		System.out.println("Locale default: " + Locale.getDefault(Locale.Category.FORMAT));
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 4);
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(""
				+ "Day: "+ c.get(Calendar.DAY_OF_MONTH)
				+ "\nMonth: "+ (c.get(Calendar.MONTH) + 1)
				+ "\nYear: "+ c.get(Calendar.YEAR)
				+ "\nHour: "+ c.get(Calendar.HOUR)
				+ "\nMinute: "+ c.get(Calendar.MINUTE)
				+ "\nSecond: " + c.get(Calendar.SECOND)
				+ "\nMonthDays: " + c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+ "\nYearDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+ "\nIs leap year: " + g.isLeapYear(c.get(Calendar.YEAR)));
	}
}
