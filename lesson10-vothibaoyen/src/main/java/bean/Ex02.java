package bean;

public class Ex02 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4, }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		System.out.println("Ma tran A: ");
		xuatMaTran(a);
		System.out.println("Ma tran A sau khi chuyen doi: ");
		chuyenMaTran(a);
	}

	public static void xuatMaTran(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void chuyenMaTran(int[][] a) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[i][j] = a[i][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {

				if (a[i][j] == 0) {
					for (int k = 0; k < a[0].length; k++) {
						b[i][k] = 0;
					}
					for (int h = 0; h < a.length; h++) {
						b[h][j] = 0;						
					}

				}

			}
		}
		xuatMaTran(b);
	}
}
