package execution;

import java.util.Scanner;

public class Ex01 {
	private static final Scanner sc = new Scanner(System.in); // bat bien o nho

	public static void main(String[] args) {
		while (true) {
			int a = input();
			System.out.println("a: " + a);
		}

	}

	private static int input() {
		
		do {
			try {
				System.out.print("Enter number: ");
				return  Integer.parseInt(sc.nextLine());
				
			} catch (NumberFormatException e) {
				//System.out.println("please enter a valid  number !!!");
				//e.printStackTrace();
				System.out.println(e.getMessage());

			}
		} while (true);
		
	}

}
