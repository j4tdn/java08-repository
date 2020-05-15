package random;

import java.util.Random;

public class Ex03RandomPassword {

	private static Random rd = new Random();

	public static void main(String[] args) {
		String username = "admin";
		String password = "259";

		// find the way to attack the account

		String[] passwordInputs = new String[1000];
		String passwordInput = "";
		int i = 0;
		while (!passwordInput.equals(password)) {
			// random password

			passwordInput = randomNumber(3);

			if (contains(passwordInputs, passwordInput)) {
				continue;
			}
			passwordInputs[i] = passwordInput;
			sleep(500);
			System.out.print(passwordInput + " ");
			i++;
			if (i != 0 && i % 14 == 0) {
				System.out.println(" ");
			}

		}
		System.out.println("Login successful !");
	}

	private static String randomNumber(int count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			result += rd.nextInt(10);
		}
		return result;
	}

	private static void sleep(long miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Boolean contains(String[] array, String element) {

		for (String elements : array) {
			if (elements != null && elements.equals(element)) {
				return true;
			}

		}
		return false;
	}

}
