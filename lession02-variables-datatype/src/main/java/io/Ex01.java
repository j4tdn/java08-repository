package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		
		System.out.print("Enter hobbies: ");
		String fullName = ip.nextLine();
		
		System.out.print("Enter Age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter Math: ");
		float math = Float.parseFloat(ip.nextLine());
		
		System.out.println("FullName: "+fullName);
		System.out.println("Age: "+age);
		System.out.println("math: "+math);

	}

}
