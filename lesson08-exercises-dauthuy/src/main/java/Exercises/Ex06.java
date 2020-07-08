package Exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap so K: ");
		int K = ip.nextInt();

		String s[] = new String[K + 1];

		for (int i = 1; i < s.length; i++) {
			s[i] = i + "";
		}

		System.out.println("K la: " + s[K]);
	}
}
