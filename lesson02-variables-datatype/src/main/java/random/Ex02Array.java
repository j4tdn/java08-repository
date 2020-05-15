package random;

import java.util.Random;

public class Ex02Array {
	public static void main(String[] args) {
//		String[] student = new String[5];
		String[] student = {"Lan", "Hoa", "Dao", "Cuc"};
		
		Random rd = new Random();
		String first = student[rd.nextInt(student.length)];
		String second = student[rd.nextInt(student.length)];
		
		while (first.equals(second)) {
			 second = student[rd.nextInt(student.length)];
		}
		
		System.out.println(first);
		System.out.println(second);
		
		String num  = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		
		System.out.println("================================");
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}
		}
		
		System.out.println("================================");
		
		for (String string : student) {
			System.out.println(string);
		}
	}
}
