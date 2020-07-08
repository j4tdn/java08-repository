package Exercises;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip =  new Scanner(System.in);
	public static void main(String[] args) {
		//String s = "Tháng mười một chiều thu tím";
		String s = "";
		do {
			System.out.println("Nhập chuỗi s: ");
			s = ip.nextLine();
			if (s == null || !isValid(s)) {
				System.out.println("Input again");
				continue;
			}
			break;
		}while(true);
		
		System.out.print("In mỗi kí tự trên một dòng: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + "  ");
		}
		System.out.println();
		
		System.out.println("\nIn mỗi từ trên một dòng: ");
		String words[] = s.split("[\\s]+");
		for (String word: words) {
			System.out.println(word);
		}
		
		System.out.print("\nChuỗi đảo ngược theo kí tự: ");
		for (int i = s.length() - 1; i >= 0 ; i--) {
			System.out.print(s.charAt(i) + "  ");
		}
		System.out.println();
		
		System.out.print("\nChuỗi đảo ngược theo từ: ");
		for (int i = words.length - 1; i >= 0 ; i--) {
			System.out.print(words[i] + "  ");
		}
	}
	
	public static boolean isValid(String s) {
		return s.matches("[\\p{L}\\s]{1,}");
	}
	
}
