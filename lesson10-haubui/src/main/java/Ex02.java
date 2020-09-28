

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		int m = 7;
		int n = 9;
		int[][] numbers = new int[m][n];
		createData(numbers);
		printf(numbers);
		convertMatrix(numbers);
		System.out.println("\n");
		printf(numbers);
	}

	public static void printf(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void createData(int[][] numbers) {
		Random rd = new Random();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				numbers[i][j] = rd.nextInt(10);
			}
		}
	}

	public static void convertMatrix(int[][] numbers) {
		
		int[] row = new int[numbers.length];
		int[] col = new int[numbers[0].length];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				if (numbers[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				if (row[i] == 1 || col[j] == 1) {
					numbers[i][j] = 0;
				}
			}
		}
	}
}