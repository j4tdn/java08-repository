package generic;

import colections.list.Condition;

public class GenericMethod {
	public static void main(String[] args) {
		
		Integer[] ints = {1,2,3};
		Double[] doubles = {1d,2d,3d};
		Long[] longs = {1l,2l,3l};
		
		show(ints , item ->  item % 2 != 0);
	}
	
	private static <E extends Number> void show(E[] digits, Condition<E> condition) {
		for(E digit:digits) {
			if(condition.test(digit)) {
				System.out.println(digit+ "  ");
			}
		}
	}
	
	

}
