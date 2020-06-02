package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Timezone default: " + TimeZone.getDefault());
		System.out.println("Locale default: " + Locale.getDefault(Locale.Category.FORMAT));
		
		
		Calendar c = Calendar.getInstance();
		System.out.println("Calender: " + c);
		
		GregorianCalendar g = new GregorianCalendar(); //kiem tra nam nhuan dung ham isLeapYear trong day
		
		c.set(Calendar.MONTH, 4); // thang tu 0 den 11
		
		System.out.println(""
				+ "\nDay: " + c.get(Calendar.DAY_OF_MONTH)
				+ "\nMonth: " + (c.get(Calendar.MONTH) + 1)
				+ "\nYear: " + c.get(Calendar.YEAR)
				+ "\nHour 12: " + c.get(Calendar.HOUR)
				+ "\nHour 24: " + c.get(Calendar.HOUR_OF_DAY)
				+ "\nMinute: " + c.get(Calendar.MINUTE)
				+ "\nSecond: " + c.get(Calendar.SECOND)
				+ "\nWeekday: " + c.get(Calendar.DAY_OF_WEEK)
				+ "\nMonthsDay: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) //lay ngay lon nhat cua thang nam hien tai
				+ "\nMonthDays: " + c.getMaximum(Calendar.DAY_OF_MONTH) //lay ngay lon nhat
				+ "\nYearDays: " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+ "\nIsLeapYear: " + g.isLeapYear(c.get(Calendar.YEAR))
				);
	}
}
