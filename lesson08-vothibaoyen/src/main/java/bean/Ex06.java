package bean;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		String s = "1238283283293232343256574765658685";
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println("So năm ơ vi tri "+k+" trong day la: "+numberOfIndexK(s, k));

	}

	private static char numberOfIndexK(String s,int k) {		
		return s.charAt(k);
	}
}