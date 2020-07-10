import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Ex01Java8 {
	public static void main(String[] args) {
		getLastSunday(2020);
	}

	private static void getAllSundayInYear(int year) {
		LocalDate lDate = LocalDate.of(year, 1, 1);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		while (lDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
			lDate = lDate.plusDays(1);
		}
		
		while (lDate.getYear() == year) {
			System.out.println(lDate.format(df));
			lDate = lDate.plusWeeks(1);
		}
	}

	private static void getLastSunday(int year) {
		LocalDate lDate = LocalDate.of(year, Month.DECEMBER, 31);
		while (lDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
			lDate = lDate.minusDays(1);
		}

		System.out.println(lDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}
}
