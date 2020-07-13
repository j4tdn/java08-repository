package Ex03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex03_Java08 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1995, 9, 25);
		calculatorYearMonthDate(date);
	}
	
	public static void calculatorYearMonthDate(LocalDate date) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE");
		DateTimeFormatter dfMonth = DateTimeFormatter.ofPattern("MMMM");
		
		int daysOfYear = date.getDayOfYear();
		int remainDaysOfYear = date.lengthOfYear() - daysOfYear;
		System.out.println("It is day number " + daysOfYear + " of year, " + remainDaysOfYear + " days left");

		System.out.println("It is " + date.format(df) + " number " + date.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear())
						+ " out of " + date.lengthOfYear() / 7 + " in " + " " + date.getYear());
	
		
		System.out.println("It is " + date.format(df) + " number "
		+ " out of " + " in " + date.format(dfMonth) + " " + date.getYear());
		
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days");
	
		System.out.println(date.format(dfMonth) + " " + date.getYear() + " has " + date.lengthOfMonth() + " days");
	}
}
