

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai1 {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 7, 3, 2, 4, 2, 8 };
		int[] numberout = KhongTrung(numbers);
		System.out.println("Mang cac phan tu khong trung: ");
		Arrays.stream(numberout).forEach(number -> System.out.print(number + "\t"));

		System.out.println("\n===================");
		trungBinh5(numbers);

		System.out.println("\n===================");
		InsertionSort(numbers);
		System.out.println("Insert sort:");
		Arrays.stream(numbers).forEach(number -> System.out.print(number + "\t"));
		
		System.out.println("\n===================");
		Max3(numbers);
		

	}

	private static int[] KhongTrung(int[] numbers) {
		int[] numbersout = new int[numbers.length];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (KTSoTrung(numbers, numbers[i], i)) {
				numbersout[count++] = numbers[i];

			}

		}
		return Arrays.copyOfRange(numbersout, 0, count);
	}

	private static boolean KTSoTrung(int[] numbers, int input, int tmp) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input && i != tmp) {
				return false;
			}
		}

		return true;
	}

	private static void trungBinh5(int[] numbers) {
		float first = 0;
		float last = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i < 5) {
				first += numbers[i];
			} else {
				last += numbers[i];
			}
		}
		first = first / 5;
		last = last / 5;
		if (first > last) {
			System.out.println("gia tri trung binh cua 5 phan tu truoc lon hon 5 phan tu sau");
		} else if (first == last) {
			System.out.println("gia tri trung binh cua 5 phan tu truoc bang 5 phan tu sau");
		} else {
			System.out.println("gia tri trung binh cua 5 phan tu truoc nho hon 5 phan tu sau");
		}
	}

	private static void InsertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (numbers[j] > numbers[i]) {
					
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}
	}
	private static void Max3(int[] numbers) {
		InsertionSort(numbers);
		System.out.println(numbers[numbers.length -3]);
	}
	
}
