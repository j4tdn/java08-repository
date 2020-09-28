
public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 0, 2, 3 }, { 4, 5, 6 }, { 2, 0, 3 }, { 5, 2, 5 } };
		output(matrix);
		System.out.println("===================");
		convert(matrix, 3);
		output(matrix);

	}

	private static void output(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

//	
	public static void convert(int[][] maxtrix, int n) {
		int lengthRow = maxtrix.length;
		int lengthCol = maxtrix[0].length;
		int[] row = new int[lengthRow];
		int[] col = new int[lengthCol];

		for (int i = 0; i < lengthRow; i++) {
			for (int j = 0; j < lengthCol; j++) {
				if (maxtrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < lengthRow; i++) {
			for (int j = 0; j < lengthCol; j++) {
				if (row[i] == 1 || col[j] == 1) {
					maxtrix[i][j] = 0;
				}
			}
		}
	}

}


