package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
	private static final DateFormat df = new SimpleDateFormat("dd MMMM yyyy ");
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap nam: ");
		int a=sc.nextInt();
		System.out.println("nhap thang: ");
		int b=sc.nextInt();
		System.out.println("Nhap ngay :");
		int d=sc.nextInt();
		Calendar c= Calendar.getInstance();		
		c.set(a, b-1, d);		
		getInformationOfDate(c);
	}

	private static void getInformationOfDate(Calendar c) {
		
		DateFormat dfDay = new SimpleDateFormat("EEEE");

		DateFormat dfMonth = new SimpleDateFormat("MMMM");

		System.out.println(df.format(c.getTime()) + " is a " + dfDay.format(c.getTime()));

		int a=c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("It is day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year, "+ a + " days left");

		System.out.println("It is " + dfDay.format(c.getTime()) + " number " + c.get(Calendar.WEEK_OF_YEAR)+ " out of " + c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + c.get(Calendar.YEAR));

		System.out.println("It is " + dfDay.format(c.getTime()) + " number "+ c.get(Calendar.WEEK_OF_MONTH) + " out of " + c.getActualMaximum(Calendar.WEEK_OF_MONTH) + " in "
									+ dfMonth.format(c.getTime()) + " " + c.get(Calendar.YEAR));

		System.out.println("Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");

		System.out.println(dfMonth.format(c.getTime()) + " " + c.get(Calendar.YEAR) + " has "+ c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
		
	}

}

