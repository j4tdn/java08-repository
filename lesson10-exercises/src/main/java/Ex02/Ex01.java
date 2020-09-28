package Ex02;

public class Ex01 {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 2, 3 }, { 1, 9, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		changeRow(matrix);
	}

	public static void changeRow(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int rowchange = 0;
		int colchange = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0) {
					rowchange = i;
					colchange = j;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == rowchange || j == colchange) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
