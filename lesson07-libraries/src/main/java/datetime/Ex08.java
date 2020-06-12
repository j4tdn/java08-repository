package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex08 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = DateUtils.toDate(c);
		String s = DateUtils.toString(c, "dd-MM-yyyy EEEE" );
		
		System.out.println("calendar: " +c);
		System.out.println("date: " +date);
		System.out.println("String: " + s);
	}
}
