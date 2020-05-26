package View;

public class Bai2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		int n = 6;
		System.out.println("mang thieu so:" +getMissingNumber(a, n));
	}

	public static int getMissingNumber(int a[], int n) {
		int b = 0;
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			tong += a[i];
		}
		b = sum(n) - tong;
		return b;
	}

	public static int sum(int n) {
		if (n == 1)
			return 1;
		return sum(n - 1) + n;
	}
}
