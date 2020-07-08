package Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.print("Input string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("============");
		while (s.matches("[^A-Za-zÀ-ÿ '-]*") == true) {
			System.out.print("Input string again: ");
			s = sc.nextLine();
		}
		//require01
		String[] listS00 = s.split("");
		for (String c : listS00) {
			System.out.println(c);
		}
		//require02
		System.out.println("============");
		String[] listS01 = s.split(" ");
		for (String c : listS01) {
			System.out.println(c);
		}
		//require03
		System.out.println("============");
		String reserve = new StringBuffer(s).reverse().toString();
		System.out.println(reserve);
	}

}
