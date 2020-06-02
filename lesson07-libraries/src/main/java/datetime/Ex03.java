package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.text.SimpleAttributeSet;

import Utils.WeekdayUtils;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int minDayOfMonth = 1;
		int maxDayOfMonth =c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.MONTH, c.get(Calendar.MONTH));
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		for (int date = minDayOfMonth; date <= maxDayOfMonth; date++) {
			ctmp.set(Calendar.DAY_OF_MONTH,date);
			
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");  // dd-MM-yyyy EEEE 
			System.out.println(df.format(ctmp.getTime()) + "  "+ WeekdayUtils.getDayOfWeek(ctmp.get(Calendar.DAY_OF_WEEK)));
			
			/*
			 * String s = df.format(ctmp.getTime()); System.out.println(s);
			 */
		}
	}
}
