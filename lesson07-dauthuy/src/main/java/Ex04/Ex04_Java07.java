package Ex04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex04_Java07 {
	public static Calendar cal = Calendar.getInstance();
	public static String DATE_FORMAT = "dd/MM/yyyy";
	public static DateFormat df = new SimpleDateFormat(DATE_FORMAT);

	public static void main(String[] args) {
//		String[] availableTimezones = TimeZone.getAvailableIDs();
//		for (String timezone : availableTimezones) {
//		    System.out.println("Timezone ID = " + timezone);
//		}
		timeCurrentInNewYork();
		numberDaysOfMonth();
		lastDayInCurrentMonth();
		firstAndLastDateInWeek();
		numberOfWeekInYear();
		addEightHours();

		Calendar start = Calendar.getInstance();
		start.set(1999, 8, 2);

		Calendar end = Calendar.getInstance();
		numberOfMonthsAndYearBetweenDuration(start, end);

		afterTwentyDay();
		remainMonthsInCurrentYear();

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1999, 8 - 1, 2);
		Age(dateOfBirth);
	}

	public static void timeCurrentInNewYork() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("1. Thời gian hiện tại ở New York: " + cal.getTime());
	}

	public static void numberDaysOfMonth() {
		Calendar cal = Calendar.getInstance();
		System.out.println("2. Số ngày của tháng hiện tại: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public static void lastDayInCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("3. Ngày cuối cùng của tháng hiện tại " + df.format(cal.getTime()));
	}

	public static void firstAndLastDateInWeek() {
		Calendar today = Calendar.getInstance();

		int firstdayofweek = today.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_WEEK)
				+ today.getFirstDayOfWeek();

		Calendar fdowCal = Calendar.getInstance();
		fdowCal.set(Calendar.DAY_OF_MONTH, firstdayofweek);

		Calendar ldowCal = Calendar.getInstance();
		ldowCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstdayofweek + 6);

		System.out.println("4.1. Ngày đầu tiên của tuần: " + df.format(fdowCal.getTime()));
		System.out.println("4.2. Ngày cuối của tuần: " + df.format(ldowCal.getTime()));
	}

	public static void numberOfWeekInYear() {
		Calendar cal = Calendar.getInstance();
		System.out.println("5. Tuần hiện tại đang là tuần thứ " + cal.get(Calendar.WEEK_OF_YEAR) + " trong năm");
	}

	public static void addEightHours() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 8);
		System.out.println("6. Thêm 8 tiếng vào thời gian hiện tại: " + cal.getTime());
	}

	public static void numberOfMonthsAndYearBetweenDuration(Calendar start, Calendar end) {
		int years = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int months = 0;
		if (end.get(Calendar.MONTH) < start.get(Calendar.MONTH)) {
			years -= 1;
			months = end.get(Calendar.MONTH) - start.get(Calendar.MONTH) + 12;
		} else {
			months = end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
		}
		System.out.println("7. Khoảng cách giữa 2 mốc thời gian: " + months + " tháng " + years + " năm");

	}

	public static void afterTwentyDay() {
		DateFormat dfm = new SimpleDateFormat("EEEE");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(
				"8. Sau 20 ngày nữa là ngày " + cal.get(Calendar.DAY_OF_MONTH) + " thứ " + dfm.format(cal.getTime()));
	}

	public static void remainMonthsInCurrentYear() {
		Calendar cal = Calendar.getInstance();
		int remainMonths = cal.getActualMaximum(Calendar.MONTH) - cal.get(Calendar.MONTH);
		System.out.println("9. Số tháng còn lại trong năm từ thời điểm hiện tại: " + remainMonths);
	}

	public static void Age(Calendar dateOfBirth) {
		Calendar today = Calendar.getInstance();

		int years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		int monthBirth = dateOfBirth.get(Calendar.MONTH);
		int monthToday = today.get(Calendar.MONTH);
		int months = 0;

		int dateBirth = dateOfBirth.get(Calendar.DAY_OF_MONTH);
		int dateToday = today.get(Calendar.DAY_OF_MONTH);
		int days = 0;

		if (monthToday < monthBirth) {
			years -= 1;
			months = monthToday - monthBirth + 12;
		} else {
			months = monthToday - monthBirth;
		}

		if (dateToday < dateBirth) {
			months -= 1;
			days = dateToday - dateBirth + today.getActualMaximum(Calendar.MONTH);
		} else {
			days = dateToday - dateBirth;
		}

		System.out.println("10. Tuỗi thọ của bạn: " + years + " tuổi " + months + " tháng " + days + " ngày");
	}
}
