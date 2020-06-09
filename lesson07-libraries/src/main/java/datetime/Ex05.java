package datetime;

import java.util.Calendar;

public class Ex05 {
	private static final String DATE_PATTEN = "dd/MM/yyyy EEEE";
	public static void main(String[] args) {
		//DateFormat df = new SimpleDateFormat(DATE_PATTEN);
		Calendar today = Calendar.getInstance();//Locale.FRANCE
		//first day of week
		int firstDayOfWeek = today.get(Calendar.DAY_OF_MONTH)-today.get(Calendar.DAY_OF_WEEK) +today.getFirstDayOfWeek();
		//System.out.println("fday"+today.getFirstDayOfWeek());
		
		Calendar fdayCal = Calendar.getInstance();
		fdayCal.set(today.get(Calendar.YEAR),today.get(Calendar.MONTH), firstDayOfWeek);
		
		Calendar ldayCal = Calendar.getInstance();
		ldayCal.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH), firstDayOfWeek+7);
		System.out.println("milisecond "+ldayCal.getTimeInMillis());
		
		for (Calendar c = fdayCal; c.before(ldayCal); c.add(Calendar.DATE, 1)) {
			System.out.println("milisecond "+c.getTimeInMillis());
			System.out.println(DayUtils.toString(c.getTime(), DATE_PATTEN));
		}
	}
}
