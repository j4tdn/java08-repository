package Ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("Input string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		while (s.matches("[^A-Za-zÀ-ÿ '-]*") == true) {
			System.out.println("============");
			System.out.print("Require string,please input again: ");
			s = sc.nextLine();
		}

		// require02
		System.out.println("============");
		String[] listS01 = s.split(" ");
		String formatName = "";
		for (String c : listS01) {
			formatName = formatName + c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase() + " ";
		}
		System.out.println(formatName);
	}

}
