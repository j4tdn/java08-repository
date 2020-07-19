import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		int day;
		int month;
		int year;
			
		System.out.println("Day: ");
		day = sc.nextInt();
		System.out.println("Month: ");
		month = sc.nextInt();
		System.out.println("Year: ");
		year = sc.nextInt();
		sc.close();
		
		c.set(year, month - 1, day);		
		System.out.println("It is day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year, " + (c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR)) + " days left");
		dayOfWeekInYear(c);
		System.out.println("It is " + DayOfWeek.values()[c.get(Calendar.DAY_OF_WEEK) - 1] + " number "
								+ c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " out of " + c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH) + " in " + MonthOfYear.values()[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR));
		
		System.out.println("Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println(MonthOfYear.values()[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");	
	}
	
	public static void dayOfWeekInYear(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int countAll = 0;
		int countCurrent = 0;
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
				
		start.set(c.get(Calendar.YEAR), 0, 1);
		end.set(c.get(Calendar.YEAR) + 1, 0, 1);
		
		// find firstDayOfWeekInYear
		while (start.get(Calendar.DAY_OF_WEEK) != dayOfWeek) {
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		while (start.before(end)) {
			countAll++;
			if (start.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH) && start.get(Calendar.MONTH) == c.get(Calendar.MONTH)) countCurrent = countAll;			
			start.add(Calendar.DAY_OF_MONTH, 7);
		}
		
		System.out.println("It is " + DayOfWeek.values()[dayOfWeek - 1] + " number " + countCurrent + " out of " + countAll + " in " + c.get(Calendar.YEAR));
	}
}

enum DayOfWeek {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY, NULL
}

enum MonthOfYear {
	JANUARY,
	FEBRUARY,
	MARCH,
	APRIL,
	MAY,
	JUNE,
	JULY,
	AUGUST,
	SEPTEMBER,
	OCTOBER,
	NOVEMBER,
	DECEMBER, NULL
}
