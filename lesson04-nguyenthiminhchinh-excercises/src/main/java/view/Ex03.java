package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = scanner.nextInt();

		int[][] a = new int[10][10];

		System.out.println("Tam giác pascal là: ");
		pascal(a, n);

	}

	public static void pascal(int[][] a, int n) {
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					a[i][j] = 1;
					System.out.print("\t" + a[i][j]);
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
					System.out.print("\t" + a[i][j]);
				}
			}
			System.out.println("\n");
		}
	}

}
