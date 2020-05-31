package bean;

public class Ex03 {
	public static void main(String[] args) {
		in(4);
	}

	private static void in(int n) {
		int a[][] = new int[n + 1][n + 2];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i + 1; j++) {
				if (j == 0 || j == i + 1) {
					a[i][j] = 1;
				}
				if (i > 0 && j > 0) {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
