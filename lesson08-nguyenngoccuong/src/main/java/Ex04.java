import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		long m = 3L;
		long n = 2L;
		System.out.println(isEquivalentPrimeNumber(m, n) ? "YES" : "NO");
	}

	public static boolean isEquivalentPrimeNumber(long m, long n) {
		Set<Integer> primeDivisorsM = findPrimeDivisors(m);
		Set<Integer> primeDivisorsN = findPrimeDivisors(n);
		return primeDivisorsM.equals(primeDivisorsN);
	}

	public static Set<Integer> findPrimeDivisors(long number) {
		if (number == 0) {
			return new HashSet<Integer>();
		}
		Set<Integer> primeDivisors = new HashSet<Integer>();
		while (number % 2 == 0) {
			primeDivisors.add(2);
			number /= 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				primeDivisors.add(i);
				number /= i;
			}
		}
		if (number > 2) {
			primeDivisors.add((int) number);
		}
		return primeDivisors;
	}

}
