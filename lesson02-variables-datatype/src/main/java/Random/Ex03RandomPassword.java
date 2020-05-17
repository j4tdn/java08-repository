package Random;

import java.util.Random;

public class Ex03RandomPassword {

	private static Random rd = new Random();

	public static void main(String[] args) {
		String username = "admin";
		String password = "259";
		String[] passwordInputs = new String[1000];

		int i = 0;
		String passwordInput = "";
		while (!passwordInput.equals(password)) {
			passwordInput = RandomNumber(3);
			if (contains(passwordInputs, password)) {
				continue;
			}
			passwordInputs[i] = passwordInput;
			sleep(10);
			System.out.print(passwordInput + "  ");
			i++;
			if (i != 0 && i % 14 == 0) {
				System.out.println();
			}
			
		}
		System.out.println("login success!");
	}

	private static boolean contains(String[] elements, String input) {

		for (String elemnent : elements) {
			if (elemnent != null && elemnent.equals(input))
				return true;
		}

		return false;
	}

	private static String RandomNumber(int count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			result += rd.nextInt(10);
		}
		return result;
	}

	private static void sleep(long second) {
		try {
			Thread.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
