package cuong.submit;

public class Bai04 {
	public static void main(String[] args) {
		int[] numbers = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		Bai01.sort(numbers);
		int index = indexOf2ndLargestOddNumber(numbers);
		System.out.println(index != -1 ? numbers[index] : "Not found");
	}

	public static int indexOf2ndLargestOddNumber(int[] numbers) {
		boolean isFoundLON = false;
		int largestOddNumnber = numbers[numbers.length - 1];
		for (int i = numbers.length - 1; i > 0; i--) {
			if (numbers[i] % 2 != 0) {
				if (isFoundLON) {
					if (numbers[i] != largestOddNumnber) {
						return i;
					}
				} else {
					isFoundLON = true;
					largestOddNumnber = numbers[i];
				}
			}
		}
		return -1;
	}

}
