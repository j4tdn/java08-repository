package random;

import java.util.Random;

public class Ex02Array {

	public static void main(String[] args) {
		String[] student = { "lan", "hoa", "dao", "cuc" };
		Random rd = new Random();
		String first = student[rd.nextInt(student.length)];
		String second = student[rd.nextInt(student.length)];
		while (second.equals(first)) {
			second = student[rd.nextInt(student.length)];
		}
		System.out.println("first :" + first);
		System.out.println("second :" + second);

		System.out.println("==================");
		for (int i = 0; i < student.length; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println("i :" + student[i]);
		}
		System.out.println("==============");
		for(String students:student) {
			System.out.println(students);
		}
	}

}
