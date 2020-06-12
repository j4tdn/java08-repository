package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import beans.Lesson;
import utils.DateUtils;

public class Ex07 {

	public static void main(String[] args) {

		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		Calendar firstDate = Calendar.getInstance();
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime((firstDate.getTime()));
		int index = 0;
		while (index < times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if (weekday == firstDate.TUESDAY || weekday == firstDate.FRIDAY) {
				index++;
				if (index == times) {
					break;
				}
				
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("lastDate:" + DateUtils.Tostring(lastDate.getTime(), "dd/MM/yyy EEEE"));

	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lessom01", 3), new Lesson("Lessom02", 0), new Lesson("Lessom03", 0),
				new Lesson("Lessom04", 0), new Lesson("Lessom05", 0), new Lesson("Lessom06", 0), };

	}

	private static int countNumberOfSections(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTime();
		}
		return result;
	}
}
