package ex02;

import java.util.Scanner;

public class DateUtils {
	public static Scanner sc = new Scanner(System.in);
	
	public static int inputYear() {
		boolean isValid = true;
		int year = 0;
		do {
			System.out.println("Enter year: ");
			try {
				year = Integer.parseInt(sc.nextLine());
				isValid = false;
				if (year <= 0) {
					isValid = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Error: Year is a numberic > 0");
				isValid = true;
			}
		} while (isValid);
		return year;
	}

	public static int inputMonth() {
		boolean isValid = true;
		int month = 0;
		do {
			System.out.println("Enter month: ");
			try {
				month = Integer.parseInt(sc.nextLine());
				isValid = false;
				if (month < 1 || month > 12) {
					isValid = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Error: Month is numberic [1-12]");
				isValid = true;
			}
		} while (isValid);
		return month;
	}

	private static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		}
		return false;
	}

	public static int inputDay(int year, int month) {
		boolean isValid = true;
		int day = 0;
		do {
			System.out.println("Enter day: ");

			try {
				day = Integer.parseInt(sc.nextLine());
				isValid = false;
				if (day < 1) {
					System.out.println("Day is greater than 1");
					isValid = true;
				}
				switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (day > 31) {
						System.out.println("Month " + month + " is less equal than 31 days");
						isValid = true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (day > 30) {
						System.out.println("Month " + month + " is less equal than 30 days");
						isValid = true;
					}
					break;
				case 2:
					if (isLeapYear(year)) {
						if (day > 29) {
							System.out.println("Month " + month + " is less equal than 29 days");
							isValid = true;
						}
					} else {
						if (day > 28) {
							System.out.println("Month " + month + " is less equal than 28 days");
							isValid = true;
						}
					}
					break;
				}
			} catch (NumberFormatException ex) {
				isValid = true;
			}
		} while (isValid);
		return day;
	}

}
