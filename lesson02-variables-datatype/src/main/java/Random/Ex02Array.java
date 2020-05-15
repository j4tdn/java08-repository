package Random;

import java.util.Random;

public class Ex02Array {

	public static void main(String[] args) {
		Random rd = new Random();
		String students[] = { "Lan", "Hoa", "Dao", "Cuc" };

		String first = students[rd.nextInt(students.length)];

		String second = students[rd.nextInt(students.length)];
		
		while(second.equals(first)) {
			second = students[rd.nextInt(students.length)];
		}
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
		
		System.out.println("===========");
		
		//for index
		for (int i =0; i<students.length; i++) {
			//System.out.println("i: "+i);
			if(i==2) {
				continue;
				
			}
			System.out.println("i: "+students[i]);
		}
		
		System.out.println("===========");
		//for each: chi quan tam den gia tri phan tu trong mang
		for (String student: students) {
			System.out.println("i: "+student);
		}
	}

}
