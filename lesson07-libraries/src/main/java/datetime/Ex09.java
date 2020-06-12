package datetime;

import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex09 {
	
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020,5,8,17,0,0);
		
		Calendar today = Calendar.getInstance();
		
		long duration = today.getTimeInMillis() - start.getTimeInMillis();
		
		//long ngay = duration / 1000/60/60/24;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		System.out.println("ngay :" +days);
		
		long remainingHoursInMil = duration - TimeUnit.DAYS.toMillis(days);
		
		
		
		long hours = (duration - remainingHoursInMil) / 1000/60/60;
		
		System.out.println("hours :"+ hours);
		
		// ngay thang nam , gio phut giay
		
	}
	
	
	
	
}
