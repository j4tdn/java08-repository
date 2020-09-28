package Ex01;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] arrayNumbers = { 1, 2, 3, 4, 3, 1 };
		int[] newArray = delRepeatNumber(arrayNumbers);

		Arrays.stream(newArray).forEach(value -> System.out.print(value + " "));
	}

	public static int[] delRepeatNumber(int[] array) {
		int[] changeArray = new int[array.length];
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (checkExist(array[i], array)) {
				changeArray[index] = array[i];
				index++;
			}
		}
		
		return Arrays.copyOfRange(changeArray, 0, index);
	}

	public static boolean checkExist(int number, int[] array) {
		int time = 0;
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				time++;
			}
		}

		return time < 2;
	}

}
