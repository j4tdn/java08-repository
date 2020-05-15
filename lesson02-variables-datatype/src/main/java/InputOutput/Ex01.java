package InputOutput;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	
	System.out.println("Enter fullname");
	String fullname=ip.nextLine();
	System.out.println("Enter age");
	int age=Integer.parseInt(ip.nextLine());
	System.out.println("Enter math");
	float math=Float.parseFloat(ip.nextLine());
	System.out.println("Enter hobbies");
	String hobbies=ip.nextLine();
	
	System.out.println("full name ");
	System.out.println("age ");
	System.out.println("math ");
	System.out.println("hbbies ");
}
}
