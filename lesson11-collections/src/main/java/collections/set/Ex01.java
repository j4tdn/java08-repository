package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// customer equality - checking mechanism
		// List<T> : equality
		// Set<T> : equality , 
		//			hash code  => covert object to hash value 
		//						=> store hash value in memory
		Set<Integer> digits = new HashSet<Integer>();
		digits.add(13);
		digits.add(7);
		digits.add(18);
		digits.add(10);
		
		System.out.println("Size: " + digits.size());
		
		Integer firstDigit = digits.iterator().next();
		System.out.println("FirstDigit: "+firstDigit);
	}
}
