package Ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter b: ");
		float b = inputNumber();

		float a = 0;
		System.out.print("Enter a: ");
		a = inputNumber();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			System.out.println("Nghiệm của pt là: x = " + solveEquationOrder1(a, b));
		}
	}

	public static float inputNumber() {
		float number = 0;
		while (true) {
			try {
				number = Float.parseFloat(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(" Please enter a number !");
			}
		}
		return number;
	}

	public static float solveEquationOrder1(float a, float b) throws ArithmeticException {
		return -b / a;
	}
}
