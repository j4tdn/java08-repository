import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		printf(matrix);
		
		Set<Integer> rowIndexesSet = new HashSet<Integer>();
		Set<Integer> colIndexesSet = new HashSet<Integer>();
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					rowIndexesSet.add(row);
					colIndexesSet.add(col);
				}
			}
		}
		
		for (Integer rowIndex : rowIndexesSet) {
			Arrays.fill(matrix[rowIndex], 0);
		}
		for (Integer colIndex : colIndexesSet) {
			for (int row = 0; row < matrix.length; row++) {
				matrix[row][colIndex] = 0;
			}
		}
		printf(matrix);
	}

	private static void printf(int[][] matrix) {
		for (int[] numbers : matrix) {
			for (int number : numbers) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
