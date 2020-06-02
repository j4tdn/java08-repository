package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.println(" time Zone default :" + TimeZone.getDefault());
		System.out.println("locate default: " +Locale.getDefault());
		 
		Calendar c  = Calendar.getInstance();
		
		GregorianCalendar g = new GregorianCalendar();
		
		
		
		System.out.println(c);
		System.out.println(""
				+ "Day :"+ c.get(Calendar.DAY_OF_MONTH)
				+ "\nMonth :" + (c.get(Calendar.MONTH) +1 )
				+ "\nYear :" + c.get(Calendar.YEAR)
				+ "\n Hour 12 :" +c.get(Calendar.HOUR)
				+ "\nHour 24 :" +c.get(Calendar.HOUR_OF_DAY)
				+ "\n Minute :" +c.get(Calendar.MINUTE)
				+ "\nSecond : " + c.get(Calendar.SECOND)
				+" \nWeek day : " +c.get(Calendar.DAY_OF_WEEK)
				+"\nMonthDays :" +c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+"\nYearDays :" +c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+"\nIsLeapYear :" +g.isLeapYear(c.get(Calendar.YEAR))
				
				+ "");
		
		
		
	}
}
