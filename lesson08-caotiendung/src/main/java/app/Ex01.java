package app;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// In ra mỗi kí tự trên một dòng
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') {
				System.out.println(c);
			}
		}
		
		System.out.println("=========================");
		//In ra mỗi từ trên một dòng 
		String[] words = str.trim().split("( )+");
		for (String w :words) {
			System.out.println(w);
		}
		
		System.out.println("========================="); 
		// Đảo ngược theo từ
		for (int i = words.length -1 ; i >= 0 ; i--) {
			System.out.println(words[i]);
		}
		
		System.out.println("========================="); 
		// Đảo ngược theo kí tự
		for (int i = str.length() -1 ; i >=0 ; i--) {
			char c = str.charAt(i);
			if (c != ' ') {
				System.out.println(c);
			}
		}
	}
}
