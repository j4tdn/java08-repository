package ex02;

public class Ex02 {
	public int[] divisorbyN(int[] a, int n) {
		int j = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 7 != 0) && (a[i] % 5 != 0)) {
				count++;
			}
		}
		int[] b = new int[count];

		for (int i = 0; i < a.length; i++) {
			if (divisor(a[i], n) == true) {
				b[j] = a[i];
				j++;
			}
		}
		return b;
	}

	public boolean divisor(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	public void outPut(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public int[] BuocFinal(int[] a, int[] b, int[] c) {
		int[] d = new int[a.length + b.length + c.length];
		int i = 0;
		do {
			d[i] = a[i];
			i++;
		} while (i<a.length);
		// i=3
		int j = 0;
		do {
			d[i] = b[j];
			i++;
			if (j < b.length) {
				j++;
			}
		} while (j <b.length);
		int y = 0;
		do {
			d[i] = c[y];
			y++;
			i++;
		} while (y<c.length);
		return d;

	}

	public int[] divisorby5and7(int a[]) {

		int j = -1;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 7 != 0) && (a[i] % 5 != 0)) {
				count++;
			}
		}
		int[] z = new int[count];
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 7 != 0) && (a[i] % 5 != 0)) {
				z[++j] = a[i];
			}
		}

		return z;
	}

	public static void main(String[] args) {
		int[] a = { 14, 7, 21, 5, 10, 15, 45, 3, 4, 8, 6 };
		Ex02 item = new Ex02();
		int[] b = item.divisorbyN(a, 7);
		int[] c = item.divisorbyN(a, 5);
		item.outPut(b);
		System.out.println();
		item.outPut(c);
		System.out.println();
		int[] d = item.divisorby5and7(a);
		item.outPut(d);
		System.out.println();
		int[] e = item.BuocFinal(b, d, c);
		item.outPut(e);
	}
}
