package Bai3;

import java.util.Scanner;

public class Demo {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		inputArr();
		
	}
	public static void inputArr() {
			
		System.out.println("Nhap vao  gia tri m cua mang : ");
		
		int m1 = sc.nextInt();
		
		System.out.println("Nhap vao gia tri n cua mang : ");
		
		int n1 = sc.nextInt();
		
		DuoiNgua phd = new DuoiNgua(m1,n1);
		
		phd.input();
		phd.output();
		phd.check();
		
		
	}

}
