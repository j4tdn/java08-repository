package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// Customer equality-checking mechanism
		// List<T>: equals
		// Set<T>:  equals check hashcode to save diffirent values
		// 			hashCode => convert object to hash value
		//					 => store hash value in memory
		
		Set<Integer> digits = new HashSet<>();
		digits.add(13);
		digits.add(7);
		digits.add(18);
		digits.add(10);
		
		System.out.println("size: " + digits.size());
		
		Integer firstDigit = digits.iterator().next();
		System.out.println("first digit: " + firstDigit);
	}
}
