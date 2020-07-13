package datetime08;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.previous;

public class Ex01 {
	public static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE");

	public static void getAllSundaysInYear(int year) {
		LocalDate firstDayOfYear = LocalDate.of(year, 1, 1);

		while (firstDayOfYear.getYear() == year) {
			firstDayOfYear = firstDayOfYear.with(next(SUNDAY));
			System.out.println(df.format(firstDayOfYear));
		}
	}

	public static void getLastSunday(int year) {
		LocalDate lastDayOfYear = YearMonth.of(year, 12).atEndOfMonth();
		System.out.println(df.format(lastDayOfYear.with(previous(SUNDAY))));
	}

	public static void main(String[] args) {
		getAllSundaysInYear(2020);
		getLastSunday(2020);
	}
}
