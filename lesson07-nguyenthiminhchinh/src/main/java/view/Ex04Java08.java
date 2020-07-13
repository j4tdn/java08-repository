package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;

import java.time.format.DateTimeFormatter;

public class Ex04Java08 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 7, 13);
		timeInNY();
		checkDayOfMonth(date);
		lastDateOfMonth(date);
		firstLastWeek(date); 
		whichWeek(date); // 5c
		addHours();
		duringYears();
		checkAddDays(date);
		monthsLeft(date);
	}

	private static void timeInNY() {
		ZoneId zoneId = ZoneId.of("America/New_York");
		System.out.println("1. " + LocalDateTime.now(zoneId));
	}

	private static void checkDayOfMonth(LocalDate date) {
		System.out.println("2. Tháng có: " + date.lengthOfMonth() + " ngày");
	}

	private static void lastDateOfMonth(LocalDate date) {
		LocalDate dateLast = LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth());
		System.out.println("3. Ngày cuối cùng của tháng hiện tại: " + dateLast.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	private static void firstLastWeek(LocalDate date) {
		while (date.getDayOfWeek() != DayOfWeek.MONDAY) {
			date = date.minusDays(1);
		}
		System.out.println(
				"4. Ngày đầu tiên của tuần hiện tại: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("   Ngày cuối cùng của tuần hiện tại: "
				+ date.plusDays(6).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}

	private static void whichWeek(LocalDate date) {

		System.out.println("5. Ngày hiện tại đang ở tuần thứ ");
	}

	private static void addHours() {
		LocalTime time = LocalTime.of(20, 29, 30);
		time = time.plusHours(8);
		System.out.println("6. Thêm 8 tiếng vào thời gian hiện tại: " + time);
	}

	private static void duringYears() {
		LocalDate startDate = LocalDate.of(2019, 12, 20);
		LocalDate endDate = LocalDate.of(2020, 9, 19);

		Period period = Period.between(startDate, endDate);

		if (period.getDays() < 0) {
			period = period.minusMonths(1);
			int dateOfMonth = YearMonth.of(startDate.getYear(), endDate.getMonth()).lengthOfMonth();
			period = period.withDays(dateOfMonth - 1);
		}
		System.out.println("7. Khoảng: " + period.getYears() + " years " + period.getMonths() + " months "
				+ period.getDays() + " days");
	}

	private static void checkAddDays(LocalDate date) {
		date = date.plusDays(20);
		System.out.println(
				"8. Sau 20 ngày nữa là ngày thứ: " + date.format(DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy")));
	}

	private static void monthsLeft(LocalDate date) {
		System.out.println("9. Còn lại: " + (12 - date.getMonthValue()) + " tháng.");
	}
}
