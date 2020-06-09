package datetime;

import java.time.DayOfWeek;
import java.util.Calendar;

import util.DateUtils;

public class Ex05 {
	
	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";
	
	public static void main(String[] args) {
		
		
		Calendar today = Calendar.getInstance();
		
		
		
		int firstDay = today.getFirstDayOfWeek();
		
		int firstDayOfWeek = today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK) + firstDay ;
		
		Calendar fdowCal = Calendar.getInstance() ;
		
		
		fdowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstDayOfWeek);
		
		Calendar lastDay = Calendar.getInstance();
		
		lastDay.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH),firstDayOfWeek + 7);
		
		
		
		
		for(Calendar c = fdowCal ; c.before(lastDay); c.add(Calendar.DAY_OF_MONTH, 1)) {
			
			System.out.println("Milliseconds : " +c.getTimeInMillis());
			
			System.out.println(DateUtils.toString(c.getTime(), "dd/MM/yyyy EEEE"));
		}
}
}