package haubui.Lesson03_haubui.ex03.view;

import java.util.Random;
import java.util.Scanner;

public class Ex03Demo {
	private static Scanner sc;

	private static int[][] create(int m, int n) {
		Random rd = new Random();
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = rd.nextInt(99) + 1;
			}
		}
		return matrix;
	}

	private static int findMaxValueInColumn(int[][] matrix, int curColIndex) {
		int maxColumn = matrix[0][curColIndex];
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][curColIndex] > maxColumn) {
				maxColumn = matrix[i][curColIndex];
			}
		}
		return maxColumn;

	}

	private static int findMinValueInRow(int[][] matrix, int curRowIndex) {
		int minRow = matrix[curRowIndex][0];
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[curRowIndex][j] < minRow) {
				minRow = matrix[curRowIndex][j];
			}
		}
		return minRow;
	}

	public static void findSaddlePoint(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == findMinValueInRow(matrix, i) && matrix[i][j] == findMaxValueInColumn(matrix, j)) {
					System.out.println("A[" + i + "][" + j + "] = " + matrix[i][j] + " Là phần tử yên ngựa");
				}
			}
		}
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print("A[" + i + "][" + j + "] = " + matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Nhập số hàng: ");
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số cột: ");
		int n = Integer.parseInt(sc.nextLine());
		int[][] A = create(m, n);
		print(A);
		findSaddlePoint(A);
	}
}
