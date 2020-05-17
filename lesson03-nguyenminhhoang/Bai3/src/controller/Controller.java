package controller;

import java.util.Scanner;

public class Controller {
	public int m = 0, n = 0;

	public int[][] taoMang() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap vao ma tran can xet \n n=");
		n = Integer.parseInt(nhap.nextLine());
		System.out.println("nhap m");
		m = Integer.parseInt(nhap.nextLine());
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("a[" + i + "]" + "[" + j + "]");
				a[i][j] = Integer.parseInt(nhap.nextLine());

			}
		}
		return a;
	}

	public void yenNgua(int[][] a) {
		int minN = 0;
		int maxM = 0;
		int u = 0, v = 0;
		for (int i = 0; i < n; i++) {
			minN = a[i][0];
			for (int j = 0; j < m; j++)
				if (minN > a[i][j]) {
					minN = a[i][j];
					u = j;
				}
			for (int k = 0; k < n; k++) {
				if (maxM < a[k][u]) {
					maxM = a[k][u];
					v = k;
				}
			}
			if (minN == maxM && u == v) {
				System.out.println("ma tran da cho co phan tu yen ngua  : " + a[v][u]);
			}

		}

	}
}
