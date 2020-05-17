package Utils;

import java.util.Scanner;

import bean.YenNgua;

public class YenNguaUtils {

	public static int minhang(int A[][], int n, YenNgua y) {
		int minH = 100;
		for (int j = 0; j < y.getCot(); j++) {
			minH = min(minH, A[n][j]);
		}
		return minH;
	}

	public static int maxCot(int A[][], int m, YenNgua x) {
		int maxC = 0;
		for (int j = 0; j < x.getHang(); j++) {
			maxC = max(maxC, A[j][m]);
		}
		return maxC;
	}

	public static int max(int a, int b) {
		return (a < b) ? b : a;
	}

	public static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	public static void yenngua(int A[][], YenNgua yen) {
		for (int i = 0; i < yen.getHang(); i++) {
			for (int j = 0; j < yen.getCot(); j++)
				if (minhang(A, i, yen) == maxCot(A, j, yen)) {
					System.out.println("phan tu yen ngua:" + A[i][j]);
					return;
				}
		}
		System.out.println("khong co phan tu yen ngua");
	}
}
