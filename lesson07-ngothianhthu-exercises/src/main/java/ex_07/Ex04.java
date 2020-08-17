package ex_07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Calendar c= Calendar.getInstance();
		
		getCurrentTimeStamp();
		getNumberDayInMonth(date);
		getFirtAndLastDayInMonth();
		getWeekOfYear(c);
		getAdd8Hour(c);
		get20DayAfter(c);
		getMonth(c);

	}



	public static void getCurrentTimeStamp() {
		LocalDateTime currentDateTimeInNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
		String time = currentDateTimeInNewYork.format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"));
		System.out.println(time);
	}

	public static void getNumberDayInMonth(LocalDate date) {
		Scanner input = new Scanner(System.in);
		int MonthNum; 
		int Year; 
		int numDays;
		String Month;

		System.out.print("Nhập tháng: ");
		MonthNum = input.nextInt();
		System.out.print("Nhập năm: ");
		Year = input.nextInt();

		if (MonthNum == 2) {
			if ((Year % 4 == 0) && (Year % 400 == 0) && !(Year % 100 == 0))
				numDays = 29;
			else
				numDays = 28;
		} else if (MonthNum == 1 || MonthNum == 3 || MonthNum == 5 || MonthNum == 7 || MonthNum == 8 || MonthNum == 10
				|| MonthNum == 12)
			numDays = 31;
		else
			numDays = 30;

		if (MonthNum == 1)
			Month = "January";
		else if (MonthNum == 2)
			Month = "Feburary";
		else if (MonthNum == 3)
			Month = "March";
		else if (MonthNum == 4)
			Month = "April";
		else if (MonthNum == 5)
			Month = "May";
		else if (MonthNum == 6)
			Month = "June";
		else if (MonthNum == 7)
			Month = "July";
		else if (MonthNum == 8)
			Month = "August";
		else if (MonthNum == 9)
			Month = "September";
		else if (MonthNum == 10)
			Month = "October";
		else if (MonthNum == 11)
			Month = "November";
		else if (MonthNum == 12)
			Month = "December";

		System.out.println(  Year + " có " + numDays + ".");
		System.out.println(numDays);
	}
	
	public static void getFirtAndLastDayInMonth() {
		Calendar cal = Calendar.getInstance();
	    Date date1 = cal.getTime();
	    System.out.println("Thời gian hiện tại là " + date1);
		int ngayDauThang = cal.getActualMinimum(Calendar.DATE); 
	    System.out.println("Ngày đầu của tháng hiện tại năm 2020  " + ngayDauThang);
	    int ngayCuoiThang = cal.getMaximum(Calendar.DATE);
	    System.out.println("Ngày cuối của tháng hiện tại năm 2020 " + ngayCuoiThang);
	

	}
	
	public static void getWeekOfYear(Calendar c) {
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	}
	
	public static void getAdd8Hour(Calendar c) {
		c.add(Calendar.HOUR, 8);
		DateFormat df = new SimpleDateFormat("dd EEEE");
		System.out.println(df.format(c.getTime()));
	}

	public static void get20DayAfter(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 20);
		DateFormat df = new SimpleDateFormat("dd EEEE");
		System.out.println(df.format(c.getTime()));

	}

	public static void getMonth(Calendar c) {
		int a = 12 - c.get(Calendar.MONTH) - 1;
		System.out.println(a);
	}
}
