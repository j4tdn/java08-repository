package Exercises;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap N: ");
		long M = ip.nextLong();

		System.out.print("Nhap M: ");
		long N = ip.nextLong();

		if (CommonConventionIsPrimeNumbes(M, N)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

	// UC la SNT
	public static boolean CommonConventionIsPrimeNumbes(long M, long N) {
		long min = (M > N) ? M : N;
		boolean test = false;
		for (int i = 2; i <= min; i++) {
			if (isPrimeNumber(i) && M % i == 0 && N % i == 0) {
				test = true;
			}
		}
		return test;
	}
	
	public static boolean isPrimeNumber(long n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
