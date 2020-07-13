package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex04Java07 {
	private static DateFormat dfCurrent = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyy");

	public static void main(String[] args) {
		Calendar cstart = Calendar.getInstance();
		Calendar cend = Calendar.getInstance();

		cstart.set(2019, Calendar.DECEMBER, 20);
		cend.set(2020, Calendar.SEPTEMBER, 19);

		timeInNY(); // 1
		checkDayOfMonth(); // 2
		lastDateOfMonth(); // 3
		firstLastWeek(); // 4
		whichWeek(); // 5
		addHours(); // 6
		duringYears(cstart, cend); // 7
		checkAddDays(); // 8
		monthsLeft(); // 9
		age(); // 10

	}

	private static void timeInNY() {
		Calendar c = Calendar.getInstance();
		TimeZone timezone = TimeZone.getTimeZone("America/New_York");
		dfCurrent.setTimeZone(timezone);

		System.out.println("1. Thời gian hiện tại của New York: " + dfCurrent.format(c.getTime()));
	}

	private static void checkDayOfMonth() {
		Calendar c = Calendar.getInstance();
		System.out.println("2. Tháng có: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày");
	}

	private static void lastDateOfMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("3. Ngày cuối cùng của tháng hiện tại: " + df.format(c.getTime()));
	}

	private static void firstLastWeek() {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.DATE);
		System.out.println("4. Ngày đầu tiên của tuần hiện tại: " + df.format(c.getTime()));

		c.add(Calendar.DATE, 6);
		System.out.println("   Ngày cuối cùng của tuần hiện tại: " + df.format(c.getTime()));
	}

	private static void whichWeek() {
		Calendar c = Calendar.getInstance();
		System.out.println("5. Ngày hiện tại đang ở tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm");
	}

	private static void addHours() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, 8);
		System.out.println("6. Thêm 8 tiếng vào thời gian hiện tại: " + df.format(c.getTime()));
	}

	private static void duringYears(Calendar cstart, Calendar cend) {
		int years = cend.get(Calendar.YEAR) - cstart.get(Calendar.YEAR);
		int month = cend.get(Calendar.MONTH) - cstart.get(Calendar.MONTH);
		int date = cend.get(Calendar.DAY_OF_MONTH) - cstart.get(Calendar.DAY_OF_MONTH);

		if (date < 0) {
			month -= 1;
			date += cend.getActualMaximum(Calendar.MONTH);
		}
		if (month < 0) {
			years -= 1;
			month += 12;
		}
		System.out.println("7. Khoảng: " + years + " years " + month + " month " + date + " days");
	}

	private static void checkAddDays() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 20);
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(
				"8. Sau 20 ngày nữa là ngày thứ: " + DateUtils.getDayOfWeek(weekday) + " " + (df.format(c.getTime())));

	}

	private static void monthsLeft() {
		Calendar c = Calendar.getInstance();
		System.out.println("9. Còn lại: " + (12 - c.get(Calendar.MONTH)) + " tháng.");
	}

	private static void age() {
		Calendar cstart = Calendar.getInstance();
		Calendar cend = Calendar.getInstance();

		cstart.set(2019, Calendar.DECEMBER, 20);
		duringYears(cstart, cend);
	}
}
