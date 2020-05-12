package com.haubui.io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fullname: ");
		String fullname = sc.nextLine();
		System.out.println("Enter hobbies: ");
		String hobbies = sc.nextLine();
		System.out.println("Enter age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter math: ");
		float math = Float.parseFloat(sc.nextLine());
		System.out.println(fullname + " - " + hobbies + " - " + age + " - " + math);
	}

}
