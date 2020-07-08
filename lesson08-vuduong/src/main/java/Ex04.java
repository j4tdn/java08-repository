
public class Ex04 {
	public static void main(String[] args) {
		isSamePrime(75, 15);
	}

	private static void isSamePrime(int numberA, int numberB) {
		int min = numberA < numberB ? numberA : numberB;

		for (int i = 2; i <= Math.sqrt(min); i++) {
			if (isPrimeNumber(i) && numberA % i == 0 && numberB % i == 0) {
				continue;
			} else if (isPrimeNumber(i) && numberA % i == 0 && numberB % i != 0) {
				System.out.println("NO");
				return;
			} else if (isPrimeNumber(i) && numberA % i != 0 && numberB % i == 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

	private static boolean isPrimeNumber(int number) {
		if (number < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
