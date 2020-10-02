package generic;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3 };
		Double[] doubles = { 1d, 2d, 3d };
		Long[] longs = { 1l, 2l, 3l };

		String[] strings = { "1", "A", "2" };

		show(ints, t -> t % 2 != 0);
//		show(doubles);
//		show(longs);
//		show(strings);
	}

	//generic bounded type
	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (E digit : digits) {
			if(condition.test(digit))
			System.out.print(digit + " ");
		}
	}
}
