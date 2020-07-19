package Ex02;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static Scanner ip = new Scanner(System.in);
	public static String codeRegex = "bkit-[0-9]{3}";
	public static String nameRegex = "[\\p{L}\\s]{6,}";
	public static String passwordRegex = "[0-9a-zA-Z]*[A-Z]+[0-9a-zA-Z]*[!@#$%^&*]+[0-9a-zA-Z]*{8,63}";
	public static String dateOfBirthRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

	public static void main(String[] args) {

		System.out.print("Nhập mã: ");
		do {
			try {
				String code = inputCode();
				break;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		System.out.print("Nhập tên: ");
		do {
			try {
				String name = inputName();
				break;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		System.out.print("Nhập mật khẩu: ");
		do {
			try {
				String password = inputPassword();
				break;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		System.out.print("Nhập ngày sinh: ");
		do {
			try {
				String dateOfBirth = inputDateOfBirth();
				break;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		// break;

		System.out.println("You have successfully registered !");

	}

	public static String inputCode() throws IOException {
		String code = "";
		while (true) {
			code = ip.nextLine();
			if (!code.matches(codeRegex)) {
				throw new IOException("Enter the correct code format please !");
			}
			break;
		}
		return code;
	}

	public static String inputName() throws IOException {
		String name = "";
		while (true) {
			name = ip.nextLine();
			if (!name.matches(nameRegex)) {
				throw new IOException("Enter the correct name format please !");
			}
			break;
		}

		return name;

	}

	public static String inputPassword() throws IOException {
		String password = "";
		while (true) {
			password = ip.nextLine();
			if (!password.matches(passwordRegex)) {
				throw new IOException("Enter the correct password format please !");
			}
			break;
		}
		return password;
	}

	public static String inputDateOfBirth() throws IOException {
		String dateOfBirth = "";
		while (true) {
			dateOfBirth = ip.nextLine();
			if (!dateOfBirth.matches(dateOfBirthRegex)) {
				throw new IOException("Enter the correct date of birth format please !");
			}
			break;
		}
		return dateOfBirth;
	}
}
