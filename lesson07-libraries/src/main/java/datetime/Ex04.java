package datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Ex04 {

	private static final String DATE_PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		for (LocalDate date = today; date.isBefore(LocalDate.of(2020, 7, 07)); date = date.plusDays(1)) {
			DateFormat df = new SimpleDateFormat(DATE_PATTERN);
			System.out.println(df.format(Date.valueOf(date)));
		}
	}

}
