package Ex04;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class Ex04_Java08 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDate start = LocalDate.of(2020, 5, 11);
		LocalDate end = LocalDate.of(2020, 10, 11);
		
		timeCurrentInNewYork();
		numberDaysOfCurrentMonth(date);
		lastDayofCurrentMonth(date);
		firstAndLasrDayOfWeek();
		numberWeekInYear(date);
		addEightHoursToCurrnetTime(time);
		numberOfMonthsAndYearsBetweenDuration(start, end);
		afterTwentyDays(date);
		remainMonthsInYear(date);
		Age(date);
	}

	public static void timeCurrentInNewYork() {
		LocalDateTime currentDateTimeInNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
		String dtf = currentDateTimeInNewYork.format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"));

		System.out.println("1. Thời gian hiện tại ở New York: " + dtf);
	}

	public static void numberDaysOfCurrentMonth(LocalDate date) {
		Month currentMonth = date.getMonth();
		int numberDays = currentMonth.maxLength();
		System.out.println("2. Tháng hiện tại có " + numberDays + " ngày");
	}

	public static void lastDayofCurrentMonth(LocalDate date) {
		LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		String lastDay = lastDayOfMonth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("3. Ngày cuối cùng của tháng hiện tại: " + lastDay);
	}

	public static void firstAndLasrDayOfWeek() {
		LocalDate firstDayOfThisWeek = LocalDate.now().with(DayOfWeek.MONDAY);
		String firsttDay = firstDayOfThisWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("4.1. Ngày đầu tiên của tuần hiện tại: " + firsttDay);

		LocalDate lastDayOfWeek = firstDayOfThisWeek.plusDays(6);
		String lastDay = lastDayOfWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("4.2. Ngày cuối cùng của tuần hiện tại: " + lastDay);
	}

	public static void numberWeekInYear(LocalDate date) {
		int weekNumber = date.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
		System.out.println("5. Ngày hiện tại đang ở tuần thứ " + weekNumber + " trong năm");
	}
	
	public static void addEightHoursToCurrnetTime(LocalTime time) {
		System.out.println("6. Thời gian hiện tại sau khi thêm 8 tiếng: " + time.plusHours(8));
	}
	
	public static void numberOfMonthsAndYearsBetweenDuration(LocalDate start, LocalDate end) {
		Period period = Period.between(start, end);
		int years = period.getYears();
		int months = period.getMonths();
		
		System.out.println("7. Khoảng cách giữa 2 khoảng thời gian là: " + years + " năm " + months + " tháng");
	}
	
	public static void afterTwentyDays(LocalDate date) {
		LocalDate d = date.plusDays(20);
		System.out.println("8. Sau 20 ngày: " +  d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE")));
	}
	
	public static void remainMonthsInYear(LocalDate date) {
		int remainMonths = 12 - date.getMonthValue();
		System.out.println("9. Số tháng còn lại trong năm: " + remainMonths);
	}
	
	public static void Age(LocalDate today) {
		LocalDate dateOfBirth = LocalDate.of(1999, 8, 2);
		Period period = Period.between(dateOfBirth, today);
		
		System.out.println("10. Tuổi thọ của bạn là: " + period.getYears() + " tuổi " + period.getMonths() + " tháng " + period.getDays() + " ngày");
	}
}
	