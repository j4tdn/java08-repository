package bean;

public class Bai1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 3, 4 };
		int b[] = new int[a.length];
		b=getUniqueNumbers1(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);		
		}
		
	}

	private static int getUniqueNumbers(int a[], int b) {
		int c = 0;
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b)
				dem = dem + 1;
			if (dem <= 1) {
				c = a[i];
			}
		}

		return c;
	}

	private static int[] getUniqueNumbers1(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = getUniqueNumbers(a, a[i]);
		}
		return b;
	}

}
