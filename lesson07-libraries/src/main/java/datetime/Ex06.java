package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class Ex06 {

	public static int totalOfSundays(Calendar c) {
		int count = 0;
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		Calendar start = Calendar.getInstance();
		start.set(year, month, 1);

		Calendar end = Calendar.getInstance();
		end.set(year, month, c.getActualMaximum(Calendar.DAY_OF_MONTH));

		while (start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				start.add(Calendar.DAY_OF_MONTH, 7);
				count++;
			} else {
				start.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return count;
	}

	// 31 ngay... cn dau tien <= ngay 3 -> 5 ngay cn
	// 30 ngay... cn dau tien <= ngay 2 -> 5 ngay cn

	public static boolean isFiveSunday(Calendar c) {
		return totalOfSundays(c) == 5;
	}

	public static int[] getMonthHasFiveSundays(Calendar c) {
		int months[] = new int[12];
		int mindex = 0;
		Calendar ctemp = Calendar.getInstance();
		for (int month = 0; month <= 11; month++) {
			ctemp.set(c.get(Calendar.YEAR), month, c.get(Calendar.DAY_OF_MONTH));
			if (isFiveSunday(ctemp)) {
				months[mindex++] = month + 1;
			}
		}
		return Arrays.copyOfRange(months, 0, mindex);
	}

	public static void main(String[] args) {
		int[] months = getMonthHasFiveSundays(Calendar.getInstance());
		for (int month : months) {
			System.out.println(month);
		}
	}
}
