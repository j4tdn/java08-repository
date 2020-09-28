

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 5, 1, 2, 3, 4, 3, 1 };

		findUniqueNumbers(numbers);
		compareAvg(numbers);
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(find3rdMax(numbers));
	}

	private static void findUniqueNumbers(int[] numbers) {
		List<Integer> numbersTemp = Arrays.stream(numbers)
										  .boxed()
										  .collect(Collectors.toList());
		
		System.out.println(numbersTemp.stream()
									  .filter(number -> Collections.frequency(numbersTemp, number) < 2)
									  .collect(Collectors.toList()));
	}

	private static double calAvgThefirst5elements(int[] numbers) {
		return Arrays.stream(Arrays.copyOfRange(numbers, 0, 5)).average().orElse(Integer.MIN_VALUE);
	}

	private static double calAvgThelast5elements(int[] numbers) {
		return Arrays.stream(Arrays.copyOfRange(numbers, numbers.length - 5, numbers.length)).average()
				.orElse(Integer.MIN_VALUE);
	}

	private static void compareAvg(int[] numbers) {
		if (numbers.length < 5) {
			System.out.println("mảng nhỏ hơn 5 phần tử !!!");
		} else {
			double theFirst5 = calAvgThefirst5elements(numbers);
			double theLast5 = calAvgThelast5elements(numbers);
			String result = theFirst5 > theLast5 ? ">" : theFirst5 < theLast5 ? "<" : "=";
			System.out.println("trung bình 5 phần tử đầu tiên " + result + " trung bình 5 phần tử cuối cùng");
		}
	}

	private static void insertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int x = numbers[i];
			int y = i;
			while (y > 0 && numbers[y - 1] > x) {
				numbers[y] = numbers[y - 1];
				y--;
			}
			numbers[y] = x;
		}
	}

	private static int find3rdMax(int[] numbers) {
		int[] tmp = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(tmp);
		return tmp[numbers.length - 3];
	}

}
