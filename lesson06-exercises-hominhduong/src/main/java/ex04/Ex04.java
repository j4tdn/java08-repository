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
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Type of char, is not digit");
				check = true;
			} finally {

			}

		} while (check);

		return a;
	}

	private static String readNumber(int a) {
		String readNumber = "";
		String number[] = { " ", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười", "mười môt",
				"mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín" };
/*
		if (a % 100 < 20) {
			if (a % 100 < 10) {
				readNumber = "le " + number[a % 100] + " ";
				a /= 100;
			} else {
				readNumber = number[a % 100] + " ";
				a /= 100;
			}
		} else {
			readNumber = number[a % 10] + " ";
			a /= 10;
			readNumber = number[a % 10] + " " + readNumber + " ";
			a /= 10;
		}
		if (a == 0) {
			return readNumber;
		}
*/
		int countLengthOfNumber = 0;
		int temp=a;
		while (temp > 0) {
			System.out.println(a % 10);
			temp /= 10;
			countLengthOfNumber++;
		}
		System.out.println("length of number: "+countLengthOfNumber);
		if (countLengthOfNumber == 1) {
			System.out.println(number[a]);
			return number[a];
		}
		if (countLengthOfNumber == 2) {
			int rowUnit=0, dozens=0;
			rowUnit=a%10;
			System.out.println(number[a % 10]);
			
			return number[a % 10];
			
		}
		
		return number[a] + " tram " + readNumber;
	}
}
