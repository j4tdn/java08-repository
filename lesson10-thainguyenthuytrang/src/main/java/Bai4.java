import java.util.Arrays;
import java.util.Random;

public class Bai4 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 8, 4, 5, 12, 4 };
		
		int kchen =2;
		int sochen=3;
		Insert(numbers, kchen, sochen);
		Delete(numbers, kchen);
		

	}

	private static void Insert(int[] numbers, int k, int x) {
		int[] numberout = new int[numbers.length + 1];

		for (int i = numberout.length - 1; i >= 0; i--) {
			if (i < k) {
				numberout[i] = numbers[i];
			}
			if (i > k) {
				numberout[i] = numbers[i - 1];
			}
		}
		numberout[k] = x;
		System.out.println("mang sau khi chen tai vi tri k = " + k +":");
		Arrays.stream(numberout).forEach(e -> System.out.print(e +"\t"));

	}
	
	private static void Delete(int[] numbers, int k) {
		int[] numberout = new int[numbers.length -1];
		
		for (int i = 0; i< numberout.length; i++) {
			if (i < k) {
				numberout[i] = numbers[i];
			}
			if (i >= k) {
				numberout[i] = numbers[i+1];
			}
		}
		System.out.println("\n==============================");
		System.out.println("\nmang sau khi xoa tai vi tri k = " + k +":");
		Arrays.stream(numberout).forEach(e -> System.out.print(e+"\t"));

	}

}
