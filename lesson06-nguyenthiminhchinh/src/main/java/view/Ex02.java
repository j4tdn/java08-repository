package view;

import java.util.Scanner;
import bean.Ex03Exception;

public class Ex02 {
	private static final Scanner ip = new Scanner(System.in);
	private static final String ID_REGEX = ("^bkit-[0-9]{3}$");
	private static final String NAME_REGEX = ("[\\p{L}\\s]{6,}$");
	private static final String PASS_REGEX = ("[\\w*[A-Z]+\\w*[A-Z]*[!@#$%^&*]+]{8,63}$");
	private static final String DOB_REGEX = ("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$");

	public static void main(String[] args) {
		do {
			try {
				System.out.println("Enter ID: ");
				ID();
				break;
			} catch (Ex03Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		do {
			try {
				System.out.println("Enter NAME: ");
				Name();
				break;
			} catch (Ex03Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		do {
			try {
				System.out.println("Enter PASS: ");
				Pass();
				break;
			} catch (Ex03Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		do {
			try {
				System.out.println("Enter DOB: ");
				DOB();
				break;
			} catch (Ex03Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		System.out.println("Done");
	}

	private static String ID() throws Ex03Exception {
		String s = "";
		s = ip.nextLine();
		if (s.matches(ID_REGEX) == false) {
			throw new Ex03Exception("ID was incorrected!!!");
		}
		return s;
	}

	private static String Name() throws Ex03Exception {
		String s = "";
		s = ip.nextLine();
		if (s.matches(NAME_REGEX) == false) {
			throw new Ex03Exception("NAME was incorrected!!!");
		}
		return s;
	}

	private static String Pass() throws Ex03Exception {
		String s = "";
		s = ip.nextLine();
		if (s.matches(PASS_REGEX) == false) {
			throw new Ex03Exception("PASSWORD was incorrected!!!");
		}
		return s;
	}

	private static String DOB() throws Ex03Exception {
		String s = "";
		s = ip.nextLine();
		if (s.matches(DOB_REGEX) == false) {
			throw new Ex03Exception("DOB was incorrected!!!");
		}
		return s;
	}
}
