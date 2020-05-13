package view;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int rows = 0;
		int columns = 0;
		do {
			try {
				System.out.print("Nhập số hàng: ");
				rows = Integer.parseInt(input.nextLine());
				if (rows <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Số hàng phải là số nguyên dương!");
			}
		} while (rows <= 0);

		do {
			try {
				System.out.print("Nhập số cột: ");
				columns = Integer.parseInt(input.nextLine());
				if (columns <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Số cột phải là số nguyên dương!");
			}
		} while (columns <= 0);

		int[][] inputArray = random2dArray(rows, columns);
		print2dArray(inputArray);
		saddlePoint(inputArray);

	}

	public static int[][] random2dArray(int rows, int columns) {
		int[][] inputArray = new int[rows][columns];
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				inputArray[i][j] = (int) (Math.random() * 99 + 1);
			}
		}
		return inputArray;
	}

	public static void print2dArray(int[][] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				System.out.format("%2d ", inputArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void saddlePoint(int[][] inputArray) {
		int rows = inputArray.length;
		int columns = inputArray[0].length;
		int i, j, k;
		for (i = 0; i < rows; i++) {
			int min = inputArray[i][0], col = 0;
			for (j = 1; j < columns; j++) {
				if (min > inputArray[i][j]) {
					min = inputArray[i][j];
					col = j;
				}
			}

			for (k = 0; k < rows; k++) {
				if (inputArray[k][col] > inputArray[i][col]) {
					break;
				}
			}

			if (k == rows) {
				System.out.println("Phần tử yên ngựa: [" + i + "," + col + "] = " + min);
				return;
			}

		}
		System.out.println("Không có phần tử yên ngựa");
	}
}
