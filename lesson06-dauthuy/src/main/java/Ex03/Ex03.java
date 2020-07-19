package Ex03;

import java.util.Scanner;

public class Ex03 {
	public static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String email = "";
		do {
			try {
				email = inputEmailAddress();
				break;
			} catch (EmailException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		
	}

	public static String inputEmailAddress() throws EmailException {
		System.out.print("Nhập địa chỉ email: ");
		String emailAddress = "";
		
		while (true) {
			emailAddress = ip.nextLine();
			if (!isEmaAddressil(emailAddress)) {
				throw new EmailException("Please enter the correct email format !");
			} else {
				System.out.println("email address is valid !");
			}
			break;
		}
		return emailAddress;
	}

	public static boolean isEmaAddressil(String s) {
		return s.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
	}
}

//X*: X xảy ra không hoặc nhiều lần
//X+: X xảy ra 1 hoặc nhiều lần
