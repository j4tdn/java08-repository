package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class DateUtils {

	private DateUtils() {
		
	}
	
	public static dayOfWeek getDayOfWeek(int weekDayIndex) {
		
		if(weekDayIndex < 1 || weekDayIndex > 7) {
			return dayOfWeek.NULL;
		}
		
		return dayOfWeek.values()[weekDayIndex - 1 ];
	}
	
	public static String toString(Date date, String pattern) {
		
		if(date ==null ) {
			throw new RuntimeException("date cannot be null !!! " );
		}
		
		if(pattern == null ) {
			return new SimpleDateFormat().format(date);
		}
		return new SimpleDateFormat(pattern).format(date);
		
		
		
	}
	
	
	
	
	
}
enum dayOfWeek{
	SUNDAY,
	MONTHDAY,
	TUESDAY,
	WEDNESDAY,
	THURDAY,
	FRIDAY,
	STATURDAY, NULL
	;	
}
