package datetime;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;

import Utils.DateUtils;
import bean.Lesson;

public class Ex07 {
	public static void main(String[] args) {
		
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		
		Calendar firstDate = Calendar.getInstance();
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());
		int index= 0;
		while (index < times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if (weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				index++;
				if (index == times) {
					break;
				}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
			
		}
		System.out.println(DateUtils.toString(lastDate.getTime(), "dd/MM/yyyy EEEE"));
	}
	
	private static Lesson[] getAll() {
		return new Lesson[] {
				new Lesson("Lesson01", 2),
				new Lesson("Lesson02", 0),
				new Lesson("Lesson03", 0),
				new Lesson("Lesson04", 0),
				new Lesson("Lesson05", 0),
				new Lesson("Lesson06", 0),
		};
		
	}
	private static int countNumberOfSections(Lesson[] lessons ) {
		int result = 0;
		for (Lesson lesson: lessons) {
			result += lesson.getTimes();
		}
		return result;
	}
}
