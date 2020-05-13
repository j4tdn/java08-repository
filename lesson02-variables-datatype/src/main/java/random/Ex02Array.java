package random;

import java.util.Random;

public class Ex02Array {

	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = {"Lan", "Hoa", "Đào", "Cúc"};
		
		String first = students[rd.nextInt(students.length)];
		
		String second = students[rd.nextInt(students.length)];
		while (second.equals(first)) {
			second = students[rd.nextInt(students.length)];
		}
		System.out.println("first: " + first);
		System.out.println("second: " + second);
		
		String test = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		
		System.out.println("==============================");
		
		for (String student: students) {
			System.out.println(student);
		}
	}

}
