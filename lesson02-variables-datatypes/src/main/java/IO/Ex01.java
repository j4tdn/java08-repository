package IO;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.println("Enter age : ");
		int age = ip.nextInt();
		
		System.out.println("Enter Math : ");
		float math = ip.nextFloat();
		// 1 cách : ip.nextLine();
		// cách 2 : 
		System.out.println("Enter hobbies: ");
		//String hobbies = ip.nextLine();
		String s = new Scanner(System.in).nextLine();
		System.out.println(age);
		System.out.println(math);
		System.out.println(fullname);
		System.out.println(s);
		
		
		
		
	}

}
