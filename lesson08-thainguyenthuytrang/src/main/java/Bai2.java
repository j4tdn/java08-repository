

import java.util.Scanner;

import com.sun.tools.javac.util.StringUtils;

public class Bai2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("nhập chuỗi có dấu:");
		String s =sc.nextLine();

		s = s.toLowerCase();
		String[] tu = s.trim().split("[\\s]+");
		String t = "";

		for (int i = 0; i < tu.length; i++) {

			t += Character.toUpperCase(tu[i].charAt(0)) + tu[i].substring(1) + " ";

		}
		System.out.print(t);

	}

}
