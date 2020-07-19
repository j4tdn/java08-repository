import java.io.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.Format;

public class Ex02 {
	public static void main(String[] args) {
		String pattern = "EEEE dd-MM-yyyy";
		Scanner sc = new Scanner(System.in);
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		int day;
		int month;
		int year;
		int hour;
		int minute;
		int second;
		
		do {
			System.out.println("When did you start dating? ");
			System.out.println("Day: ");
			day = sc.nextInt();
			System.out.println("Month: ");
			month = sc.nextInt();
			System.out.println("Year: ");
			year = sc.nextInt();
			System.out.println("Hour: ");
			hour = sc.nextInt();
			System.out.println("Minute: ");
			minute = sc.nextInt();
			System.out.println("Second: ");
			second = sc.nextInt();
			
			start.set(year, month-1, day, hour, minute, second);
		} while (start.after(Calendar.getInstance()));
						
		sc.nextLine();
		System.out.println("You was broken?(y/n) ");		
		String check = sc.nextLine();
		if (check.equals("y")) {
			System.out.println("Day: ");
			day = sc.nextInt();
			System.out.println("Month: ");
			month = sc.nextInt();
			System.out.println("Year: ");
			year = sc.nextInt();
			end.set(year, month-1, day);
		}
		
		sc.close();
		
		System.out.println("start: " + Format.toString(start, pattern) );
		System.out.println("end: " + Format.toString(end, pattern) );
		
		System.out.println("Count days: ");
		countDays(start, end);
	}
	
	public static void countDays(Calendar start, Calendar end) {
		long duration = end.getTimeInMillis() - start.getTimeInMillis();
				
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long remainingHoursInMil = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHoursInMil);
		long remainingMinuteInMil = remainingHoursInMil - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinuteInMil);
		long remainingSecondInMil = remainingMinuteInMil - TimeUnit.MILLISECONDS.toMinutes(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSecondInMil);
		long remainingMiliSecondInMil = remainingSecondInMil - TimeUnit.MILLISECONDS.toSeconds(seconds);		
		
		int years = 0;
		int month = 0;
		while (start.before(end)) {
			start.add(Calendar.YEAR, 1);
			if (start.before(end)) {
				years++;
				days -= isLeapYear(start.get(Calendar.YEAR))? 366 : 365;
			} else {
				start.add(Calendar.YEAR, -1);
				while (start.before(end)) {
					start.add(Calendar.MONTH, 1);
					if (start.before(end)) {
						month++;				
						days -= start.getActualMaximum(Calendar.DAY_OF_MONTH); 			
					}
				}
			}	
		}
		
		System.out.println(years + " years " + month + " months " + days + " days " + hours + " hours " + minutes + " minutes " + seconds 
				+ " seconds " + remainingMiliSecondInMil + " miliSeconds");
	}
	
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0);
	}
}
