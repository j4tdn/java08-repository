package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		for (int day = 1; day <= c.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
			Calendar ctemp = Calendar.getInstance();
			ctemp.set(2020, 5, day);
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
			System.out.println(df.format(ctemp.getTime()));
		}
	}
}
