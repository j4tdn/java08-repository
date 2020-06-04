package Ex02;

public class Ex02 {

	public static void main(String[] args) {
		int arr[] = { 3, 55, 20, 8, 14, 15, 15, 15, 42, 35, 55 };
		System.out.println("\nMang ban dau: ");
		outputArr(arr);

		int arr2[] = new int[arr.length];
		int count = 0;
		int n2 = arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				arr2[count] = arr[i];
				count++;
			} else if (arr[i] % 7 != 0 && arr[i] % 5 == 0) {
				arr2[n2 - 1] = arr[i];
				n2--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (Exited(arr2, arr[i])) {
				continue;
			}
			arr2[count] = arr[i];
			count++;
		}
		System.out.println("\nMang sau khi xu ly: ");
		outputArr(arr2);

	}

	public static void outputArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}

	public static boolean Exited(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}
}
