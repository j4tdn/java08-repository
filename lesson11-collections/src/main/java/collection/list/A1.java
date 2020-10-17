package collection.list;

import java.util.ArrayList;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		// 1.4
		// non-generic type - raw type
		// catch errors at runtime
		// List digtis = new ArrayList();
		List<Object> digtis = new ArrayList();
		digtis.add(1);
		digtis.add("a");

		// 1.5 1.7
		// generic type
		// catch errors at compile time
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		// numbers.add(A);

	}

}