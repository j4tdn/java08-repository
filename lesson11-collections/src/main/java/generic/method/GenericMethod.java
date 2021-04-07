package generic.method;

import java.util.List;

public class GenericMethod<T> {
	public void main(String[] args, Class<?> classType) {
		Integer[] ints = { 1, 2, 3 };
		Double[] doubles = { 1d, 2d, 3d };
		Long[] longs = { 1l, 2l, 3l };
		String[] strings = { "1", "A", "3" };

		show(ints, item -> item % 2 != 0);
		// show(doubles);
		// show(longs);
		// show(strings);
	}

	// generic upper bounded type
	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (E digit : digits) {
			if (condition.test(digit)) {
				System.out.print(digit + "  ");
			}
		}
	}
	
	// lower
	private static void show(List<?> digits, Condition<?> condition) {
//		for (Object digit : digits) {
//			if (condition.test(digit)) {
//				System.out.print(digit + "  ");
//			}
//		}
	}
	
	
}
