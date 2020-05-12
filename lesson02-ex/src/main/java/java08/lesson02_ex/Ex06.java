package java08.lesson02_ex;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(findPrimeNumber(4));
		System.out.println(findPrimeNumber(200));
	}

	private static boolean isPrimeNumber(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		
		return true;
	}

	private static int findPrimeNumber(int n) {
		int count = 0;
		int temp = 0;
		while (count != n) {
			if (isPrimeNumber(temp)) {
				count++;
			}
			temp++;
		}
		return temp-1;
	}
}
