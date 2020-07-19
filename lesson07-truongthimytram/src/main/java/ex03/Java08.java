package ex03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Java08 {

	public static void main(String[] args) {
		LocalDate ldate = LocalDate.of(2020, 07, 19);
		getNumberOfYear(ldate);
		getNumberOfWeekPerYear(ldate);
     	getNumberOfDayPerWeek(ldate);
    	getDaysOfYear(ldate);
		getDaysOfMonth(ldate);
		
	}

	private static void getNumberOfYear(LocalDate ldate) {
		System.out.println("today is day number " + ldate.getDayOfYear() + " of the year, "
                + (ldate.lengthOfYear() - ldate.getDayOfYear()) + " days left" );
		
	}
	
	private static void getNumberOfWeekPerYear(LocalDate ldate) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEEE");
		WeekFields weekFields = WeekFields.of(Locale.getDefault()); 
		int weekNumber = ldate.get(weekFields.weekOfWeekBasedYear());
		
		System.out.println("today is " + ldate.format(dt) + " number " + weekNumber 
		                   + " out of " + (ldate.lengthOfYear() / 7) + " in " + ldate.getYear());
	}
	
	private static void getNumberOfDayPerWeek(LocalDate ldate) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEEE");
		DateTimeFormatter dtMonth = DateTimeFormatter.ofPattern("MMMM");
		LocalDate tempDate = LocalDate.of(ldate.getYear(), ldate.getMonth(), 1);
		int countWeekOfDay = 1;
		int weekOfMonth = 1;
		
		while(tempDate.getDayOfWeek() != ldate.getDayOfWeek()) {
			tempDate = tempDate.plusDays(1);
		}
		
		while (tempDate.getMonth() == ldate.getMonth()) {
			if (tempDate.equals(ldate)) {
				weekOfMonth = countWeekOfDay;
			}

			tempDate = tempDate.plusWeeks(1);

			countWeekOfDay += 1;
		}
		
		System.out.println("today is " + ldate.format(dt) + " number " + weekOfMonth
        + " out of " + (countWeekOfDay - 1) + " in " + ldate.format(dtMonth) + " " +  ldate.getYear());
		
	}
	
	private static void getDaysOfYear(LocalDate ldate) {
		System.out.println("year " + ldate.getYear() + " has " + ldate.lengthOfYear() + " days");
	}
	
	private static void getDaysOfMonth(LocalDate ldate) {
		DateTimeFormatter dtMonth = DateTimeFormatter.ofPattern("MMMM");
		System.out.println(ldate.format(dtMonth) + " " + ldate.getYear() + " has " + ldate.lengthOfMonth() + " days");
	}

}