package bean;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		while (true) {
			input();
		}
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			try {
				System.out.print("Nhập gmail  s = ");
				s = sc.nextLine();
				if (s.matches("^[a-z0-9_]+@[a-z\\.a-z]{1,}$") == true) {
					System.out.println("Mail vua nhap: " + s);
				}else {
					System.out.println("Moi nhap lai email: ");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
	}
}