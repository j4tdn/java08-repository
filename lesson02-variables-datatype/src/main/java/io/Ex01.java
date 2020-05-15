package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter full name :");
		String c = ip.nextLine();
		
		System.out.print("Enter age : " );
		int a = Integer.parseInt(ip.nextLine());
//		ip.nextLine(); //luu enter tai day
		
		System.out.print("Enter math : ");
		float b = Float.parseFloat(ip.nextLine());
		
		System.out.print("Enter Hobbies :");
		String d = ip.nextLine();
		
		System.out.println("FullName :" + c);
		System.out.println("Age :" + a);
		System.out.println("Math :" + b);
		System.out.println("Hobbies :" + d);
	}

}
