package datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03 {
	
	private static final DateFormat df = new SimpleDateFormat("DD-MM-YYY EEEE");
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int minDayOfMonth = 1; 
		
		Calendar ctmp = Calendar.getInstance();
		
		ctmp.set(Calendar.MONTH, c.get(Calendar.MONTH));
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		for(int date = minDayOfMonth ; date <= maxDayOfMonth ; date ++) {
			
			ctmp.set(Calendar.DAY_OF_MONTH, date);
			
			DateFormat df = new SimpleDateFormat();
			System.out.println(ctmp.getTime());
			
		}
		
		
	}
}
