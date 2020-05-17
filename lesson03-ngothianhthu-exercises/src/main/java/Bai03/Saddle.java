package Bai03;

import java.util.Scanner;

public class Saddle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập kích thước mảng A: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int A[][] = new int[m][n];
		int min[]=new int[m];
		int max[]=new int[n];

		System.out.println("Nhập các phần tử trong mảng A: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("Mảng A: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "    ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < m; i++) {
			int minEx = A[i][0];
			for (int j = 1; j < n; j++) {
				if (minEx >  A[i][j]) {
					minEx = A[i][j];
				}
			}
			min[i] = minEx;
		}

		for (int i = 0; i < n; i++) {
			int maxEx = A[0][i];
			for (int j = 1; j < m; j++) {
				if (maxEx <  A[i][j]) {
					maxEx = A[i][j];
				}
			}
			max[i] = maxEx;
		}

		for (int i = 0; i < m; i++) {
			int minEx1 = min[i];
			for (int j = 0; j < n; j++) {
				int maxEx1 = max[j];
				if (A[i][j] <= minEx1 && A[i][j] >= maxEx1) {
					System.out.println("Điểm yên ngựa trong mảng A:" + A[i][j]);	
				}
			}
		}
	}
}
