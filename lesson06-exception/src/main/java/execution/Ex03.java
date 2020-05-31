package execution;

import java.util.Scanner;

public class Ex03 {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		devide();
	}

	private static int devide() {
		try {
			System.out.println("Enter a");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("Enter b");
			int b = Integer.parseInt(sc.nextLine());
			return a / b;
		} catch (NumberFormatException e) { //(NumberFormatException | ArithmeticException e) 
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return 0;

	}
}
