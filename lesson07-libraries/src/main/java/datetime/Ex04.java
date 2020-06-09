package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	private static final String DATE_PATTERN ="dd/MM/yyyy EEEE";
public static void main(String[] args) {
	// print the days (
	
	Calendar today=Calendar.getInstance();
	DateFormat df=new SimpleDateFormat(DATE_PATTERN);
	Calendar until =Calendar.getInstance();
	until.set(2020, 7, 7);
	for(Calendar c=today;c.before(until);c.add(Calendar.DAY_OF_MONTH, 1)) {
		System.out.println(df.format(c.getTime()));
	}
}
}
