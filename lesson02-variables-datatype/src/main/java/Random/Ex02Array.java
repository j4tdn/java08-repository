package Random;

import java.util.Random;

public class Ex02Array {
	public static void main(String[] args) {
		Random rd = new Random();
		String students[] = {"Lan", "Hoa", "Dao", "Cuc"};
	//	String result = students[rd.nextInt(students.length)];
		
		String first = students[rd.nextInt(students.length)];
		String second = students[rd.nextInt(students.length)];
		
		while(second.equals(first)) {
			second = students[rd.nextInt(students.length)];
		}
		
		System.out.println("first: " + first);
		System.out.println("second: " + second);
		
		System.out.println("========================================");
		
		for(int i = 1; i < students.length; i++) {
			if(i == 4) {
				break;//continue: vo nghia: len vong for lai, ko di xuong
			}
			System.out.println("i: " + students[i]);
		}
		
		System.out.println("========================================");
		//foreach
		for (String student : students) {
			System.out.println(student);
		}
	}
}

//Ctrl + shift + T: tim ham
