package execution;

import java.util.Scanner;

public class Ex01 {
private static final Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			int a = input();
			System.out.println("a = " + a);
			
		}
		
	}
	
	private static int input() {
		int number = 0;
		System.out.println("Enter a number");
		 do {
			 try {
				 number  = Integer.parseInt(ip.nextLine());
				 break;				 	 
			 } 
			 catch(NumberFormatException e) {
				 e.printStackTrace();
			 } 
		 } while (true);
		
		return number;
	}
}
