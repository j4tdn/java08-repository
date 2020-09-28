package bean;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = { 18, 2, 14, 7, 6, 4, 41, 7, 26, 4 };
		// compareValuesAvg(a);
		// insert_Sort(a);
		// 3rdLargestNumber(a);
		// removeTheSameNumber(a);
	}

	public static void xuatMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

	public static void removeTheSameNumber(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					a[j] = a[n - 1];
					n--;
					j--;
				}
			}
		}
		int[] b = Arrays.copyOf(a, n);
		xuatMang(b);
	}

	public static void  compareValuesAvg(int[] a) {
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i <= 4; i++) {
			sum1 += a[i];
		}
		sum1 /= 5.0;
		for (int i = 5; i < a.length; i++) {
			sum2 += a[i];
		}
		sum2 /= 5.0;
		if (sum1 - sum2 == 0) {
			System.out.println("gia tri trung binh cua 5 phan tu dau va cuoi bang nhau");
		}
		if (sum1 - sum2 < 0) {
			System.out.println("gia tri trung binh cua 5 phan tu dau nho hon gia tri trung binh 5 phan tu cuoi");
		}
		if (sum1 - sum2 > 0) {
			System.out.println("gia tri trung binh cua 5 phan tu dau lon hon gia tri trung binh 5 phan tu cuoi");
		}
	}

	public static void insert_Sort(int[] a) {
		for (int i = 1; i <= a.length - 1; i++) {
			int x = a[i];
			int y = i;
			while (y > 0 && a[y - 1] > x) {
				a[y] = a[y - 1];
				y--;
			}
			a[y] = x;
		}
		xuatMang(a);
	}

	public static void thirdLargestNumber(int[] a) {
		insert_Sort(a);
		System.out.println("so lon thu 3 la " + a[a.length - 3]);
	}
}
