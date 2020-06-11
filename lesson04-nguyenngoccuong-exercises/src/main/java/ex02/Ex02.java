package ex02;

public class Ex02 {

	public static void main(String[] args) {
		int[] input = { 5, 1, 9, 5, 7, 3, 1, 651, 84, 49, 10, 84, 14, 84, 2, 15, 55, 35, 175 };
		int[] output = seperate(input);
		printArray(output);
	}

	public static int[] seperate(int[] array) {
		int temp;
		int first = 0;
		int last = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 7 == 0 && array[i] % 5 != 0) {
				temp = array[i];
				array[i] = array[first];
				array[first] = temp;
				first++;				
			}
			if (i == last) {
				break;
			}
			if (array[i] % 5 == 0 && array[i] % 7 != 0) {
				temp = array[i];
				array[i] = array[last];
				array[last] = temp;
				last--;				
			}
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
