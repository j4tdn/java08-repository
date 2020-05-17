package view;

import java.util.Scanner;

import Utils.YenNguaUtils;
import bean.YenNgua;

public class Bai3 {

	public static void main(String[] args) {


		YenNgua Yen = new YenNgua();
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap vao so hang");
		Yen.setHang(sc.nextInt());

		System.out.println("nhap vao so cot");
		Yen.setCot(sc.nextInt());

		int x = Yen.getHang();
		int y = Yen.getCot();
		int A[][] = new int[x][y];

		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++) {

				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				A[i][j] = sc.nextInt();
			}

		System.out.println("Ma trận A: ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		YenNguaUtils.yenngua(A, Yen);
	}
	
	
}
