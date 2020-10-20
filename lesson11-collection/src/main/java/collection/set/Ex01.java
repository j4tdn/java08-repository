package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// Customer equality-checking mechanism
		
		//List<T> :equals
		//Set<T>  :equals
					// hard code => convert 
					// sort hard value
		
		Set<Integer> digits = new HashSet<Integer>();
		
		digits.add(13);
		digits.add(7);
		digits.add(18);
		digits.add(10);
		
		Integer firstDigits = digits.iterator().next();
		System.out.println("size :" + digits.size());
		System.out.println("first digits :" + firstDigits);
	}
}
