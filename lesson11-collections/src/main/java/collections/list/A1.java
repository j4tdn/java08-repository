package collections.list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		
		
		// catch error at runtime
		//List digits = new ArrayList();
		List<Object> digits = new ArrayList<Object>();
		digits.add(1);
		digits.add("A");
		
		//1.5 1.7
		// generic type
		// catch errors at compile time
		List<Integer> numbers  = new ArrayList<Integer>();
		numbers.add(1);
//		numbers.add("A");
	}
}
