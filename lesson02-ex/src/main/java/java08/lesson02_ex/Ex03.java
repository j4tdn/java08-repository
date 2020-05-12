package java08.lesson02_ex;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("symetric");
		System.out.println(isSymetricNumber(131));
	}

	private static boolean isSymetricNumber(int n) {
		int reverseNumber = 0;
		int tmp = n;
		while (tmp > 0) {
			reverseNumber = reverseNumber * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		return reverseNumber == n;
	}
}
