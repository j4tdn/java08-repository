package bean;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuoi ky tu ");
		String s = scanner.nextLine();
		String[] s1=s.split("[\\s]+");
		for(int i=0;i<s1.length;i++) {
			upperCaseLowerCase(s1[i]);
		}
		
	}
	private static void upperCaseLowerCase(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.print(" ");

	}
}

