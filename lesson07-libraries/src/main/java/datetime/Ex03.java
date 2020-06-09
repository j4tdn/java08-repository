package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;


public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int maxdayofMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		Calendar ctemp = Calendar.getInstance();
		ctemp.set(Calendar.MONTH, c.get(Calendar.MONTH));
		ctemp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		//System.out.println("DayOfWeek: "+dayofWeek[weekday-1]);
		for (int date = 1; date <= maxdayofMonth; date++) {
			//int weekday = c.get(Calendar.DAY_OF_WEEK);
			ctemp.set(Calendar.DAY_OF_MONTH, date);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println(df.format(ctemp.getTime())+" "+DateUtils.getDayOfWeek(ctemp.get(Calendar.DAY_OF_WEEK)));
			
			System.out.println("+++++++++++++++++++++++++");
			df = new SimpleDateFormat("dd-MM-yyyy EE");
			System.out.println(df.format(ctemp.getTime())+" "+DateUtils.getDayOfWeek(ctemp.get(Calendar.DAY_OF_WEEK)));
		}
	}
	
}
