package view;

public class Bai3 {
	public static void main(String[] args) {
		int[][] matrix = { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 } };

		System.out.println(isPhanTuYenNgua(matrix));
	}

	private static boolean isPhanTuYenNgua(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int indexOfMinArr = getIndexOfMinArray(matrix[i]);
			int baseNumber = matrix[i][indexOfMinArr];
			
			boolean isYenNgua = true;
			for (int j = 0; j < matrix.length; j++) {
				if (baseNumber < matrix[j][indexOfMinArr]) {
					isYenNgua = false;
				}
			}
			if(isYenNgua) {
				return true;
			}

		}
		return false;
	}

	private static int getIndexOfMinArray(int[] row) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < row.length; i++) {
			if (row[i] < min) {
				min = row[i];
				index = i;
			}
		}
		return index;
	}
}
