import java.util.Scanner;

public class Bai3 {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhap email");
		do {
		String email1 = ip.nextLine();
		try {
			KTemail(email1);
			break;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}while(true);
	}

	public static void KTemail(String s) throws Exception {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if (!s.matches(EMAIL_REGEX)) {
			throw new Exception(" moi nhap dung dinh dang email");
		}
	}
}
