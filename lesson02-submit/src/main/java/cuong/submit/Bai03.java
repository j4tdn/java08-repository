package cuong.submit;

public class Bai03 {

	public static void main(String[] args) {
		System.out.println((isSymmetricNumber(13331)) ? "Symmetric number" : "Asymmetric number");
	}

	public static boolean isSymmetricNumber(double n) {
		String number = "";
		if (n == (int) n) {
			number = String.valueOf((int) n);
		}
		else {
			number = String.valueOf(n);
		}
		for (int i = 0; i < number.length() / 2; i++) {
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
