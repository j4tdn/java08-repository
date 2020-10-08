package generic;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] ints = {1,2,3};
		Double[] doubles = {1d,2d,3d};
		Long[] longs = {1l,2l,3l};
		String[] strings = {"1","A","3"};
		
		show(ints, (Integer item) -> item % 2 != 0);
//		show(doubles);
//		show(strings);
	}

	// Genenic dai dien cho doi tuong extends Object
	// Object dai dien tat ca kieu du lieu, nhung mang kieu nguyen thuy
	// ko phai con Object
	
	// <E extends Number> generic bounded type
	// create Generic Type always "extends" both of class and interface
	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for (E digit: digits) {
			if (condition.test(digit)) {
				System.out.print(digit + "  ");
			}			
		}
	}
}
