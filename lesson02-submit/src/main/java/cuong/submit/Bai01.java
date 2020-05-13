package cuong.submit;

public class Bai01 {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 8 };
		sort(arr);
		for (int number : arr) {
			System.out.print(number + " ");
		}
	}

	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
				}
			}
		}
	}
}
