package ex;

public class Ex04 {

	public static void main(String[] args) {

		if (findPrimeDivisors(75).equals(findPrimeDivisors(15))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

	private static boolean isPrime(int number) {

		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		}

		return false;
	}

	public static String findPrimeDivisors(int number) {
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= number; i++) {
			if ((number % i == 0) && (isPrime(i))) {
				result.append(i + " ");
			}
		}
		return result.toString().trim();
	}

}
