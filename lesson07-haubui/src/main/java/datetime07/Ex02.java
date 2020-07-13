package datetime07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex02 {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String format = "dd/MM/yyyy HH:mm:ss";
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();

		while (true) {

			System.out.println("Nhập ngày bắt đầu quen nhau (dd/MM/yyyy HH:mm:ss) : ");
			start = inputDate(false, format);
			System.out.println("Nhập ngày kết thúc (dd/MM/yyyy HH:mm:ss) : ");
			end = inputDate(true, format);

			if (start.before(end)) {
				break;
			}

			System.out.println("Vui lòng nhập ngày bắt đầu nhỏ hơn ngày kết thúc!!!");
		}

		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(start.getTime()));
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(end.getTime()));

		theUltimateRelationshipCalculator(start, end);
	}

	public static Calendar inputDate(boolean isEndDate, String format) {
		Calendar result = null;

		while (true) {
			try {

				String sdate = sc.nextLine();

				if (isEndDate && sdate.isEmpty()) {
					return Calendar.getInstance();
				}

				result = DateUtils.toCalender(sdate, format);
				break;
			} catch (ParseException e) {
				System.err.println("Vui lòng nhập đúng định dạng dd/MM/yyyy HH:mm:ss !!!" + "\nvd: 12/7/2020 00:00:00");
			}
		}
		return result;
	}

	public static void theUltimateRelationshipCalculator(Calendar start, Calendar end) {

		long duration = end.getTimeInMillis() - start.getTimeInMillis();
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long hours = TimeUnit.MILLISECONDS.toHours(duration) - TimeUnit.DAYS.toHours(days);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration) - TimeUnit.DAYS.toMinutes(days)
				- TimeUnit.HOURS.toMinutes(hours);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration) - TimeUnit.DAYS.toSeconds(days)
				- TimeUnit.HOURS.toSeconds(hours) - TimeUnit.MINUTES.toSeconds(minutes);

		System.out.println("Bạn đã bắt đầu hẹn hò vào " + DateUtils.getDayOfWeek(start));
		System.out.println("Hai bạn đã bên nhau được " + days + " ngày, " + hours + " giờ, " + minutes + " phút, " + seconds
				+ " giây");
	}
}
