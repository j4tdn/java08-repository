package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	private static final String DATE_PATIENT="dd/MM/yyyy EEEE";
	//print  the days (dd/MM/yyyy EEEE) in a range
	//today -> 7/8/2020
	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat(DATE_PATIENT);
		Calendar today=Calendar.getInstance();	
		Calendar until=Calendar.getInstance();
		until.set(2020,7,8);
		for(Calendar c=today;c.before(until);c.add(Calendar.DAY_OF_MONTH,1)) {
			System.out.println(df.format(c.getTime()));
		}
	}
	
	

}
