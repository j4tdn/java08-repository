package view;

public class Ex022 {
	public static void main(String[] args) {
		int[] a = { 1, 42,70, 21, 5, 7, 11, 14, 9, 21, 10, 5, 35, 28 };
		div75(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

	private static int[] div75(int[] a) {
		int tmp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] % 7 == 0 && a[j] % 5 != 0) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				if (a[j] % 5 == 0 && a[j] % 7 != 0) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		return a;
	}
}
