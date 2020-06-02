package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		GregorianCalendar g = new GregorianCalendar();
		c.set(Calendar.MONTH, 4);
		System.out.println("TimeZone default" + TimeZone.getDefault());
		System.out.println("Locale default" + Locale.getDefault(Locale.Category.FORMAT));
		System.out.println("calendar: " + c);
		System.out.println(""
				+ "\nDay :" + c.get(Calendar.DAY_OF_MONTH)
				+ "\nMonth :" + (c.get(Calendar.MONTH) + 1)
				+ "\nYear :"  + c.get(Calendar.YEAR)
				+ "\nHour12 :"  + c.get(Calendar.HOUR)
				+ "\nHour24 :"  + c.get(Calendar.HOUR_OF_DAY)
				+ "\nMinute :"  + c.get(Calendar.MINUTE)
				+ "\nSecond :"  + c.get(Calendar.SECOND)
				+ "\nWeekday :"  + c.get(Calendar.DAY_OF_WEEK)
				+ "\nMonthDay :"  + c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+ "\nMonthDay :"  + c.getMaximum(Calendar.DAY_OF_MONTH)
				+ "\nYearDay :"  + c.getMaximum(Calendar.DAY_OF_YEAR)
				+ "\nisLeapYear :"  + g.isLeapYear(c.get(Calendar.YEAR)));
		
	}
}
