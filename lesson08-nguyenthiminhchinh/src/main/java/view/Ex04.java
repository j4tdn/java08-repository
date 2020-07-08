package view;

public class Ex04 {
	public static void main(String[] args) {
		if (check(15, 75))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean check(long a, long b) {
		for (int i = 0; i < a; i++) {
			if (prime(i)) {
				if (a % i == 0 && b % i == 0)
					return true;
				else if (a % i != 0 && b % i == 0)
					return false;
				else if (a % i == 0 && b % i != 0)
					return false;
			}
		}
		return false;
	}

	private static boolean prime(long n) {
		if (n <= 1)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}
}
