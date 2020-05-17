package ex03;

import java.util.Random;
import java.util.Scanner;

public class FindYenNguaElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so hang: ");
		int row = sc.nextInt();

		System.out.println("Nhap so cot: ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Mang cac phan tu trong mang: ");
		createArr(arr, row, col);

		yenNguaElement(arr, row, col);
	}

	public static void createArr(int arr[][], int row, int col) {
		Random rd = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = 1 + rd.nextInt(99);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int minRow(int arr[][], int rowNeedCheck, int col) {
		int min = arr[rowNeedCheck][0];
		for (int i = 1; i < col; i++) {
			if (min > arr[rowNeedCheck][i]) {
				min = arr[rowNeedCheck][i];
			}
		}
		return min;
	}

	public static int maxCol(int arr[][], int row, int colNeedCheck) {
		int max = arr[0][colNeedCheck];
		for (int i = 1; i < row; i++) {
			if (max < arr[i][colNeedCheck]) {
				max = arr[i][colNeedCheck];
			}
		}
		return max;
	}

	public static void yenNguaElement(int arr[][], int row, int col) {
		int yenNgua = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if ((arr[i][j] == minRow(arr, i, col)) && (arr[i][j] == maxCol(arr, row, j))) {
					yenNgua = arr[i][j];
				}
			}
		}
		if (yenNgua == 0) {
			System.out.println("Khong ton tai phan tu yen ngua");
		}
		else {
			System.out.println("Phan tu yen ngua la: " + yenNgua);

		}
	}
}

