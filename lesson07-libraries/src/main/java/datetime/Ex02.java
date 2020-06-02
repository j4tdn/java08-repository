package datetime;

import java.lang.invoke.SwitchPoint;
import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex02 {
	Calendar c = Calendar.getInstance();
	int weekday = c.get(Calendar.DAY_OF_WEEK);
	
	DayOfWeeks[] dayofweeks = DayOfWeeks.values();
	
}
	enum DayOfWeeks{
		SUNDAY , MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
