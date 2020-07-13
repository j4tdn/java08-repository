package datetime07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	private static final Scanner sc = new Scanner(System.in);
	private static String FORMAT_DATE = "dd/MM/yyyy";

	public static Date inputData(SimpleDateFormat sdf) {
		Date result = null;
		do {
			System.out.println("Nhập ngày tháng năm : ( theo định dạng " + FORMAT_DATE + " ): ");
			String sdate = sc.nextLine();
			sdf.setLenient(false);
			try {
				result = sdf.parse(sdate);
				break;
			} catch (ParseException e) {
				System.err.println("Vui lòng nhập đúng định dạng " + FORMAT_DATE + " !!!" + "\nvd: 12/7/2020");
			}
		} while (true);
		return result;
	}

	public static String getDayOfWeek(Calendar cal) {
		String[] today = { "Chủ Nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7" };
		return today[cal.get(Calendar.DAY_OF_WEEK) - 1];
	}

	public static void displayData(Calendar cal, SimpleDateFormat sdf) {

		String date = sdf.format(cal.getTime());
		String dayOfWeek = getDayOfWeek(cal);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int totalDaysOfYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		int totalDaysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int totalDayOfWeekInMonth = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);

		System.out.println("\nNgày " + date + " là " + dayOfWeek + "\n==============================");

		System.out.println("Đây là ngày thứ " + dayOfYear + " của năm");
		System.out.println("Còn lại " + (totalDaysOfYear - dayOfYear) + " ngày là hết năm");
		getDayOfWeekInYear(cal);
		System.out.println("Năm " + year + " có " + totalDaysOfYear + " ngày");
		System.out.println("Đây là " + dayOfWeek + " thứ " + dayOfWeekInMonth + " trong số " + totalDayOfWeekInMonth
				+ " ngày " + dayOfWeek + " của tháng " + month + " năm " + year);
		System.out.println("Tháng " + month + " năm " + year + " có " + totalDaysOfMonth + " ngày ");

	}

	public static void getDayOfWeekInYear(Calendar c) {
		int total = 0;
		int times = 0;

		int year = c.get(Calendar.YEAR);

		Calendar start = Calendar.getInstance();
		start.set(Calendar.YEAR, year);
		start.set(Calendar.DAY_OF_YEAR, 1);

		Calendar end = Calendar.getInstance();
		end.set(Calendar.YEAR, year);
		end.set(Calendar.DAY_OF_YEAR, c.getActualMaximum(Calendar.DAY_OF_YEAR));

		while (start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				total++;
				start.add(Calendar.DAY_OF_MONTH, 7);
				if (start.get(Calendar.DAY_OF_YEAR) <= c.get(Calendar.DAY_OF_YEAR)) {
					times++;
					System.out.println("times: " + times);
				}
			} else {
				start.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		System.out.println("Đây là " + getDayOfWeek(c) + " thứ " + times + " trong số " + total + " của năm " + year);
	}

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputData(sdf));
		displayData(cal, sdf);
	}
}