package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] mssv = { "bkit-123", "bkit-56a", "1bkit-23", "bkit-789" };
		System.out.println("Kiểm tra mssv: ");
		checkMssv(mssv);

		System.out.println("------------------------------------");

		String[] name = { "Nguyễn Văn A", "ngô văn b", "Hồ", "123 @" };
		System.out.println("Kiểm tra tên:  ");
		checkName(name);

		System.out.println("------------------------------------");

		String[] pass = { "Anhthu$1612", "anhthu123", "A@AAAAAAAAAAA" };
		System.out.println("Kiểm tra pass :");
		checkPass(pass);

		System.out.println("------------------------------------");

		String s = "33/12/1999";
		String s1="16/12/1999";
		System.out.println("Kiểm tra ngày tháng năm sinh:  ");
		checkDate(s);
		checkDate(s1);

	}

	public static void checkMssv(String[] s) {
		for (int i = 0; i < s.length; i++) {
			boolean match = s[i].matches("bkit-[0-9]{3}");
			System.out.println(s[i] + " :" + match);
		}
	}

	public static void checkName(String[] s) {
		for (int i = 0; i < s.length; i++) {
			boolean match = s[i].matches(
					"[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]{6,}+");
			System.out.println(s[i] + " :" + match);
		}
	}

	public static void checkPass(String[] s) {
		for (int i = 0; i < s.length; i++) {
			boolean match = s[i].matches("[0-9a-zA-Z]*[A-Z]+[0-9a-zA-Z]*[!@#$%^&*]+[0-9a-zA-Z]*{8,63}");
			System.out.println(s[i] + " :" + match);
		}
	}

	public static void checkDate(String s) {
		boolean match = s.matches(
				"(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
		if (match == true) {
			System.out.println(s + " :" + match);
		} else {
			System.out.println(" Ngày tháng năm sinh không hợp lệ, hãy nhập lại :");
		}
	}

}
