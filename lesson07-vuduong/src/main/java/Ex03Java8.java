import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Ex03Java8 {
	public static void main(String[] args) {
		getInformationOfDate(LocalDate.now());
	}

	private static void getInformationOfDate(LocalDate ldate) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMMM yyyy ");

		DateTimeFormatter dfForDayOfWeek = DateTimeFormatter.ofPattern("EEEE");

		DateTimeFormatter dfForMonth = DateTimeFormatter.ofPattern("MMMM");

		System.out.println(ldate.format(df) + " is a " + ldate.format(dfForDayOfWeek));

		System.out.println("It is day number " + ldate.getDayOfYear() + " of the year, "
				+ (ldate.lengthOfYear() - ldate.getDayOfYear()) + " days left");

		System.out.println("It is " + ldate.format(dfForDayOfWeek) + " number "
				+ ldate.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear())

				+ " out of " + (ldate.lengthOfYear() / 7 + 1) + " in " + ldate.getYear());

		LocalDate tempDate = LocalDate.of(ldate.getYear(), ldate.getMonth(), 1);
		while (tempDate.getDayOfWeek() != ldate.getDayOfWeek()) {
			tempDate = tempDate.plusDays(1);
		}

		int countWeekOfDayInMonth = 1;
		int weekOfMonth = 1;
		while (tempDate.getMonth() == ldate.getMonth()) {
			if (tempDate.equals(ldate)) {
				weekOfMonth = countWeekOfDayInMonth;
			}

			tempDate = tempDate.plusWeeks(1);

			countWeekOfDayInMonth += 1;
		}

		System.out.println("It is " + ldate.format(dfForDayOfWeek) + " number " + weekOfMonth + " out of "
				+ --countWeekOfDayInMonth + " in " + ldate.format(dfForMonth) + " " + ldate.getYear());

		System.out.println("Year " + ldate.getYear() + " has " + ldate.lengthOfYear() + " days");

		System.out
				.println(ldate.format(dfForMonth) + " " + ldate.getYear() + " has " + ldate.lengthOfMonth() + " days");

	}
}
