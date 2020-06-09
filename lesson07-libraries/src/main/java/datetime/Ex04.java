package datetime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	private static final String DATE_PATTERN="dd/MM/yyyy";
	public static void main(String[] args) {
		
		//print the dáy (dd/MM/yyyy) in a range
		// today -> 7/8/2020
		DateFormat df = new SimpleDateFormat(DATE_PATTERN);
		Calendar today = Calendar.getInstance(); //getInstance lấy ngày tháng năm hiện tại
		
		Calendar until = Calendar.getInstance();
		until.set(2020, 7, 7);
		
		for (Calendar c = today; c.before(until); c.add(Calendar.DATE, 1)) {
			System.out.println(df.format(c.getTime()));
		}
	}
}
