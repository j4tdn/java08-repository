package view;

public class Ex03 {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		System.out.println(isPowerOf(a, b));
	}

	public static boolean isPowerOf(int a, int b) {
		int n = a;
		boolean x = false;
		for (int i = 0; i<n ; i++) {
			if(Math.pow(b, i) == a) {
				x = true;
			}
		}
		return x;
	}
}
