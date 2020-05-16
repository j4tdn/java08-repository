package view;

public class Bai3 {
	public static void main(String[] args) {
		int[][] matrix = { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 } };

		checkYenNgua(matrix);
	}

	private static void checkYenNgua(int[][] matrix) {
		int vitriJ = 0;
		int min;
		int row = matrix.length;
		int col = matrix[0].length;

		for (int i = 0; i < row; i++) {
			min = matrix[i][0];
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					vitriJ = j;
				}
			}
			System.out.println("Min cua hang " + (i + 1) + " :" + min);
			for (int k = 0; k < row; k++) {
				if (min < matrix[k][vitriJ]) {
					System.out.println("Day khong phai phan tu yen ngua! ");

					break;
				}
				if (k == row - 1 && min >= matrix[k][vitriJ]) {
					System.out.println("Day la phan tu yen ngua");
				}
			}
		}

	}
}
