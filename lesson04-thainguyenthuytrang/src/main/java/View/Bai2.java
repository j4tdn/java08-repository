package View;

public class Bai2 {
	public static void main(String[] args) {
		int[] a = { 25,7, 6, 56, 49, 35, 70, 50, 14, 20, 21, 5,3 };

		sapxep(a);
		for (int i : a) {
			System.out.print(i + "\t");
		}

	}

	public static void sapxep(int[] a) {
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] % 7 == 0 && a[i] % 5 != 0) {
					swapArray(a, i, j);
				}
				
				if (a[j] % 7 != 0 && a[j] % 5 == 0) {
					swapArray(a, j, i);
				}

			}

		}

	}

	public static void swapArray(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
