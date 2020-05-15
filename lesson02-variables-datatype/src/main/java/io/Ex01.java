package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Fullname");
		String fullname= sc.nextLine(); //nhap chuoi
		System.out.println("Enter Math");
		float math= Float.parseFloat(sc.nextLine());
		System.out.println("Enter Hobbies");
		String hobbi= sc.nextLine(); //nhap chuoi, bi troi lenh khi phia truoc Nextline() cos ton tai phimm enter
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println(fullname+"\t"+hobbi+"\t"+age+"\t"+math);
		
		/*nhap chuoi, bi troi lenh khi phia truoc Nextline() cos ton tai phimm enter
		 * xu li
		 * 
		 * 
		 */
	}

}
