package ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Java08 {
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void main(String[] args) {
		getAllSundayInYear(2020);
		System.out.println("==================");
		getLastSunday(2020);
	}

	private static void getAllSundayInYear(int year) {
		LocalDate lDate = LocalDate.of(year, 1, 1);
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
