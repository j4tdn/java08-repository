package datetime;

import java.util.Calendar;

import bean.Lesson;
import utils.DateUtils;

/*year 2020
 * java 08: in ra thoi gian cua buoi học java basic
 * biết rwanfg:
 * 1 bài học cuối cùng phần java là lesson13
 * 2 hiện tại lớp đã họ đến buổi cuối của lesson07
 * 3. trung bình 2 buổi 1 lesson
 * 
 * in ra định fangj dd/MM/yyyy
 * 
 */
public class Ex07 {
	private static final String DATE_PATTEN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		
		
/*
 * // tim ra so tuan
		int firstLessonDay = Calendar.TUESDAY;
		int lastLessonDay = Calendar.FRIDAY;
		Calendar firstLessonDate= Calendar.getInstance();
		int firstLesson = firstLessonDate.get(Calendar.DAY_OF_WEEK);
		
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);// so buoi
		
		//so buoi chan hay le;
		boolean isEvent = times%2==0;
		
		//ttim so tuan, neu ngay chan cong so ngay la hai con le
		int weeks= times/2;
		Calendar lasCalendarDate = Calendar.getInstance();
		lasCalendarDate.setTime(firstLessonDate.getTime());
		if(!isEvent) {
			//lay buoi cuoi cung cua buoi hoc cong them 2 ngay
			firstLessonDate.add(Calendar.WEEK_OF_YEAR, weeks);
		}else {
			
		}
		*/
		Lesson[] lessons = getAll();
		int times = countNumberOfSections(lessons);
		Calendar firsDate = Calendar.getInstance();
		Calendar lastDate = Calendar.getInstance();
		lastDate.setTime(firsDate.getTime());
		
		int index =0;
		//2
		while(index<times) {
			int weekday = lastDate.get(Calendar.DAY_OF_WEEK);
			if(weekday == Calendar.TUESDAY || weekday ==Calendar.FRIDAY) {
				index++;
				if (index==times) {
					break;
				}
			}
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("times: "+times);
		System.out.println("lastdate: "+DateUtils.toString(lastDate.getTime(),"dd/MM/yyyy EEEE"));
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
				new Lesson("Lesson07", 2), };
	}
}
