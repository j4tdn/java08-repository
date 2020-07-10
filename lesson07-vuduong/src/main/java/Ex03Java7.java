import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex03Java7 {
	public static void main(String[] args) {
		getInformationOfDate(Calendar.getInstance());
	}

	private static void getInformationOfDate(Calendar cal) {
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy ");

		DateFormat dfForDayOfWeek = new SimpleDateFormat("EEEE");

		DateFormat dfForMonth = new SimpleDateFormat("MMMM");

		System.out.println(df.format(cal.getTime()) + " is a " + dfForDayOfWeek.format(cal.getTime()));

		System.out.println("It is day number " + cal.get(Calendar.DAY_OF_YEAR) + " of the year, "
				+ (cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR)) + " days left");

		System.out.println("It is " + dfForDayOfWeek.format(cal.getTime()) + " number " + cal.get(Calendar.WEEK_OF_YEAR)
				+ " out of " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + cal.get(Calendar.YEAR));

		System.out.println("It is " + dfForDayOfWeek.format(cal.getTime()) + " number "
				+ cal.get(Calendar.WEEK_OF_MONTH) + " out of " + cal.getActualMaximum(Calendar.WEEK_OF_MONTH) + " in "
				+ dfForMonth.format(cal.getTime()) + " " + cal.get(Calendar.YEAR));

		System.out.println(
				"Year " + cal.get(Calendar.YEAR) + " has " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");

		System.out.println(dfForMonth.format(cal.getTime()) + " " + cal.get(Calendar.YEAR) + " has "
				+ cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
		
	}

}
