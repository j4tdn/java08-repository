package Ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		String listNumber = "";

		System.out.print("Input K: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		while (!isNumeric(s)) {
			System.out.println("============");
			System.out.print("Require int,please input again: ");
			s = sc.nextLine();
		}
		for (int i = 1; i <= 100; i++) {
			listNumber = listNumber + String.valueOf(i);
		}
		int k = Integer.parseInt(s);
		if (k <= listNumber.length()) {
			System.out.println(listNumber.charAt(k));
		}

	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
