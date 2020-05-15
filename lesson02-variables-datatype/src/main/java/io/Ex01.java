package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter full name: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter math: ");
		float math = Float.parseFloat(ip.nextLine());

		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();

		System.out.println("full name: " + fullname);
		System.out.println("hobbies: " + hobbies);
		System.out.println("age: " + age);
		System.out.println("math: " + math);
		
	}

}
