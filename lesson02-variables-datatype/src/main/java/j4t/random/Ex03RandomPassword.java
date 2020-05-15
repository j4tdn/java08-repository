package j4t.random;

import java.util.Random;

public class Ex03RandomPassword {
	private static Random rd = new Random();

	public static void main(String[] args) {
		String username = "admin";
		String password = "259";
		int count = 0;
		// find the way to attack the account
		String[] passwordInputs = new String[1000];
		String passwordInput = "";
		while (!password.equals(passwordInput)) {

			passwordInput = randomNumber(3);
			// sleep(500);
			if (contains(passwordInputs, passwordInput)) {
				continue;
			} else {
				passwordInputs[count] = passwordInput;
			}
			System.out.print(passwordInput + "\t");
			count++;
			if (count != 0 && count % 14 == 0) {
				System.out.println();
			}
			
		}
		System.out.println("Login success!");

	}

	private static String randomNumber(int count) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < count; i++) {
			result.append(rd.nextInt(10));
		}
		return result.toString();
	}

	private static void sleep(long miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static boolean contains(String[] arr, String item) {
		for (String element : arr) {
			if (element != null && element.equals(item)) {
				return true;
			}
		}
		return false;
	}
}
