package view;

public class Ex02 {

	public static void main(String[] args) {
		int[] a = { 21, 5, 7, 11, 14, 9, 21, 10, 5, 77 };
		div75(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

	private static int[] div75(int[] a) {
		int[] atmp = new int[a.length];
		int[] atmp7 = new int[a.length];
		int[] atmp5 = new int[a.length];

		int tmp7 = 0;
		int tmp5 = 0;
		int tmp = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 7 == 0 && a[i] % 5 != 0) {
				atmp7[tmp7] = a[i];
				tmp7++;
			}

			if ((a[i] % 7 == 0 && a[i] % 5 == 0) || (a[i] % 7 != 0 && a[i] % 5 != 0)) {
				atmp[tmp] = a[i];
				tmp++;
			}

			if (a[i] % 5 == 0 && a[i] % 7 != 0) {
				atmp5[tmp5] = a[i];
				tmp5++;
			}
		}

		for (int i = 0; i < tmp7 + tmp + tmp5; i++) {
			if (i < tmp7)
				a[i] = atmp7[i];
			if ((i >= tmp7 && i < (tmp7 + tmp)))
				a[i] = atmp[i - tmp7];
			if (i >= (tmp7 + tmp))
				a[i] = atmp5[i - tmp7 - tmp];
		}
		return a;

	}
}
