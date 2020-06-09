package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		// print the dáy (đ/mm/yyy EEE ) IN A RANGE
		// today -> 07/08/2020
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY EEEE");

		Calendar today = Calendar.getInstance();

		Calendar until = Calendar.getInstance();
		until.set(2020, 07, 07);

		for (Calendar c = today; c.before(until); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println(df.format(c.getTime()));
		}
	}
}
