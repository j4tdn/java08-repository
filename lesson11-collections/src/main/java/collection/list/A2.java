package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
	public static void main(String[] args) {
		// T: Integer|| string
		// T: Student||employee

		// mang so nguyen
		// attribute: object[]
		// capacity
		// cac pt lien ke nhau

		List<Integer> digits = new ArrayList<Integer>();
		System.out.println("size : " + digits.size());

		// add
		digits.add(1);
		digits.add(2);
		digits.add(3);
		digits.add(4);
		digits.add(5);
		digits.add(7);
		digits.add(15);
		System.out.println("size : " + digits.size());

		// remove
		digits.remove(0);
		digits.remove(new Integer(3));
		System.out.println("size : " + digits.size());

		// removeIf

		/*
		 * Iterator<Integer> iterator = digits.iterator(); while (iterator.hasNext()) {
		 * Integer digit = iterator.next(); if(digit%2==0) { iterator.remove(); }
		 * 
		 * }
		 */
		digits.removeIf(digit -> digit % 5 == 0);

		System.out.println("index 0: " + digits.get(0));

		digits.set(0, 11);

		System.out.println("contain 11: " + digits.contains(11));

		digits.stream().forEach(System.out::println);

	}
}
