package Bai4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class java07 {
	
	private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static void main(String[] args) {
		
		getTimeInNewYork();
	}
	
	public static void getTimeInNewYork() {
		
		Calendar newYork = Calendar.getInstance();
		
		System.out.println(newYork.get(Calendar.MONTH));
		
		df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println(df.format(newYork.getTime()));
		
	}
	
	public static void dayOfMonth() {
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
	public static void lastDayofMonth() {
		Calendar today = Calendar.getInstance();
		today.set(Calendar.DAY_OF_MONTH, today.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(df.format(today.getTime()));
	}
	
	public static void weekOfDay() {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
	}
	
	
	public static void addEightHour() {
		Calendar today = Calendar.getInstance();
		
		today.add(Calendar.HOUR_OF_DAY, 8);
		
		System.out.println(df.format(today.getTime()));
	}
	
	public static void duration(Calendar start, Calendar end) {
		
		int year = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		
		int month =  0 ; 
		
		int monthStart = start.get(Calendar.MONTH);
		int monthEnd = end.get(Calendar.MONTH);
		
		//if(end.get(Calendar.MONTH) < start.get)
		
	}
	
	public static void afterTwentyDay() {
		Calendar today = Calendar.getInstance();
		
		today.add(Calendar.DAY_OF_MONTH, 20);
		
		System.out.println(df.format(today.getTime()));
	}
	public static void remainingMonthInYear() {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println(12 - today.get(Calendar.MONTH)  );
	}
	
	
}
