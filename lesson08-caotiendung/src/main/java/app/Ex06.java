package app;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap k: ");
		int k = sc.nextInt();
		
		String s = "";
		for (int i =0; i<= 100; i++) {
			s= s.concat(i+"");
			
		}
		System.out.println(s);
		System.out.println(s.charAt(k));
	}
}
