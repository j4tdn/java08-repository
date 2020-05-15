package IO;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in); //nhap tu ban phim
		
		
		System.out.println("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter hobbies: ");
		float hobbies = Float.parseFloat(ip.nextLine());
		
		System.out.println("Enter math: ");
		float math = ip.nextFloat();

		
		System.out.println(" Age: " + age);
		System.out.println(" Math: " + math);
		System.out.println(" Fullname: " + fullname);
		System.out.println(" Hobbies: " + hobbies);
	}
}
