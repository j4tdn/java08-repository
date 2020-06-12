package datetime;

import java.util.Arrays;
import java.util.Calendar;

import beans.Lesson;
import utils.DateUtils;

public class Ex07 {

	public static void main(String[] args) {
		Lesson[] lessons = getAll();
		int times = Arrays.stream(lessons).mapToInt(i -> i.getTimes()).sum();

		Calendar firstDate = Calendar.getInstance();
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());

		boolean isEven = times % 2 == 0;
		int weeks = times / 2;

		int index = 0;
		while (index < times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			
			if (weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				index++;
				if (index == times) {
					break;
				}
			} 

			lastDate.add(Calendar.DATE, 1);
		}

		System.out.println(DateUtils.toString(lastDate.getTime(), "dd/MM/yyyy EEEE"));
	}

	private static Lesson[] getAll() {
		Lesson ls1 = new Lesson("1", 0);
		Lesson ls2 = new Lesson("1", 0);
		Lesson ls3 = new Lesson("1", 0);
		Lesson ls4 = new Lesson("1", 0);
		Lesson ls5 = new Lesson("1", 0);
		Lesson ls6 = new Lesson("1", 3);

		return new Lesson[] { ls1, ls2, ls3, ls4, ls5, ls6 };
	}
}
