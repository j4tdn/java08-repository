package Bai1;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class java07 {
	
	private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		
	}
	
	public static void getAllSundaysInYear(int year) {
		
		Calendar today = Calendar.getInstance();
		
		today.set(year, 0, 1);
		
		while(today.get(Calendar.YEAR) == year) {
			
			if(today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println("hello there");
				System.out.println(df.format(today.getTime()));
				today.add(Calendar.DAY_OF_MONTH, 7);
			}
			else {
				today.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		
	}
	
	public static void getLastSunday(int year) {
		Calendar today = Calendar.getInstance();
		
		today.set(year,11,31);
		
		while(today.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			today.add(Calendar.DAY_OF_MONTH, -1);
		}
		
		System.out.println(df.format(today.getTime()));
		
		
		
		
	}
	
}
