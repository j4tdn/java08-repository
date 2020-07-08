

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai4 {

	public static void main(String[] args) {
		int n = 75;
		int m = 15;
		int[] a = new int[n];
		int[] b = new int[m];
		
		NTTD(a, b, n, m);
	}

	public static boolean SoNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void NTTD(int[] a, int[] b, int n, int m) {

		int count = 0;
		int t = 0;
		for (int i = 2; i < m; i++) {			
			if (Math.pow(n, i) == m) {
				System.out.println("YES");
				break;
			}
			if (n % i == 0 && SoNguyenTo(i)) {
				a[count] = i;
				count++;
			}
			if (m % i == 0 && SoNguyenTo(i)) {
				b[t] = i;
				t++;
			}
		}

		t = (t > count) ? t : count;
		for (int i = 0; i < t; i++) {
			if (a[i] != b[i]) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}
}
