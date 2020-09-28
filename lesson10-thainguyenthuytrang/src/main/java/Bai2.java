import java.util.Arrays;

public class Bai2 {
	public static void main(String[] args) {
		int[][] matran = { { 1, 2, 3, 4 }, { 0, 4, 5, 2 }, { 4, 0, 5, 1 }, { 4, 2, 5, 1 } };
		int[] row = new int[matran.length];
		int[] col = new int[matran[row.length - 1].length];

		System.out.println("Ma tran sau khi chuyen thanh 0:");
		doiSo0(matran, row, col);
		printf(matran);
	}

	private static int So0(int[][] matran, int[] row, int[] col) {
		int count = 0;
		for (int i = 0; i < matran.length; i++) {
			for (int j = 0; j < matran[i].length; j++) {
				if (matran[i][j] == 0) {
					row[count] = i;
					col[count] = j;
					count++;
				}
			}
		}

		return count;
	}

	private static void doiSo0(int[][] matran, int[] row, int[] col) {
		int count = 0;
		row = Arrays.copyOfRange(row, 0, So0(matran, row, col));
		col = Arrays.copyOfRange(col, 0, So0(matran, row, col));

		while (count < row.length) {

			for (int j = 0; j < matran[row[count]].length; j++) {
				matran[row[count]][j] = 0;
			}
			for (int i = 0; i < matran.length; i++) {
				matran[i][col[count]] = 0;
			}
			count++;
		}
	}

	private static void printf(int[][] matran) {
		for (int i = 0; i < matran.length; i++) {
			for (int j = 0; j < matran[i].length; j++) {
				System.out.print(matran[i][j] + " ");
			}
			System.out.println();
		}
	}
}
