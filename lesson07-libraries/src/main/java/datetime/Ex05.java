package datetime;

import java.util.Calendar;

import utils.DateUtils;


public class Ex05 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int firstDayOfWeek = today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK) + today.getFirstDayOfWeek();
		Calendar fdow = Calendar.getInstance();
		fdow.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstDayOfWeek);
		Calendar ldow = Calendar.getInstance();
		ldow.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstDayOfWeek + 7);
		System.out.println("ldow: " + ldow.getTimeInMillis());
		for(Calendar c = fdow; c.before(ldow); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("miliseconds: " + c.getTimeInMillis());
			System.out.println(DateUtils.toString(c.getTime(), "dd/MM/yyyy: EEEE"));
			
		}
		
	    
	}

}
