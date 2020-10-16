package generic.method;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3 };
		Double[] longs = { 1d, 2d, 3d };
		Long[] doubles = { 1l, 2l, 3l };
		String[] strings = { "1", "a", "3" };
		show(ints,iteam -> iteam%2 !=0);
		// show(doubles);
		// show(longs);
		//show(strings);

	}

	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (int i = 0; i < digits.length; i++) {
			if (condition.test(digits[i])) {
				System.out.println("digit: " + digits[i]);
			}

		}
	}
}
