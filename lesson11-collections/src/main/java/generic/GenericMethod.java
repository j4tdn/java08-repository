package generic;

public class GenericMethod {

	public static void main(String[] args) {

		Integer[] ints = { 1, 2, 3 };
		Double[] doubles = { 1d, 2d, 3d };
		Long[] longs = { 1l, 2l, 3l };
		String[] strings = { "a", "b", "c" };
		show(ints, digit -> digit % 2 != 0);
	}

	private static <E extends Number> void show(E[] digits, Conditional<Integer> condition) {
		for (E digit : digits) {
			if (condition.test(digit)) {
				System.out.print(digit + "  ");
			}
		}
	}
}
