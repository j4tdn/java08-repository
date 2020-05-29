package execution;

import java.util.Scanner;

public class Ex03 {
private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		divide();
	}
	private static int divide() {
		try {
			System.out.print("enter a: ");
			int a=Integer.parseInt(sc.nextLine());
			System.out.print("enter b: ");
			int b=Integer.parseInt(sc.nextLine());
			return a/b;
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		
		}
		return 0;
	}

}
