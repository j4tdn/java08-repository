package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A2 {
	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<Integer>();

		digits.add(1);
		digits.add(4);
		digits.add(3);
		digits.add(2);
		digits.add(5);
		digits.add(7);
		digits.add(15);

		digits.remove(2);
		digits.remove(new Integer(2));

		Iterator<Integer> iterator = digits.iterator();
		while (iterator.hasNext()) {
			Integer digit = iterator.next();
			if (digit % 2 == 0) {
				iterator.remove();
			}
		}

		digits.removeIf(digit -> digit % 5 == 0);

		digits.stream().forEach(digit -> System.out.println(digit));

		System.out.println(digits.get(0));

		digits.set(0, 11);

		digits.stream().forEach(digit -> System.out.println(digit));

		System.out.println("contains: " + digits.contains(11));

	}
}
