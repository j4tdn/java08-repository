package collections.list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		
		//1.4
		//catch errors at runtime
		//List digits = new ArrayList();
		List<Object> digits = new ArrayList();
		digits.add(1);
		digits.add("A");
		
		
		//1.5 1.7
		//generic type
		//catch errors ar compile time
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		//numbers.add(A);
	}
}
