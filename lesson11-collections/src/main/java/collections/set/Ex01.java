package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> digits = new HashSet<>();
		digits.add(13);
		digits.add(6);
		digits.add(9);
		digits.add(14);
		
		System.out.println("size: " + digits.size());
		
		int a = digits.iterator().next();
		System.out.println(a);
	}
}
