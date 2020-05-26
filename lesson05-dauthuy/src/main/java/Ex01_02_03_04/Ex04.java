package Ex01_02_03_04;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 10, 21, 35 };
		int BCNN = getLeastCommonMultiple(arr);
		System.out.println("BCNN " + BCNN);
	}

	private static int getLeastCommonMultiple(int[] arr) {
		int arr1 = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = UCLN(arr[i], arr[i + 1]);
			arr1 = (arr[i] * arr[i + 1]) / temp;
			arr[i + 1] = arr1;
		}
		return arr1;
	}

	private static int UCLN(int a, int b) {
		int UCLN = a;
		while (UCLN > 1) {
			if (a % UCLN == 0 && b % UCLN == 0) {
				return UCLN;
			}
			UCLN--;
		}
		return 1;
	}
}
