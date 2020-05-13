package cuong.submit;

public class Bai05 {

	public static void main(String[] args) {
		System.out.println(decimalToBinary(400));
	}

	public static String decimalToBinary(int number) {
		if (number == 0) {
			return "0";
		}
		String result = "";
		while (number != 0) {
			result = (number % 2) + result;
			number /= 2;
		}
		return result;
	}
}
