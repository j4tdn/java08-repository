package Ex04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (commonDivisor(15, 75)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static boolean commonDivisor(long a, long b) {
		int result = 0;
		long max = a > b ? b : a;

		for (int i = 1; i <= max / 2; i++) {
			if (a % i == 0 && b % i == 0) {
				result++;
			}
		}
		return result >= 2 ? true : false;
	}

}
