package datetime;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		

		System.out.println("DayOfWeek :" + weekDayUtils.getDayOfWeek(weekDay));
	}

}

//enum DayOfWeek {
//	MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(1);
//	private int value;
//	
//	 DayOfWeek(int value) {
//		this.value =value;
//	}
//	 public int  getValue() {
//		return value;
//	}
//}

//enum DayOfWeek {
//  SUNDAY ,MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
//}
