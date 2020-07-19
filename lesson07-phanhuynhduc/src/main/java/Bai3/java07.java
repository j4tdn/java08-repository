package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import util.DateUtils;

public class java07 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	public static void main(String[] args) {
		feature(inputData());
	}
	
	
	public static void feature(Calendar c) {
		
		System.out.println(df.format(c.getTime()));
		
		//1
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		
		//2
		System.out.println("day of year"+c.get(Calendar.DAY_OF_YEAR) + ",,,,"+(c.getActualMaximum(Calendar.DAY_OF_YEAR)-c.get(Calendar.DAY_OF_YEAR)) + "days left ");
		
		Calendar today = Calendar.getInstance();
		
		today.set(c.get(Calendar.YEAR), 1, 1);
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		
		int count = 0;
		
		while(today.before(c)) {
			
			if(today.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				count ++ ;
				
				today.add(Calendar.DAY_OF_MONTH, 7);
			}
			
			else {
				today.add(Calendar.DAY_OF_MONTH, 1);
			}
			
		}
		//3
		System.out.println("count " + count );
		
		
		// 4 
		System.out.println(" Year " + c.get(Calendar.YEAR) + " has" + c.getActualMaximum(Calendar.DAY_OF_YEAR) + "days");
		
		//5 
		System.out.println(DateUtils.getMonth(c.get(Calendar.MONTH)) + ""+ c.get(Calendar.YEAR) + "has " + c.getActualMaximum(Calendar.DAY_OF_MONTH)+"days");
		
		
		
	}
	
	public static Calendar inputData() {
		System.out.println("moi ban nhap vao ngay , thang, nam  theo dinh dang dd/MM/yyyy " );
		
		String date = sc.nextLine();
		
		Calendar today = Calendar.getInstance();
		try {
			today = DateUtils.toCalendar(date, "dd/MM/yyyy");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return today ;
		
		
		
	}
	
	
	
}
