package datetime;

import java.util.Calendar;

import bean.Lesson;
import utils.DayUtils;

public class Ex07 {

	public static void main(String[] args) {

		Lesson[] lessons = getAll();
		int times = countnumberofsections(lessons);
		Calendar firstDay = Calendar.getInstance();
		Calendar lastDay=Calendar.getInstance();

		int index = 0;
		while (index < times) {
			int weekday = lastDay.get(Calendar.DAY_OF_WEEK);
			if (weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				index++;
				if(index==times) {
					break;
				}
			}
			lastDay.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("lastdate: "+DayUtils.toString(lastDay.getTime(), "dd/MM/yyyy EEEE"));

	}

	private static int countnumberofsections(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTimes();

		}
		return result;
	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lesson01", 2), new Lesson("Lesson02", 3),
				new Lesson("Lesson03", 1), new Lesson("Lesson04", 1), new Lesson("Lesson05", 3),
				new Lesson("Lesson06", 2), };
	}
}
