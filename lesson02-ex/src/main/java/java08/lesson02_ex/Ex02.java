package java08.lesson02_ex;

public class Ex02 {
	public static void main(String[] args) {
		long result = giaiThua(4) + giaiThua(7) + giaiThua(12) + giaiThua(18);
		System.out.println("Ket qua: " + result);
	}

	private static long giaiThua(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
