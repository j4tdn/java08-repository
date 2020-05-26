package view;

public class Ex01 {
	public static void main(String[] args) {
		int A[] = { 3, 15, 21, 0, 15, 17, 21 };
		getUniqueNumbers(A);
	}

	public static int[] getUniqueNumbers(int[] A) {
		sort(A);
		int temp = 1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j] && i != j)
					temp++;
			}
			if (temp == 1)
				System.out.print(A[i] + " ");
			temp = 1;
		}
		return A;
	}

	public static void sort(int a[]) {
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
}
