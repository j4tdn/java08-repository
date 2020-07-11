
public class Ex06 {

	public static void main(String[] args) {
		System.out.println(numberAtIndexK(100));
	}

	public static int numberAtIndexK(int k) {
		String numbers = "";
		int number = 1;
		while (numbers.length() < k) {
			numbers += String.valueOf(number++);
		}
		System.out.println(numbers);
		return Integer.parseInt(String.valueOf(numbers.charAt(k - 1)));
	}

}
