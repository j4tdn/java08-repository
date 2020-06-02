package datetime;

import java.awt.color.CMMException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.WeekDayUtils;

public class Ex03 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Calendar ctmp = Calendar.getInstance();
		ctmp.set(Calendar.MONTH, c.get(Calendar.MONTH));
		ctmp.set(Calendar.YEAR, c.get(Calendar.YEAR));
		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int minDayOfMonth = c.getActualMinimum(Calendar.DAY_OF_MONTH);
		for(int date = minDayOfMonth; date <= maxDayOfMonth; date++) {
			ctmp.set(Calendar.DAY_OF_MONTH, date);
			//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			//System.out.println(df.format(ctmp.getTime()) + ":  " + WeekDayUtils.getDayOfWeek(ctmp.get(Calendar.DAY_OF_WEEK)));
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy: EEEE");
			System.out.println(df.format(ctmp.getTime()));
		}

	}

}
