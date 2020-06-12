package datetime;
import java.lang.System;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex08 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		Date date = DateUtils.toDate(c);
		String s = DateUtils.toString(date, "dd.MM.yyyy EEEE");
		
		System.out.println("Calendar: " + c);
		System.out.println("Date: " + date);
		System.out.println("String: " + s);
	}
}
