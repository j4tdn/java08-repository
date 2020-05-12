package operator;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter hobbies");
		String hobbies = ip.nextLine();

		System.out.print("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());

		System.out.print("Enter math");
		float math = Float.parseFloat(ip.nextLine());

		System.out.println(a);
		System.out.println(math);
		System.out.println(hobbies);
	}
	
}
