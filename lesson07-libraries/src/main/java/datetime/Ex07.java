package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import beans.Lesson;
import util.DateUtils;

public class Ex07 {
	
	private static final DateFormat df = new SimpleDateFormat("dddd/mm/yyyy EEEE");
	
	
	
	private static Lesson[] getAll() {
		
		return new Lesson[] {
				
				new Lesson("Lesson01",3),
				new Lesson("Lesson02",1),
				new Lesson("Lesson03",1),
				new Lesson("Lesson04",2),
				new Lesson("Lesson05",3),
				new Lesson("Lesson06",3)
		};
		
			
	}
	
	
	private static int countNumberOfSections( Lesson[] lessons) {
		
		int result = 0 ;
		
		for(Lesson lesson : lessons) {
			result += lesson.getTimes();		
		}
			
		return result;
		
	}
	
	public static void main(String[] args) {
		
		
		Lesson[] lessons = getAll();
		
		int times = countNumberOfSections(lessons);
		
		Calendar firstDate = Calendar.getInstance();
		
		Calendar lastDate = Calendar.getInstance();
		
		lastDate.setTime(firstDate.getTime());
		
		
		
		
		int index = 0;
		
		while(index < times) {
			
			int weekDay = lastDate.get(Calendar.DAY_OF_WEEK);
			
			if(weekDay == Calendar.TUESDAY || weekDay == Calendar.FRIDAY) {
				
				index ++;
				if(index == times ) {
					break;
				}				
			};
			
			lastDate.add(Calendar.DAY_OF_MONTH, 1);
			
			
		}
			System.out.println("times "+times) ;
			System.out.println(DateUtils.toString(lastDate.getTime(), "dd/MM/yyyy EEEE"));
		
		
		
		
	}
	
}
