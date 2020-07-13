package datetime08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex04 {

	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private static LocalDateTime ldate = LocalDateTime.now();

	public static void main(String[] args) {
		getTimeInNewYork();
		System.out.println(getTotalDayOfMonth());
		getLastDateOfMonth();
		getFirstAndLastDateOfWeek();
		getWeekOfYear();
		getTime8HoursLater();
		getDuration(LocalDate.of(2019, 9, 2), ldate.toLocalDate());
		getTime20DaysLater();
		getRemainingMonthsOfYear();
	}

	private static void getTimeInNewYork() {
		LocalDateTime ldatetimeNY = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(df.format(ldatetimeNY));
	}

	private static int getTotalDayOfMonth() {
		return ldate.toLocalDate().lengthOfMonth();
	}

	private static void getLastDateOfMonth() {
		LocalDateTime ldDate = LocalDateTime.now().withDayOfMonth(ldate.toLocalDate().lengthOfMonth());
		System.out.println(df.format(ldDate));
	}

	private static void getFirstAndLastDateOfWeek() {
		LocalDateTime ldatetime = LocalDateTime.now().with(ChronoField.DAY_OF_WEEK, DayOfWeek.MONDAY.getValue());
		System.out.println(df.format(ldatetime));

		ldatetime.plusDays(6);
		System.out.println(df.format(ldatetime));
	}

	private static void getWeekOfYear() {
		System.out.println(ldate.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear()));
	}

	private static void getTime8HoursLater() {
		LocalDateTime ldatetime = LocalDateTime.now();
		ldatetime.plusHours(8);
		System.out.println(df.format(ldatetime));
	}

	private static void getDuration(LocalDate start, LocalDate end) {
		Period period = Period.between(start, end);

		System.out.println(period.getYears() + " year " + period.getMonths() + " month");

	}

	private static void getTime20DaysLater() {
		LocalDateTime ldate = LocalDateTime.now();
		ldate.plusDays(20);

		System.out.println(df.format(ldate));
	}

	private static void getRemainingMonthsOfYear() {
		System.out.println(12 - ldate.getMonthValue());
	}
}
