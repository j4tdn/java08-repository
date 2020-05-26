package view;

public class Ex02 {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 7 };
		getMissingNumber(A);
	}

	public static int getMissingNumber(int[] A) {
		int temp = 1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == temp)
				temp++;
			else
				System.out.println(temp);

		}
		return 1;

	}
}
