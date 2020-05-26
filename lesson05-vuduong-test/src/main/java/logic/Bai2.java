package logic;


public class Bai2 {
	private static int MAX_VALUE = 100;

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 2, 6 };
		System.out.println(getMissingNumber(a));
	}

	private static int getMissingNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i + 1) {
				return i + 1;
			}
		}
		return MAX_VALUE;
	}
}
