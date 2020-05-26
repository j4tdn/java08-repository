package ex04;

public class LeastCommonMultiple {
	public int getLeastCommonMultiple(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (getLeastCommonTwoNumber(a[i], a[j]) != 0 && getLeastCommonTwoNumber(a[i], a[j]) < min) {
					min = getLeastCommonTwoNumber(a[i], a[j]);
				}
			}
		}
		return min;
	}

	public int getLeastCommonTwoNumber(int a, int b) {

		for (int i = 0; i < Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}

		return a;
	}
}
