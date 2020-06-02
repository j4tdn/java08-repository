package datetime;

import java.awt.color.CMMException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int minDayOfMonth = 1;
		int maxDayOfMoth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.MONTH, c.get(Calendar.MONTH));
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		
		for (int date = minDayOfMonth; date <= maxDayOfMoth; date++) {
			ctmp.set(Calendar.DAY_OF_MONTH, date);
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy : EEEE");
			System.out.println(df.format(ctmp.getTime()));
		}
	}
}
