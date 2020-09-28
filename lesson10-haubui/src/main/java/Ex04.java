import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(insert(numbers, 8, 3)));
		System.out.println(Arrays.toString(remove(numbers, 8)));
	}

	private static int[] insert(int[] numbers, int index, int number) {

		if (index < 0 || index > numbers.length - 1) {
			System.out.println("Invalid index!!!");
			return numbers;
		} else if (index == numbers.length - 1) {
			int[] result = Arrays.copyOf(numbers, numbers.length + 1);
			result[result.length - 1] = number;
			return result;
		} else {

			int[] result = new int[numbers.length + 1];
			int j = 0;

			for (int i = 0; i < result.length; i++) {
				if (i == index) {
					result[i] = number;
				} else {
					result[i] = numbers[j];
					j++;
				}
			}

			return result;
		}
	}

	private static int[] remove(int[] numbers, int index) {

		if (index < 0 || index > numbers.length - 1) {
			System.out.println("Invalid index!!!");
			return numbers;
		} else if (index == numbers.length - 1) {
			return Arrays.copyOf(numbers, numbers.length - 1);
		} else {

			int[] result = new int[numbers.length - 1];
			int j = numbers.length - 1;
			for (int i = result.length - 1; i >= 0; i--) {
				if (i == index) {

					result[i] = numbers[j--];
				} else {
					result[i] = numbers[j];
				}
				j--;
			}

			return result;
		}
	}
}
