package bean;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 3, 5 };
		insertC(a, 1, 4);
		// deleteC(a, 0);
		

	}

	public static void insertC(int[] a, int k, int c) {
		int[] b = new int[a.length + 1];
		if (k == 0) {
			b[0] = c;
			for (int i = 1; i < b.length; i++) {
				b[i] = a[i - 1];
			}
		} else {
			for (int i = 0; i < k; i++) {
				b[i] = a[i];
			}
			b[k] = c;
			for (int j = k + 1; j < b.length; j++) {
				b[j] = a[j - 1];
			}
		}
		xuatMang(b);
	}

	public static void deleteC(int[] a, int k) {
		int[] b = new int[a.length - 1];
		if (k == 0) {
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i + 1];
			}
		} else if (k == a.length - 1) {
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i];
			}
		} else {
			for (int i = 0; i < k; i++) {
				b[i] = a[i];
			}
			for(int j=k;j<b.length;j++) {
				b[j]=a[j+1];
			}
		}
		xuatMang(b);

	}
	public static void xuatMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
