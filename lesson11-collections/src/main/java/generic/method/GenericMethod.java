package generic.method;

import java.util.Arrays;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3 };
		Double[] doubles = { 1d, 2d, 3d };
		Long[] longs = { 1l, 2l, 3l };
		String[] strings = { "1", "A", "3" };
		show(ints, t -> t % 2 != 0);
//        show(doubles);
//        show(strings);
	}

//    private static void show(Object[] digits) {
//        for (Object digit : digits) {
//            System.out.println(digit + " ");
//        }
//    }
	// generic bounded type
	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (E digit : digits) {
			if (condition.test(digit)) {
				System.out.println(digit + " ");
			}
		}
	}


}