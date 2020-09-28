package Ex01;

public class Ex02 {

	public static void main(String[] args) {
		int[] arrayNumbers = { 1, 2, 4, 4, 4 };
		System.out.println(compare(arrayNumbers));
	}

	public static String compare(int[] array) {
		int first = 0;
		int end = 0;

		if (array.length == 5) {
			return "5 item first equal 5 item end";
		}
		if (array.length > 5) {
			for (int i = 0; i < 5; i++) {
				first += array[i];
			}

			for (int j = array.length - 1; j > array.length - 6; j--) {
				end += array[j];
			}
			if (first > end)
				System.out.println("5 item first bigger  5 item end");
			if (first < end)
				System.out.println("5 item first smaller 5 item end");
			if (first == end)
				System.out.println("5 item first equal 5 item end");
		}

		return "not enough 5 item";
	}

}
