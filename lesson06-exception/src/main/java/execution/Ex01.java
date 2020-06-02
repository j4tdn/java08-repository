package execution;

import java.util.Scanner;

public class Ex01 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
			int a = input();
			
			System.out.println("a :" + a);
		
		
		
		
	}
	private static int input() {
		
		int number = 0;
		
		System.out.println("Enter a number : ");
		
		  do {
			try {
				System.out.println("dong code nay se khong chay neu dong tren bi loi ,");
				return Integer.parseInt(sc.nextLine()); // dong ***;
				
				
				// dong 
			} catch (NumberFormatException e) {
				
							// in code loi o doan nay trong file ;
							e.printStackTrace();
							
							// cai nay chi in ra loi 
							System.out.println(e.getMessage());
			}
			
		}
		while(true);
		
		
		
		
		
	}
}
