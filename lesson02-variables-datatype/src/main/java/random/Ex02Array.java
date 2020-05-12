package random;

import java.util.Random;

public class Ex02Array {

	private static Random rd = new Random();

	public static void main(String[] args) {
		String[] students = { "Lan", "Hoa", "Đào", "Mai" };

		String first = students[rd.nextInt(4)];
		String second = students[rd.nextInt(4)];
		while (first.equals(second)) {
			second = students[rd.nextInt(4)];
		}

		System.out.println(first + ", " + second);
		System.out.println("==============================");

		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				break;
			}
		}
		
		for(String student:students) {
			System.out.println(student);
		}
	}
}
