package ex02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentUtils {
	public static Scanner sc = new Scanner(System.in);

	public static String inputIdStudent() {
		String id = "";
		String ID_PATTERN = "^[bkit].*[0-9]{3}";
		boolean check = false;
		do {
			System.out.println("Enter your id, example: bkit001");
			id = sc.nextLine();
			System.out.println("the id which you've entered " + id + " " + Pattern.matches(ID_PATTERN, id));
			check = Pattern.matches(ID_PATTERN, id);
		} while (!check);
		return id;
	}

	public static String inputNameStudent() {
		String name = "";
		// Tiếng việt có dấu, it nhất 6 kí tự, không được chứa kí tự số, kí tự đặc biệt.
		String NAME_PATTERN = "^[a-zA-ZàáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ].*[^0-9]{6,}";
		boolean check = false;
		do {
			System.out.println("What's your name, Your name should be Vietnames at least 6 charaters");
			name = sc.nextLine();
			System.out.println("the name which you've entered " + name + " " + Pattern.matches(NAME_PATTERN, name));
			check = Pattern.matches(NAME_PATTERN, name);
		} while (!check);
		return name;
	}

	public static String inputPassword() {
		String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}$";
		String password = "";
		/*
		 * ^ # start-of-string (?=.*[0-9]) # a digit must occur at least once
		 * (?=.*[a-z]) # a lower case letter must occur at least once (?=.*[A-Z]) # an
		 * upper case letter must occur at least once (?=.*[@#$%^&+=]) # a special
		 * character must occur at least once (?=\S+$) # no whitespace allowed in the
		 * entire string .{8,64} # anything, at least eight places though $ #
		 * end-of-string
		 * 
		 */
		boolean check = false;
		do {
			System.out.println(
					"Enter your password, which shoud have at least [8, 64] chars, contain at least one digit, one lower alpha char and one upper alpha char, one char within a set of special chars");
			password = sc.nextLine();
			System.out.println(
					"the name which you've entered " + password + " " + Pattern.matches(PASSWORD_PATTERN, password));
			check = Pattern.matches(PASSWORD_PATTERN, password);
		} while (!check);
		return password;
	}

	public static String inputDateOfBirth() {
		int year = DateUtils.inputYear();
		int month = DateUtils.inputMonth();
		int day = DateUtils.inputDay(year, month);
		return "Date: " + day + "\tMonth: " + month + "\tYear: " + year;
	}

}
