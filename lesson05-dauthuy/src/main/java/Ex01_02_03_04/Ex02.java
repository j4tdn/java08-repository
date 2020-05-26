package Ex01_02_03_04;

public class Ex02 {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 6};
		System.out.println(getMissingNumber(arr)); 
	}
	private static int getMissingNumber(int[] arr) {
		int missingNumber = 0;
		for (int j = 1; j <= 100; j++) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == j) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(arr[j]);
			}
		}

		return missingNumber;
	}
}
