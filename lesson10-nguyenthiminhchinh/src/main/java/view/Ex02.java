package view;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		number0(matrix);
		print(matrix);

	}

	private static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	private static void out(int[][] numbers, int tempI, int tempJ) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (i == tempI || j == tempJ) {
					numbers[i][j] = 0;
				}
			}
		}
	}

	private static void number0(int[][] matrix) {
		int[] tmpI = new int[matrix.length];
		int[] tmpJ = new int[matrix[0].length];
		int ii = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					tmpI[ii] = i;
					tmpJ[ii++] = j;
				}
			}
		}
		for (int i = 0; i < ii; i++) {
			out(matrix, tmpI[i], tmpJ[i]);

		}

	}

}