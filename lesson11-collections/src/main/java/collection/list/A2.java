package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
	public static void main(String[] args) {
		// Tao mang
		// T: Integer || String
		// T: Student || Employee

		// Mang so nguyen
		// attribute: Object[]
		// capacity, cac ptu trong ArrayList nam ke nhau
		List<Integer> digits = new ArrayList<Integer>();
		System.out.println("size: " + digits.size());

		// add
		// bound unbound: 1.5
		digits.add(1);
		digits.add(7);
		digits.add(3);
		digits.add(15);
		digits.add(5);
		digits.add(2);
		digits.add(20);
		System.out.println("size: " + digits.size());

		// remove
		digits.remove(0);
		digits.remove(new Integer(5));
		System.out.println("size: " + digits.size());

		// removeif
		Iterator<Integer> iterator = digits.iterator();
		while (iterator.hasNext()) {
			Integer digit = iterator.next();
			if (digit % 2 == 0) {
				iterator.remove();
			}
		}

		digits.removeIf(digit -> digit % 5 == 0);

		digits.stream().forEach(digit -> System.out.println(digit));
		System.out.println("Index 0: " + digits.get(0));
		digits.set(0, 11);
		digits.stream().forEach(digit -> System.out.println(digit));

		System.out.println(digits.contains(11));
	}
}