package execution;

import java.util.Scanner;

public class Ex01 {

	private static final Scanner ip = new Scanner(System.in); // luu tru constantpull, con ko ke thua dc

	public static void main(String[] args) {
		while (true) {
			int a = input();
			System.out.println("a: " + a);
		}
	}

	private static int input() {
		//int number = 0;
		do {
			try {
				System.out.print("Enter number: ");
				return Integer.parseInt(ip.nextLine());
			} catch (NumberFormatException e) {
				//System.out.println("Please enter a valid number !");
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (true);
	}
}
