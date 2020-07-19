package ex04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex04_java8 {

	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MMM/uuuu HH:mm:ss");
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		LocalDate current = LocalDate.now();
		// getTimeInNewYork();
		// totalDayOfMonths();
		// System.out.println(totalDayOfMonths());
		// lastDateOfMonth();

//		/firstAndLastDayOfWeek();
		//weekInYear();
		System.out.println();
		//addMore8Hour();
		//duration(LocalDate.of(2020, 7, 10),current);
		after20days();
		Age();
	}

	private static void getTimeInNewYork() {
		LocalDateTime timeNY = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("1." + timeNY.format(dtf));

	}

	private static int totalDayOfMonths() {
		LocalDate day = LocalDate.now();
		System.out.println("2." + day.lengthOfMonth());
		return day.lengthOfMonth();
	}

	private static void lastDateOfMonth() {
		LocalDate current = LocalDate.now();
		current = LocalDate.of(current.getYear(), current.getMonth(), current.lengthOfMonth());
		System.out.println("3. " + current.format(df));
	}

	private static void firstAndLastDayOfWeek() {
		LocalDate localDate = LocalDate.now();
		localDate = localDate.withDayOfMonth(1);
		System.out.format("4. The first day is %s\n", localDate.format(df));
		localDate = localDate.withDayOfMonth(localDate.lengthOfMonth());
		System.out.format("4. The last day is %s\n", localDate.format(df));
	}

	private static void weekInYear() {
		LocalDate localDate = LocalDate.now();

		System.out.format("5. Week in year: %d",
				localDate.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear()));

	}

	private static void addMore8Hour() {
		LocalDateTime current = LocalDateTime.now();
		current.plusHours(8);
		System.out.println("6." + current.format(dtf));

	}

	private static void duration(LocalDate start, LocalDate end) {
		Period period = Period.between(start, end);
		System.out.println(period.getDays());
		System.out.println(
				"7. Year: " + period.getYears() + " months: " + period.getMonths() + " days: " + period.getDays());

	}

	private static void after20days() {
		LocalDate current = LocalDate.now();
		System.out.println("8. "+current.format(df));
		current.plusDays(20);
		System.out.println("8. "+current.format(df));

	}

	private static void remainMonthInYear() {
		LocalDate localDate = LocalDate.now();
		System.out.println("9. Remaining Month in Year: " + (12 - localDate.getMonthValue()));
	}
	
	private static void Age() {
		Period period = Period.between(LocalDate.of(1997, 11, 21), LocalDate.now());
		System.out.println(
				"10. Age: " + period.getYears() + " months: " + period.getMonths() + " days: " + period.getDays());
	}
}
