package Bai3;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import util.DateUtils;

public class java08 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		
		
		
		feature(inputData());
		
		
		
	}
	
	
	public static void feature(LocalDate lc) {
		
		//1 
		System.out.println(lc.getDayOfYear() + "     " + (lc.lengthOfYear() - lc.getDayOfYear()));
		
		
		//2
		System.out.println(lc.getYear());
		System.out.println(lc.getDayOfWeek());
		
		
		LocalDate today = LocalDate.of(lc.getYear(), 1, 1);
		
		System.out.println("today" +df.format(today));
		LocalDate fake = lc.plusDays(1);
		
		System.out.println("fake " +df.format(fake));
		
		int count = 0 ;
		
		while(today.isBefore(fake)) {
			
			if(today.getDayOfWeek() == fake.getDayOfWeek()) {
				count ++ ;
				today = today.plusDays(7);
			}
			else {
				today = today.plusDays(1);
			}
		}
		
		System.out.println( "count .... " +count);
	}
	
	
	public static LocalDate inputData() {
		
		System.out.println(" Moi ban nhap vao ngay thang nam ");
		
		
		String date = sc.nextLine();
		
		LocalDate today = LocalDate.now() ;
		
		try {
			 today = DateUtils.toLocalDate(date, "dd/MM/yyyy");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		return today ;
		
	
	}
	
	
	
}
