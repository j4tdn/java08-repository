package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// List: override lai equals
		// Set:               equals
		//                    hashcode => convert object to hash value
		//					           => store hash value in memory
		Set<Integer> digits = new HashSet<>();

		digits.add(13);
		digits.add(7);
		digits.add(18);
		digits.add(10);

		System.out.println("Size: " + digits.size());

		// Khong lay duoc phan tu thu i vi Set khong dua vao theo thu tu
		Integer firstDigits = digits.iterator().next(); // Lay phan tu dau tien // Generic class chua param

		System.out.println("FirstDigit: " + firstDigits);

	}
}
