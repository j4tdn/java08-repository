package Ex02;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex02_Java07 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		Calendar lstart = Calendar.getInstance();
		lstart.set(2019, 4, 2, 16, 20, 20);
		
		Calendar lend = Calendar.getInstance();
		
		System.out.println("Bạn đang ở tình trạng nào: 1. Đang yêu    2. Đã chia tay");
		int state = ip.nextInt();
		
		switch (state) {
		case 1:
			break;

		case 2: 
			System.out.println("Nhập thời gian chia tay năm-tháng-ngày H:p:s: ");
			int year = ip.nextInt();
			int month = ip.nextInt();
			int day = ip.nextInt();
			
			int hours = ip.nextInt();
			int minutes = ip.nextInt();
			int seconds = ip.nextInt();
			
			lend.set(year, month, day, hours, minutes, seconds);
			break;
			
		default:
			break;
		}
		
		long durations = lstart.getTimeInMillis() - lend.getTimeInMillis();
		
		int years = lend.get(Calendar.YEAR) - lstart.get(Calendar.YEAR);
		int monthStart = lstart.get(Calendar.MONTH);
		int monthEnd = lend.get(Calendar.MONTH);
		int months = 0;
		
		int dateStart = lstart.get(Calendar.DAY_OF_MONTH);
		int dateEnd = lend.get(Calendar.DAY_OF_MONTH);
		int days = 0;
		
		if (monthEnd < monthStart) {
			years -= 1;
			months = monthEnd - monthStart + 12;
		} else {
			months = monthEnd - monthStart;
		}

		if (dateEnd < dateStart) {
			months -= 1;
			days = dateEnd - dateStart + lend.getActualMaximum(Calendar.MONTH);
		} else {
			days = dateEnd - dateStart;
		}
		
//		long remainHMS = durations - years * 365 * 24 * 60 * 60 * 1000 - months * 30 *24 * 60 * 60 * 1000 - days * 24 * 60 * 60 * 1000;
//		
//		//long remainHoursInMil = duration - TimeUnit.DAYS.toMillis(days);
//		long hours = TimeUnit.MILLISECONDS.toHours(remainHMS);
//		
//		long remainMinutesInMil = remainHMS - TimeUnit.HOURS.toMillis(hours);
//		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainMinutesInMil);
//		
//		long remainSecondInMil = remainMinutesInMil - TimeUnit.MINUTES.toMillis(minutes);
//		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainSecondInMil);;
		
		System.out.println("years: " + years + 
				"\nmonths: " + months + 
				"\ndays: " + days );
//				+ "\nhours: " + hours +
//				"\nminutes: " + minutes + 
//				"\nseconds: " + seconds);
	}
	
	public static int counMonthHast31DaysInyear(Calendar lstart, Calendar lend) {
		int count = 0;
		for (Calendar c = lstart; c.before(lend); c.add(Calendar.MONTH, 1)) {
//			if (c.getActualMaximum(Calendar.DAY_OF_MONTH) == 31) {
//				count++;
//			}
		}
		return count;
	}
}

//if (c.get(Calendar.MONTH) == 1 | c.get(Calendar.MONTH) == 3 | c.get(Calendar.MONTH) == 5 | c.get(Calendar.MONTH) == 7 | 
//c.get(Calendar.MONTH) == 8 | c.get(Calendar.MONTH) == 10 | c.get(Calendar.MONTH) == 12) {
//count ++;
//}
