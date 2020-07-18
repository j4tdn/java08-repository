package ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		email();

	}

	public static String[] email() {
		System.out.println("Số email cần nhập: ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		String[] array = new String[amount + 1];
		int count = 0;
		System.out.println("Nhập email :");

		while (count <= amount) {
			String email = sc.nextLine();
			array[count] = email;
			count++;
		}

		System.out.println("Danh sách mail đã nhập :  ");

		for (int i = 0; i <= amount; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			String s = array[i];
			boolean match = s.matches("[a-z][a-z0-9_\\.]{0,32}@[a-z0-9]{0,}(?:\\.[a-z0-9]{2,4}){1,2}");
			System.out.println("Match . " + match);
		}
		return array;
	}
}
