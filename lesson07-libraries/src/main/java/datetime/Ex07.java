package datetime;

import java.util.Calendar;

import javax.swing.text.AbstractDocument.BranchElement;

import been.Lesson;

public class Ex07 {

	public static void main(String[] args) {
	
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		System.out.println(times);
		
		Calendar firstDate = Calendar.getInstance();
		Calendar lastDate =  Calendar.getInstance();
		lastDate.setTime(firstDate.getTime());
		int index = 0;
		
		while (index < times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if(weekday == Calendar.TUESDAY || weekday == Calendar.FRIDAY) {
				index++;
				if(index == times) {
					break;
				}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println("lastdate: " + DayUtils.toString(lastDate.getTime(), "dd/MM/yyyy EEEE"));

	}

	private static int countNumberOfSections(Lesson[] lessons) {
		int result = 0;
		for (Lesson lesson : lessons) {
			result += lesson.getTimes();
		}
		return result;
	}

	private static Lesson[] getAll() {
		return new Lesson[] { new Lesson("Lesson01", 2), new Lesson("Lesson02", 2), new Lesson("Lesson03", 2),
				new Lesson("Lesson04", 2), new Lesson("Lesson05", 2), new Lesson("Lesson06", 2),
				new Lesson("Lesson07", 2) };
	}

}
