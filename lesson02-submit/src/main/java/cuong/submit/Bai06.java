package cuong.submit;

public class Bai06 {

	public static void main(String[] args) {
		System.out.println(nthPrimeNumber(200));
	}

	public static boolean isPrimeNumber(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int nthPrimeNumber(int numericalOrder) {
		int number = 1;
		while (numericalOrder != 0) {
			number++;
			if (isPrimeNumber(number)) {
				numericalOrder--;
			}
		}
		return number;
	}
}
