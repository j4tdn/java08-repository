
public class Ex04 {

	public static void main(String[] args) {
		int[] numbers = { 6, 8, 2, 8, 1, -15, -14, 2, 651, -150, 165, 0 };

		numbers = addNumber(numbers, 1, 500);
		if (numbers!= null) {
			printf(numbers);
		} else {
			System.out.println("Index out of bounds");
		}
		
		numbers = removeNumber(numbers, 11);
		if (numbers!= null) {
			printf(numbers);
		} else {
			System.out.println("Index out of bounds");
		}

	}

	public static int[] addNumber(int numbers[], int k, int number) {
		if (k < 0 || k > numbers.length) {
			return null;
		}
		int newNumbers[] = new int[numbers.length + 1];

		for (int i = 0; i < k; i++) {
			newNumbers[i] = numbers[i];
		}
		newNumbers[k] = number;
		for (int i = k + 1; i < newNumbers.length; i++) {
			newNumbers[i] = numbers[i - 1];
		}
		return newNumbers;
	}
	
	public static int[] removeNumber(int numbers[], int k) {
		if (k < 0 || k >= numbers.length) {
			return null;
		}
		int newNumbers[] = new int[numbers.length - 1];

		for (int i = 0; i < k; i++) {
			newNumbers[i] = numbers[i];
		}
		for (int i = k; i < newNumbers.length; i++) {
			newNumbers[i] = numbers[i + 1];
		}
		return newNumbers;
	}

	private static void printf(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
