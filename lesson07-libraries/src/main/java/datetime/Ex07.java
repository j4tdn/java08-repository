package datetime;

import java.util.Calendar;

import beans.Lesson;
import utils.DateUtils;

public class Ex07 {

	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {

		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		Calendar firstDate = Calendar.getInstance();
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());
		
		int index = 0;
		while (index < times) {
			int weekDay = lastDate.get(Calendar.DAY_OF_WEEK);
			if (weekDay == Calendar.TUESDAY || weekDay == Calendar.FRIDAY) {
				index++;
				if (index == times) {
					break;
				}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("lastDate: " + DateUtils.toString(lastDate.getTime(), DATE_PATTERN));
	}

	private static int countNumberOfSections(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTimes();
		}
		return result;
	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lesson07", 2), new Lesson("Lesson08", 2), new Lesson("Lesson09", 2),
				new Lesson("Lesson10", 2), new Lesson("Lesson11", 2), new Lesson("Lesson12", 2), new Lesson("Lesson13", 2), };
	}
}
