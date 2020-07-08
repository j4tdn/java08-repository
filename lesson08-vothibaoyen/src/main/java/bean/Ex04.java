package bean;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {

		int n = 12, m = 18;
		int[] k = isSoNguyenToTuongDuong(n);
		int[] h = isSoNguyenToTuongDuong(m);
		Arrays.sort(k);
		Arrays.sort(h);

		int[] l = demsophantu0(k);

		int[] p = demsophantu0(h);

		if (l.length == p.length) {
			int dem = 0;
			for (int i = 0; i < l.length; i++) {
				if (l[i] != p[i]) {
					System.out.println("No");
					break;
				} else {
					dem++;
				}
			}
			if (dem == l.length) {
				System.out.println("Yes");
			}
		}
		else {
			System.out.println("No");
		}

	}

	private static boolean isSoNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		int count = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;

	}

	private static int[] isSoNguyenToTuongDuong(int n) {
		int[] s = new int[n];
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && isSoNguyenTo(i)) {
				s[i] = i;
			}
		}
		return s;
	}

	private static int[] demsophantu0(int[] a) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				dem++;
			}
		}
		return Arrays.copyOfRange(a, dem++, a.length);

	}
}
