import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex04Java8 {

	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static DateTimeFormatter dfForLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		getTimeInNewYork();
		lastDateOfMonth();
		totalDayOfMonths();
		firstAndLastDayOfWeek();
		weekInYear();
		addMore8Hour();
		duration(LocalDate.of(2020, 5, 10), LocalDate.now());
		after20days();
		remainMonthInYear();
	}

	private static void getTimeInNewYork() {
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));

		System.out.println("1. " + localDateTime.format(df));
	}

	private static void totalDayOfMonths() {
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("2. " + localDateTime.format(df));

	}

	private static void lastDateOfMonth() {
		LocalDate localDate = LocalDate.now();
		localDate = LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.lengthOfMonth());
		System.out.println("3. " + localDate.format(dfForLocalDate));
	}

	private static void firstAndLastDayOfWeek() {
		LocalDate localDate = LocalDate.now();
		localDate = localDate.minusDays(localDate.getDayOfMonth() - 1);
		System.out.println("4. " + localDate.format(dfForLocalDate));

		localDate = localDate.plusDays(localDate.lengthOfMonth() - 1);
		System.out.println(localDate.format(dfForLocalDate));

	}

	private static void weekInYear() {
		LocalDate localDate = LocalDate.now();

		System.out
				.println("5. Week in year: " + localDate.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear()));
	}

	private static void addMore8Hour() {
		LocalDateTime localDateTime = LocalDateTime.now();
		localDateTime.plusHours(8);
		System.out.println("6. " + localDateTime.format(df));
	}

	private static void duration(LocalDate start, LocalDate end) {
		Period period = Period.between(start, start);

		if (period.getDays() < 0) {
			period = period.minusMonths(1);
			int dayOfMonth = start.lengthOfMonth();
			period = period.withDays(dayOfMonth - 1);
		}
		System.out.println(
				"7. Year: " + period.getYears() + " months: " + period.getMonths() + " days: " + period.getDays());

	}

	private static void after20days() {
		LocalDate localDate = LocalDate.now();

		localDate = localDate.plusDays(20);
		System.out.println("8. " + localDate.format(dfForLocalDate));
	}

	private static void remainMonthInYear() {
		LocalDate localDate = LocalDate.now();

		System.out.println("9. Remaining Month in Year: " + (12 - localDate.getMonthValue()));
	}
}
