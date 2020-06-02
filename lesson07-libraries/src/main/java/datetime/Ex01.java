package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("TimeZone default: "+ TimeZone.getDefault());
		System.out.println("Locale default: "+ Locale.getDefault());
		Calendar c= Calendar.getInstance();
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(""
				+ "Day: "+c.get(Calendar.DAY_OF_MONTH)
				+ "\nMonth: "+(c.get(Calendar.MONTH)+1)
				+ "\nYear: "+c.get(Calendar.YEAR)
				+ "\nHour: "+c.get(Calendar.HOUR)
				+ "\nHour: "+c.get(Calendar.HOUR_OF_DAY)
				+ "\nMinute: "+c.get(Calendar.MINUTE)
				+ "\nSecond: "+c.get(Calendar.SECOND)
				+ "\nWeekday:" + c.get(Calendar.DAY_OF_WEEK)
				+ "\nDayOFMonth:" + c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+ "\nDayOFYear:" + c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+ "\nisLeapYear: "+ g.isLeapYear(c.get(Calendar.YEAR)));
		
	}

}
