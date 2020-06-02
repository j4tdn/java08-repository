package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


public class Ex01 {
	public static void main(String[] args) {

		System.out.println("Time zone default: " + TimeZone.getDefault());
		System.out.println("Location default: " + Locale.getDefault(Locale.Category.FORMAT));
		Calendar c = Calendar.getInstance();
		GregorianCalendar g= new GregorianCalendar();
		c.set(Calendar.MONTH, 5);
		System.out.println("Calendar: "+c);
		System.out.println(""
				+ "Day of week: "+c.get(Calendar.DAY_OF_WEEK)+"\n"
				+ "Month days: "+c.getActualMaximum(Calendar.DAY_OF_MONTH)+"\n"
						+ "Year days: "+c.getActualMaximum(Calendar.DAY_OF_YEAR)+"\n"
				//		+ "Month days: "+c.getMaximum(Calendar.DAY_OF_MONTH)+"\n"
				+ "Day: "+c.get(Calendar.DAY_OF_MONTH)+"\n"
				+ "Month: "+(c.get(Calendar.MONTH)+1) +"\n"
				+ "Year: "+c.get(Calendar.YEAR)+"\n"
				+ "Hour 12: "+c.get(Calendar.HOUR)+"\n"
				+ "Hour 24: "+c.get(Calendar.HOUR_OF_DAY)+"\n"
				+ "Minute: "+c.get(Calendar.MINUTE)+"\n"
				+ "Seconds:"+c.get(Calendar.SECOND)+"\n" 
				+ "isLeapYear: "+g.isLeapYear(c.get(Calendar.YEAR))+"\n");
	}
}
