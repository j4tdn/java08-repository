package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//Set<> : equals
				  //hashcode =>convert object to hash value
				//  		=> store  hash value in memory
		Set<Integer> digits= new HashSet<Integer>();
		digits.add(13);
		digits.add(14);
		digits.add(1);
		digits.add(12);
		digits.add(13);
		System.out.println("size: "+digits.size());
		
		Integer firstDigit=digits.iterator().next();
		
		System.out.println("Firstdigit: "+firstDigit);
		
	}
}
