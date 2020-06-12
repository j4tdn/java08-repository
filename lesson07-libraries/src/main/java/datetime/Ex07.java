package datetime;

import java.util.Calendar;

import bean.Lesson;

public class Ex07 {
	public static void main(String[] args) {
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		Calendar timeEnd = Calendar.getInstance();
		while(times>0) {
			if(timeEnd.get(Calendar.DAY_OF_WEEK)==Calendar.TUESDAY||timeEnd.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY) {
				times--;
				if(times==0) {
					break;
				}
			}
			timeEnd.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(WeekdayUtils.toStringDate(timeEnd.getTime(), "dd/MM/YYYY EEEE"));
	}
	
	private static int countNumberOfSections(Lesson[] lessons) {
		int result=0;
		for(Lesson lesson: lessons) {
			result += lesson.getTimes();
		}
		return result;
	}
	
	private static Lesson[] getAll() {
		return new Lesson[] {new Lesson("Lesson07", 2),
				new Lesson("Lesson08", 3),
				new Lesson("Lesson09", 2),
				new Lesson("Lesson10", 3),
				new Lesson("Lesson11", 2),
				new Lesson("Lesson12", 2)};
	}
	

}
