package view;

import java.util.Random;
import java.util.Scanner;

import utils.YenNguaUtils;

public class YenNgua {
	

	public static void main(String[] args) {
		YenNguaUtils y1=new YenNguaUtils();
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Nhap so hang: ");
		int row = input.nextInt();
		System.out.print("Nhap so cot: ");
		int colum = input.nextInt();
		int arr[][] = new int[row][colum];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colum; j++) {
				arr[i][j] = rd.nextInt(99)+1;
			}
		}
		
		System.out.println();
		y1.Show(arr);
		System.out.println();
		y1.ktYenNgua(arr);
	}


}
