package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("timezone defaut" + TimeZone.getDefault());
		System.out.println("locale defaut" + Locale.getDefault(Locale.Category.FORMAT));
		Calendar cal = Calendar.getInstance();
		System.out.println("calendar " + cal);
		GregorianCalendar g = new GregorianCalendar();
		cal.set(Calendar.MONTH, 2);
		System.out.println("" 
		+ "day : " + cal.get(Calendar.DAY_OF_MONTH)
		+ "\n month : " + (cal.get(Calendar.MONTH) + 1)
		+ "\n year : " + cal.get(Calendar.YEAR)
		+ "\n hour : " + cal.get(Calendar.HOUR)
		+ "\n hour 24 :" + cal.get(Calendar.HOUR_OF_DAY)
		+ "\n monthDay : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH)
		+ "\n dayOfYear : " + cal.getActualMaximum(Calendar.DAY_OF_YEAR)
		+ "\n isLeapYear : " + g.isLeapYear(cal.get(Calendar.YEAR))
		);
	}
}
