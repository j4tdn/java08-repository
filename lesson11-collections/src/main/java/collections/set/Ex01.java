package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// Customer equality-checking
		// List<T>: equals
		//Set<T>:equals, hashcode() => convert to object hash value=> store hash value in memory
		Set<Integer> digits=new HashSet<>(); 
		digits.add(13);
		digits.add(9);
		digits.add(11);
		digits.add(7);
		
		System.out.println(digits.size());
		
		Integer firstdigital=digits.iterator().next();
		System.out.println(firstdigital);
		
		
	}
}
