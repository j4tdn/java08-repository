package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		Calendar ctmp = Calendar.getInstance();
		for(int date=1;date<=maxDayOfMonth;date++) {
			ctmp.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), date);
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
			System.out.println(df.format(ctmp.getTime()));
			
			//+" "+WeekdayUtils.getDayOfWeek(ctmp.get(Calendar.DAY_OF_WEEK))
		}
	}

}
