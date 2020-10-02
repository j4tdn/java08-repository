
package generic;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3 };
		Double[] doubles = { 1d, 2d, 3d };
		Long[] longs = { 1l, 2l, 3l };
		String[] strings = { "1", "2", "A" };

		show(ints, item -> item % 2 != 0);
		/*
		 * System.out.println("\n=================="); show(doubles);
		 * System.out.println("\n=================="); show(longs);
		 */

	}

	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (E i : digits) {
			if (condition.test(i)) {
				System.out.print(i + "\t ");
			}
		}
	}

}
