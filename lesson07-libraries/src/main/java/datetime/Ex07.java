package datetime;

import java.util.Calendar;

import bean.Lesson;
import utils.DateUtils;

public class Ex07 {
	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";
	public static void main(String[] args) {
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		Calendar firstDate = Calendar.getInstance();
		
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(lastDate.getTime());
		
		int index = 0;
		while (index < times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if (weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				index++;
				if (index == times) break;
			}			
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println(DateUtils.toString(lastDate.getTime(), DATE_PATTERN));
	}
	
	private static Lesson[] getAll() {
		return new Lesson[] {
				new Lesson("Lesson01", 2),
				new Lesson("Lesson02", 0),
				new Lesson("Lesson03", 0),
				new Lesson("Lesson04", 0),
				new Lesson("Lesson05", 0),
				new Lesson("Lesson06", 0)
		};
	}
	
	private static int countNumberOfSections(Lesson[] lesssons) {
		int result = 0;
		
		for (Lesson lesson : lesssons) {
			result += lesson.getTimes();
		}
		System.out.println(result);
		return result;
	}
	
	
}
