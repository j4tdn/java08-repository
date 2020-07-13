import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Bai4 {
	private final static DateFormat df = new SimpleDateFormat("dd/MM/YYY HH:mm:ss");

	public static void main(String[] args) {
		TimeInNewYork();
		Calendar c = Calendar.getInstance();
		int maxdayofmonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("thang hien tai co " + maxdayofmonth + " ngay");
		c.set(Calendar.DAY_OF_MONTH, maxdayofmonth);
		System.out.println("ngay cuoi cung cua thang " + df.format(c.getTime()));
		Tuan();
		weekInYear();
		add8Hours();
		add20Days();
		dayleft();

	}

	public static void TimeInNewYork() {
		TimeZone newyork = TimeZone.getTimeZone("America/New_York");
		Calendar c = Calendar.getInstance(newyork);
		df.setTimeZone(newyork);
		System.out.println("Time in Newyork " + df.format(c.getTime()));

	}

	public static void Tuan() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		System.out.println("ngay nho nhat trong tuan " + df.format(c.getTime()));
		c.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("ngay lon nhat trong tuan " + df.format(c.getTime()));

	}
	public static void weekInYear() {
		Calendar c = Calendar.getInstance();
		System.out.println("tuan hien tai la tuan thu " + c.get(Calendar.WEEK_OF_YEAR) + " trong nam");
	}
	public static void add8Hours() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, 8);
		System.out.println("them 8 tieng " + df.format(c.getTime()));
	}
	public static void add20Days() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("them 20 ngay " + df.format(c.getTime()));
	}
	public static void dayleft() {
		Calendar c = Calendar.getInstance();
		int t = c.get(Calendar.MONTH);
		int maxDayInYear = c.getActualMaximum(Calendar.MONTH);
		int m = maxDayInYear - t;
		System.out.println("so thang con lai " +m);
	}
	
}
