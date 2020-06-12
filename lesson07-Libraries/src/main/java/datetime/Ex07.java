package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import beans.Lesson;

public class Ex07 {
	public static void main(String[] args) {

		Calendar firstDate = Calendar.getInstance();
		Lesson[] lessons = getAll();
		int times = countNumberSections(lessons);
		System.out.println(times);
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());

		int index = 0;
		while (times > index) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if (weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				index++;
				if (index == times) {
					break;
				}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy/EEEE");
		System.out.println(df.format(lastDate.getTime()));
	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lesson01", 2), new Lesson("Lesson02", 3), new Lesson("Lesson03", 1),
				new Lesson("Lesson04", 1), new Lesson("Lesson05", 3), new Lesson("Lesson06", 2) };
	}

	private static int countNumberSections(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTimes();
		}
		return result;
	}
}
