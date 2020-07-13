package datetime08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Ex03 {
	private static final Scanner sc = new Scanner(System.in);
	private static String FORMAT_DATE = "dd/MM/yyyy";

	private static DateTimeFormatter df = DateTimeFormatter.ofPattern(FORMAT_DATE);

	public static LocalDate inputData() {
		LocalDate result = null;
		do {
			System.out.println("Nhập ngày tháng năm : ( theo định dạng " + FORMAT_DATE + "): ");
			String sdate = sc.nextLine();
			try {
				result = LocalDate.parse(sdate, df);
				break;
			} catch (DateTimeParseException e) {
				System.err.println("Vui lòng nhập đúng định dạng " + FORMAT_DATE + " !!!" + "\nvd: 12/7/2020");
			}
		} while (true);
		return result;
	}

	public static String getDayOfWeek(LocalDate date) {
		String[] today = { "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7", "Chủ Nhật" };
		return today[date.get(ChronoField.DAY_OF_WEEK) - 1];
	}

	public static void displayData(LocalDate ldate) {

		String date = df.format(ldate);
		String dayOfWeek = getDayOfWeek(ldate);
		int month = ldate.getMonthValue();
		int year = ldate.get(ChronoField.YEAR);
		int dayOfYear = ldate.get(ChronoField.DAY_OF_YEAR);
		int totalDaysOfYear = ldate.lengthOfYear();
		System.out.println("\nNgày " + date + " là " + dayOfWeek + "\n==============================");

		System.out.println("Đây là ngày thứ " + dayOfYear + " của năm");
		System.out.println("Còn lại " + (totalDaysOfYear - dayOfYear) + " ngày là hết năm");
		System.out.println("Năm " + year + " có " + totalDaysOfYear + " ngày");

		getDayOfWeekInYear(ldate);
		getDayOfWeekInMonth(ldate);
		System.out.println("Tháng " + month + " năm " + year + " có " + ldate.lengthOfMonth() + " ngày ");
	}

	public static void getDayOfWeekInMonth(LocalDate ldate) {
		int total = 0;
		int times = 0;
		String dayOfWeek = getDayOfWeek(ldate);
		int month = ldate.getMonth().getValue();
		int year = ldate.getYear();

		LocalDate start = LocalDate.of(year, month, 1);

		while (start.getMonthValue() == month) {
			if (start.getDayOfWeek().getValue() == ldate.getDayOfWeek().getValue()) {
				start = start.plusDays(7);
				total++;
				if (start.getDayOfMonth() <= ldate.getDayOfMonth()) {
					times++;
				}
			} else {
				start = start.plusDays(1);
			}
		}

		System.out.println("Đây là " + dayOfWeek + " thứ " + times + " trong số " + total + " ngày " + dayOfWeek
				+ " của tháng " + month + " năm " + year);
	}

	public static void getDayOfWeekInYear(LocalDate ldate) {
		int total = 0;
		int times = 0;
		String dayOfWeek = getDayOfWeek(ldate);
		int month = ldate.getMonth().getValue();
		int year = ldate.getYear();

		LocalDate start = LocalDate.ofYearDay(year, 1);

		while (start.getYear() == year) {
			if (start.getDayOfWeek().getValue() != ldate.getDayOfWeek().getValue()) {
				start = start.plusDays(1);
			} else {
				total++;
				start = start.plusDays(7);
				if (start.getDayOfYear() <= ldate.getDayOfYear()) {
					times++;
				}
			}
		}

		System.out.println("Đây là " + dayOfWeek + " thứ " + times + " trong số " + total + " ngày " + dayOfWeek
				+ " của tháng " + month + " năm " + year);
	}

	public static void main(String[] args) {
		displayData(inputData());
	}
}