

import java.util.Scanner;
import java.util.function.Consumer;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập chuỗi có dấu:");
		String s =sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		String[] tu = s.trim().split("[\\s]+");
		for (String string : tu) {
			System.out.print(string);
		}
		
		String reverse = new StringBuffer(s).reverse().toString();
	    System.out.println(reverse);
	    
	    for (int i = tu.length -1; i >= 0; i--) {
	    	System.out.print(tu[i] +"\t");
			
		}
	}

}
