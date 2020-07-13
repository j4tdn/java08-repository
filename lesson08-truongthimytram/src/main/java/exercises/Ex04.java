package exercises;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		int a = 75;
		int b = 15;
		if(isEquivalentPrimeNumber(a, b)) System.out.println("YES");
		else System.out.println("NO");
		

	}
	private static boolean isEquivalentPrimeNumber(int a, int b) {
		Set<Integer> primeArray1 = findPrimeDivisor(a);
		Set<Integer> primeArray2 = findPrimeDivisor(b);
		return primeArray1.equals(primeArray2);
	}
	private static Set<Integer> findPrimeDivisor(long a) {
		Set<Integer> result = new HashSet<Integer>();
		for (int i = 2; i <= a; i++) {
			if(isPrime(i) &&(a % i == 0)) {
				result.add(i);
			}
		}
		return result;
		
	}
	private static boolean isPrime(long a) {
		if(a <= 1) return false;
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
