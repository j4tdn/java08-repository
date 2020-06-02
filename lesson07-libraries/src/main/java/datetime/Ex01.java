package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		//TimeZone.getDefaultRef(), Locale.getDefault(Locale.Category.FORMAT)
		System.out.println("TimeZone default: "+ TimeZone.getDefault());
		System.out.println("Local default: "+ Locale.getDefault(Locale.Category.FORMAT));
		
		GregorianCalendar g = new GregorianCalendar();
		
		
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar: " + c);
		System.out.println(""
				+ "\nDay:" + c.get(Calendar.DAY_OF_MONTH)
				+ "\nMonth: "+ (c.get(Calendar.MONTH)+1)
				+ "\nYear: " + c.get(Calendar.YEAR)
				+ "\nHour:" + c.get(Calendar.HOUR)
				+ "\nHour (24): " + c.get(Calendar.HOUR_OF_DAY)
				+ "\nMinute: " + c.get(Calendar.MINUTE)
				+ "\nSecond: " + c.get(Calendar.SECOND)
				+ "\nWeekday: " + c.get(Calendar.DAY_OF_WEEK)
				+ "\nDayOFMonth: " + c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+ "\nDayOFYear: " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+ "\nisLeapYear: " + g.isLeapYear(c.get(Calendar.YEAR))
				);
	}
}
