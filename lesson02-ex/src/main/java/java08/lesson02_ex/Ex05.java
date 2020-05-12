package java08.lesson02_ex;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(binaryNumber(14));
	}

	private static long binaryNumber(int number) {
		long result = 0;
		int i = 1;
		while (number != 0) {
			result = number % 2 * i + result;
			i *= 10;
			number /= 2;
		}
		return result;
	}
}
