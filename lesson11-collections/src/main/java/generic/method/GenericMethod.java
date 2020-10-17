package generic.method;

import bean.Item;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3 };
//		Double[] doubles= {1d,2d,3d};
//		Long[] longs= {1l,2l,3l};
//		String[] strings= {"1","A","3"};
//		show(ints, new Condition<Integer>() {
//
//			@Override
//			public boolean test(Integer item) {
//				return item % 2 != 0;
//			}
//		});

		show(ints, item -> item % 2 != 0);
		// show(doubles);
		// show(longs);
		// show(strings);

	}

	// generic bounded type
	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (E digit : digits) {
			if (condition.test(digit)) {
				System.out.println(digit + " ");
			}
		}
	}
}

/*
 * package generic; public class GenericMethod { public static void
 * main(String[] args) { Integer[] ints = { 1, 2, 3 }; Double[] doubles = { 1d,
 * 2d, 3d }; Long[] longs = { 1l, 2l, 3l }; String[] strings = { "1", "a", "3"
 * }; show(ints, item -> item % 2 != 0); // show(doubles); // show(longs); } //
 * generic bound type private static <E extends Number> void show(E[] digits,
 * Condition<E> condition) { for (E digit : digits) { if (condition.test(digit))
 * { System.out.print(digit + " "); } } } }
 */