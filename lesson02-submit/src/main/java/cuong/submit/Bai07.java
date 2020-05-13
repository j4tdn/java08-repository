package cuong.submit;

import java.util.Random;

public class Bai07 {

	public static void main(String[] args) {

		int[] randomNumbers = generateUniqueRandomNumbers(20, 30, 5);
		if (randomNumbers.length == 0)
			System.out.println("The quantity exceeds the limit");
		else {
			for (int number : randomNumbers)
				System.out.print(number + " ");
		}
	}

	public static int[] generateUniqueRandomNumbers(int firstNumber, int lastNumber, int quantity) {
		if (quantity > lastNumber - firstNumber + 1) {
			return new int[] {};
		}
		Random rd = new Random();
		int[] randomNumbers = new int[quantity];
		int number = 0;
		boolean isExist = true;
		for (int i = 0; i < randomNumbers.length; i++) {
			while (isExist) {
				number = firstNumber + rd.nextInt(lastNumber - firstNumber + 1);
				isExist = false;
				for (int j = 0; j < i; j++) {
					if (randomNumbers[j] == number) {
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					randomNumbers[i] = number;
					break;
				}
			}
			isExist = true;
		}
		return randomNumbers;
	}
}
