package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Item;

public class A2 {
	public static void main(String[] args) {
		// T: Integer || String
		// T: Student || Employee

		// Mang so nguyen
		// attribute: Object[]
		// Capacity
		List<Integer> digits = new ArrayList<>();
		System.out.println("size: " + digits.size());

		digits.add(6);
		digits.add(5);
		digits.add(4);
		digits.add(3);
		digits.add(2);
		digits.add(1);
		digits.add(7);
		digits.add(15);


		System.out.println(digits.size());
		System.out.println(digits.get(3));

		// remove
		digits.remove(0);
		digits.remove(new Integer(3));

		// removeIf
		Iterator<Integer> iterator = digits.iterator();
		while (iterator.hasNext()) {
			Integer digit = iterator.next();
			if (digit % 2 == 0) {
				iterator.remove();
			}
		}

		digits.removeIf(x -> x % 5 == 0);

		System.out.println("=========================");
		digits.stream().forEach(System.out::println);
		
		System.out.println("Index 0: " + digits.get(0));
		digits.set(0, 11);
		digits.stream().forEach(System.out::println);
		

	}
}
