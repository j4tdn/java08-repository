package datetime;

import java.util.Calendar;

import beans.Lesson;
import utils.DayUtils;

public class Ex07 {
	public static void main(String[] args) {
		
		
		
		Lesson[] lessons = getAll();
		int times = countNumberOfSection(lessons);
		Calendar firstDate=Calendar.getInstance();
		Calendar lastDate=Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());
		
		
		int index=0;
		while(index<times) {
			int weekday=lastDate.get(Calendar.DAY_OF_WEEK);
			if(weekday==Calendar.FRIDAY||weekday==Calendar.TUESDAY) {
			index++;
			if(index==times) {
				break;
			}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("lastDate "+DayUtils.toString(lastDate.getTime(), "dd/MM/yy EEEE"));

	}

	private static int countNumberOfSection(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTime();
		}
		return result;
	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lesson 01", 3)
				
				
				};
	}

}
