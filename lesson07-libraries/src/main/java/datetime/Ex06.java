package datetime;

import java.util.Calendar;

public class Ex06 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2020, 0, 1);
		// for(int i=0;i<=11;i++) {
		if (checkMonth(date)) {
			// System.out.println(i+1);
		}
		// date.set(2020, i, 1);
		// }

	}

	public static boolean checkMonth(Calendar date) {
		int count = 0, n = 1;
		int month = date.get(Calendar.MONTH);
		
		for (int i = 1; i <= date.getActualMaximum(Calendar.DAY_OF_MONTH);) {
			System.out.println(WeekdayUtils.toStringDate(date.getTime(), "dd/MM/YYYY EEEE"));
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && date.get(Calendar.MONTH) == month) {
				count++;	
				date.add(Calendar.DAY_OF_MONTH, 7);
				System.out.println(WeekdayUtils.toStringDate(date.getTime(), "dd/MM/YYYY EEEE"));
				System.out.println(count);
				i+=7;
			} else {
				date.set(Calendar.DAY_OF_MONTH, i);
				i+=1;
			}

		}
		System.out.println(count);
		return count == 5;
	}

}
