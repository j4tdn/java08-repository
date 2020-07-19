package ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int number = inputNumber();
		readNumber(number);
	}

	public static int inputNumber() {
		int a = 0;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Number ?");
			try {
				a = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) { // TODO: handle exception
				System.out.println("Type of char, is not digit");
				check = true;
			}
		} while (check);

		return a;
	}

	private static String readNumber(int a) {
		String result = "";
		String number[] = { " ", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi", "muoi mot",
				"muoi hai", "muoi ba", "muoi bon", "muoi lam", "muoi sau", "muoi bay", "muoi tam", "muoi chin" };
		if (a % 100 < 20) {
			if (a % 100 < 10) {
				result = "le " + number[a % 100] + " ";
				a /= 100;
			} else {
				result = number[a % 100] + " ";
				a /= 100;
			}
		} else {
			result = number[a % 10] + " ";
			a /= 10;
			result = number[a % 10] + " " + result + " ";
			a /= 10;
		}
		if (a == 0) {
			return result;
		}
		System.out.println(number[a] + " tram " + result);
		return number[a] + " tram " + result;
	}
}
