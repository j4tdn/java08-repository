import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 3, 3, 1, 7, 9 };

		insertionSort(numbers);
		 compare(numbers);
//		
//		thirdMax(numbers);
//		distinct(numbers);
	}

	public static void distinct(int[] array) {
		int[] result = new int[array.length];
		int count = 0;
		boolean isDup = false;
		for (int i = 0; i < array.length; i++) {
			isDup = false;
			for (int j = 0; j < array.length; j++) {
				if (j != i && array[i] == array[j]) {
					isDup = true;
					break;
				}
			}
			if (isDup == false)
				result[count++] = array[i];
		}

		Arrays.stream(array).forEach(x -> System.out.println(x));

	}

	private static void compare(int[] array) {
		int firstElements = 0;
		int lastElements = 0;
		for (int i = 0; i < array.length; i++) {
			if (i < 5) {
				firstElements += array[i];
			} else {
				lastElements += array[i];
			}
		}
		
		if (firstElements > lastElements) {
			System.out.println("5 phan tu truoc lon hon");
		} else if (firstElements < lastElements) {
			System.out.println("5 phan tu truoc be hon");

		} else {
			System.out.println("Bang nhau");
		}

	}

	private static void insertionSort(int[] arr) {
		int key, j;
		for (int i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		Arrays.stream(arr).forEach(x -> System.out.println(x));


	}

	private static void thirdMax(int[] array) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max1) {
				max3 = max2;
				max2 = max1;
				max1 = array[i];

			}
		}

		System.out.println(max3);
	}
}
