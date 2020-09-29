package collections.list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		// non-generic type
		// catch errors at runtime
		List<Object> digits = new ArrayList<>();
		digits.add(1);
		digits.add("A");		
		
		// 1.5 1.7
		// generic type
		// catch errors at compile time
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
//		numbers.add(A);
	}
}
