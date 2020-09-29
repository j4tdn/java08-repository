import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1, 1, 1 };
//		int[] addElement = addElement(arr, 3, 3);
//		Arrays.stream(addElement).forEach(n -> System.out.print(n + " "));

		System.out.println("\n-----");
		int[] deleteElement = deleteElement(arr, 3);
		Arrays.stream(deleteElement).forEach(n -> System.out.print(n + " "));
	}

	private static int[] addElement(int[] arr, int index, int value) {
		int[] result = new int[arr.length + 1];

		for (int i = 0; i < result.length; i++) {
			if (i < index) {
				result[i] = arr[i];
			} else if (i == index) {
				result[i] = value;
			} else {
				result[i] = arr[i - 1];
			}
		}

		return result;
	}

	private static int[] deleteElement(int[] arr, int index) {
		int[] result = new int[arr.length - 1];

		for (int i = 0; i < result.length; i++) {
			if (i < index) {
				result[i] = arr[i];
			} else {
				result[i] = arr[i + 1];
			}
		}

		return result;
	}
}
