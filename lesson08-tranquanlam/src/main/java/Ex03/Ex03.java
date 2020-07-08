package Ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.print("Input string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		while (s.matches("[^A-Za-zÀ-ÿ '-]*") == true) {
			System.out.println("============");
			System.out.print("Require string,please input again: ");
			s = sc.nextLine();
		}
		
		System.out.println(Normalizer
				.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", ""));
	}
}
