package ex04;

public class Ex04 {

	static int getGreatestCommonDivisor(int a, int b) {
		return (a == 0) ? b : getGreatestCommonDivisor(b % a, a);
	}

	public static int getLeastCommonMultiple(int a, int b) {
		return (a * b) / getGreatestCommonDivisor(a, b);
	}

	public static int getLeastCommonMultiple(int[] nums) {
		int result = 1;
		for (int num : nums) {
			result = getLeastCommonMultiple(result, num);
		}
		return result;
	}

}
