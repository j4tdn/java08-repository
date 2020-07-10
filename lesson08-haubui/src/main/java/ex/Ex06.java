package ex;

public class Ex06 {
	public static void main(String[] args) {
		int index = 10;
		StringBuilder series = new StringBuilder();

		for (int i = 1; series.length() < index; i++) {
			series.append(String.valueOf(i));
		}

		char[] numbers = series.toString().toCharArray();

		for (int i = 0; i <= numbers.length; i++) {
			if (i == index) {
				System.out.println(numbers[i - 1]);
			}
		}
	}
}
