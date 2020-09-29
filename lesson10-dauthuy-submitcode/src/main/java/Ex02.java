
public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 7, 6, 1 }, { 9, 6, 6, 0 }, { 1, 7, 3, 8 }, { 5, 2, 1, 2 }, { 7, 3, 8, 4 } };
		display(matrix);
		int[][] converMatrix= convertMatrix(matrix);
		display(converMatrix);

	}
	
	private static void display(int[][] matrix) {
		System.out.println();
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + "  ");
			}
			
			System.out.println();
		}
	}
	
	private static int[][] convertMatrix(int[][] matrix) {
		int rowIndex = 0;
		int colIndex = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					rowIndex = row;
					colIndex = col;
					break;
				}

			}
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if ( row == rowIndex || col == colIndex) {
					matrix[row][col] = 0;
				}
			}
		}
		
		return matrix;
	}
}
