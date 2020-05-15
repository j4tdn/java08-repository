package random;

import java.util.Random;
import java.util.Vector;

public class Ex02Array {
	public static void main(String[] args) {
		String [] students= {"Lan", "Mai", "Cuc", "Truc", "Dao"};   //mang trong java la mot kieu du lieu doi tuong
		Random rd = new Random();
		
		String first = students[rd.nextInt(students.length)];
		String second = students[rd.nextInt(students.length)];
		while (second.equals(first)) {
			second = students[rd.nextInt(students.length)];	
		}
		System.out.println(first+"\t"+second);
		//bai tap: tim mat khau 123, random ki tu az AZ -> random ma unicode ->char
		
		System.out.println("============================================");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i+"\t");
			if (i==4) {
				break;
			}
		}
		System.out.println("\n============================================");
		for (String student : students) {
			System.out.println(student);
		}
	}
}
