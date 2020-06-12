package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DayUtils;

public class Ex08 {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		Date date=DayUtils.toDate(c);
		String s=DayUtils.toString(c,"dd/MM/yyyy EEEE");
		
		System.out.println("Calendar: "+c);
		System.out.println("Date: "+date);
		System.out.println("String: "+s);
	}

}
