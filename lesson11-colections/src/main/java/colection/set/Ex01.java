package colection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//customer equality-checking mechanism
		//List<T> : equals
		//Set<T> : equals
		// hashcode => convert object to hash value
		//			=> store hash value in memory
		
		Set<Integer> digits = new HashSet<>();
		digits.add(13);
		digits.add(7);
		digits.add(18);
		digits.add(0);
		digits.add(8);
		
		Integer digit = digits.iterator().next();
		
		System.out.println(digit);
		System.out.println(digits.size());
	}	

}
