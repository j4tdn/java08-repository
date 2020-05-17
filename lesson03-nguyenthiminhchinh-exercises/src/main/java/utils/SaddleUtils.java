package utils;

import java.util.Random;

public class SaddleUtils {
	Random rand = new Random();

	public static void Saddle(int a[][]) {

		int count = 0;
		int minRow[] = new int[10];
		int maxCol[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			minRow[i] = a[i][0];
			for (int j = 0; j < a[0].length; j++) {
				if (minRow[i] > a[i][j]) {
					minRow[i] = a[i][j];
				}
			}
		}

		for (int j = 0; j < a[0].length; j++) {
			maxCol[j] = a[0][j];
			for (int i = 0; i < a.length; i++) {
				if (maxCol[j] < a[i][j]) {
					maxCol[j] = a[i][j];
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if ((a[i][j] == minRow[i]) && (a[i][j] == maxCol[j])) {
					// System.out.println("Phần tử yên ngựa: " + a[i][j]);
					count++;
				}
			}
		}
		if (count > 0)
			System.out.println("Có phần tử yên ngựa");
		else
			System.out.println("Không có phần tử yên ngựa");

	}

	public static void importS(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = rand.nextInt(99) + 1;
			}
	}

	public static void export(int[][] a) {
		System.out.println("Ma trận: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
	}

}
