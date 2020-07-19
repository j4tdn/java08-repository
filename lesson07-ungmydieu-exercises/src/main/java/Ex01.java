import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("Enter year: ");
		year = sc.nextInt();
		
		getAllSundaysInYear(year);		
		System.out.println("========================");
		getLastSunday(year);
	}
	
	public static void getAllSundaysInYear(int year) {
		Calendar d = Calendar.getInstance();
		d.set(year, 0, 1);		

		while (d.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			d.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("All Sundays in year: ");
		while (d.get(Calendar.YEAR) == year) {
			System.out.println(utils.Format.toString(d, "dd-MM-yyyy EEE"));
			d.add(Calendar.DAY_OF_MONTH, 7);
		}
	}
	
	public static void getLastSunday(int year) {
		Calendar d = Calendar.getInstance();
		d.set(year, 11, 31);		

		while (d.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			d.add(Calendar.DAY_OF_MONTH, -1);
		}
		System.out.println("Last Sunday in year: " + utils.Format.toString(d, "dd-MM-yyyy EEE"));
	}
}
