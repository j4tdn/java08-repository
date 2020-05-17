package view;

import java.util.Scanner;

import utils.SaddleUtils;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng: ");
		int row = sc.nextInt();
		System.out.print("Nhập số cột: ");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		SaddleUtils.importS(a);
		System.out.println();
		SaddleUtils.export(a);
		System.out.println();
		SaddleUtils.Saddle(a);
	}

}
