package bean;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	private static DateFormat df1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private static DateFormat df = new SimpleDateFormat("EEEE");

	public static void main(String[] args) {
		
		Calendar c1=Calendar.getInstance();
		Calendar c=Calendar.getInstance();
		c.set(2020, 6, 1, 21, 00, 60);
		theUltimateRelationshipCalculator(c, c1);
		
	}

	private static void theUltimateRelationshipCalculator(Calendar c, Calendar c1) {
		System.out.println(df.format(c.getTime()));
		
		long duration=c1.getTimeInMillis()-c.getTimeInMillis();
		long days=TimeUnit.MILLISECONDS.toDays(duration);
		long remainingHoursInMil=duration -TimeUnit.DAYS.toMillis(days);
		long hours=TimeUnit.MILLISECONDS.toHours(remainingHoursInMil);
		long remainingMinusInMil=remainingHoursInMil -TimeUnit.HOURS.toMillis(hours);
		long minus=TimeUnit.MILLISECONDS.toMinutes(remainingMinusInMil);
		long second=remainingMinusInMil-TimeUnit.MINUTES.toSeconds(minus);
		
		int year = c1.get(Calendar.YEAR) - c.get(Calendar.YEAR);

		int monthStart = c.get(Calendar.MONTH);
		int monthEnd = c1.get(Calendar.MONTH);
		int month;

		int dayStart = c.get(Calendar.DATE);
		
		int dayEnd = c1.get(Calendar.DATE);
		
		int day;

		if (dayEnd >= dayStart) {
			day = dayEnd - dayStart;
			if (monthEnd >= monthStart) {
				month = monthEnd - monthStart;
				System.out.println("year " + year + " month " + month + " day " + day+ "  hours: "+hours+" minus: "+minus+" second: "+ second);
			} else {
				year--;
				month = 12 + monthEnd - monthStart;
				System.out.println("year " + year + " month " + month + " day " + day+ "  hours: "+hours+" minus: "+minus+" second: "+ second);
			}
			
			
		} 
		else {
			day = dayEnd;
			if (monthEnd == monthStart) {
				month = 11;
				year--;
				System.out.println("year " + year + " month " + month + " day " + day+ "  hours: "+hours+" minus: "+minus+" second: "+ second);
				
			} else if (monthEnd > monthStart) {
				month = monthEnd - monthStart;
				System.out.println("year " + year + " month " + month + " day " + day+ "  hours: "+hours+" minus: "+minus+" second: "+ second);
			} else if (monthEnd < monthStart) {
				year--;
				month = 12 + monthEnd - monthStart;
				System.out.println("year " + year + " month " + month + " day " + day+ "  hours: "+hours+" minus: "+minus+" second: "+ second);
			}
			
			
		}

		
		
	}

}