package collections.list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		
		//catch error at run time
		// java version 1.4
		List digits = new ArrayList();
		digits.add(1);
		digits.add("A");
		
		//catch error at compile time
		// java version 1.7
		List<Integer> numbers = new ArrayList();
		numbers.add(1);
		//numbers.add(A);
	}
}
