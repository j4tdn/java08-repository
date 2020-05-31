package ex03;

public class ViewEx03 {
	public static void main(String[] args) {
		draw(4);

	}

	private static int toHop(int n, int k) {
		if (k == 0 || k == n)
			return 1;
		return toHop(n - 1, k - 1) + toHop(n - 1, k);
	}

	private static void draw(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(toHop(i, j) + " ");
			}
			System.out.println("\n");
		}
	}
}
