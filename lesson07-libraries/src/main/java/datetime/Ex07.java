package datetime;

import java.util.Calendar;

import beans.Lesson;
import utils.DateUtils;

public class Ex07 {
	public static void main(String[] args) {
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		Calendar firstDate = Calendar.getInstance();
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());
		int count = 0;
		while (count < times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if (weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				count++;
				if (count == times) {
					break;
				}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(DateUtils.toString(lastDate.getTime(), "dd/MM/yyyy EEEE"));
	}

	private static int countNumberOfSections(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTimes();
		}
		return result;
	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lesson01", 2), new Lesson("Lesson02", 1), new Lesson("Lesson03", 0) };
	}
}
