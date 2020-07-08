package ex04;

public class Ex04 {
	public static int greatestCommonDivisor(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public static boolean isPrimeNumber(int a) {
		boolean check = true;
		for (int i = 2; i < Math.sqrt(a); i++) {
			if (a % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static boolean isPrimeNumbereEquivalent(int a) {
		boolean check = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				if (!isPrimeNumber(i)) {
					check = false;
					break;
				}
			}
		}
		return check;
	}

	public static void main(String[] args) {
		if (isPrimeNumbereEquivalent(greatestCommonDivisor(75, 15))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
