import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = new String();
		
//		do {
//			try {
//				System.out.println("Enter email: ");
//				email = sc.nextLine();
//				
//				if (!email.matches("^@")) {
//					if (email.matches(".*@.*\\..*")) {
//						if (email.matches("[a-z]$")) {
//							System.out.println("OK");
//						} else {
//							throw new RuntimeException("Email must end with a-z characters");
//						}
//					} else {
//						throw new RuntimeException("Format is incorrect");
//					}
//				} else {
//					throw new RuntimeException("Email can not start with '@'!");
//				}
//				
//			} catch (RuntimeException e) {
//				System.out.println(e);
//			}
//		} while (true);
//		
//		System.out.println(email);
		
		do {
			try {
				System.out.println("Enter email: ");
				email = sc.nextLine();
				
				// check has 1 '@' character
				if (email.split("@").length != 2 && email.indexOf('@') != email.length() - 1) {
					throw new RuntimeException("Email just have 1 '@' character!");
				}
				
				if (email.indexOf("@") == 0 || email.indexOf("@") == (email.length() - 1)) {
					throw new RuntimeException("'@' cannot be a begin or end of email");
				}
				
				if (email.lastIndexOf('.') < email.indexOf('@') || email.indexOf('.') == email.length() - 1) {
					throw new RuntimeException("Email is invalid");
				}
				
				System.out.println("Email is valid");
				break;
			} catch (RuntimeException e) {
				System.out.println(e);
			}
		} while (true);
	}
}
