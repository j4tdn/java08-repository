package collection.list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		// non genneric type
		// catch errors at runtime
//		List digits = new ArrayList();
		List<Object> digits = new ArrayList<>();
		digits.add(1);
		digits.add("A");

		// genneric type
		// catch errors at compile time
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
//		numbers.add("A");
	}

}
