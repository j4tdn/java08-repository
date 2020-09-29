package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// T: Integer || String
		// T: Student || Employee

		// Mang so nguyen
		// attribute : Object;
		// capacity
		List<Integer> digits = new ArrayList<>();
		System.out.println("size :" + digits.size());

		// add
		// bound unbound :1.5
		digits.add(1);
		digits.add(2);
		digits.add(4);
		digits.add(3);

		digits.add(10);
		digits.add(7);
		digits.add(20);
		System.out.println("size :" + digits.size());

		digits.remove(0);
		digits.remove(new Integer(5));

//		digits.stream().forEach(value -> System.out.println(value));
		// remove if
		Iterator<Integer> iterator = digits.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer % 2 == 0) {
				iterator.remove();
			}
		}

		digits.removeIf(digit -> digit % 5 == 0);

		digits.stream().forEach(value -> System.out.println(value));
		System.out.println("Index 0 :" + digits.get(0));
		digits.set(0, 11);
		System.out.println("contain:" + digits.contains(11));
		digits.stream().forEach(value ->  System.out.println(value));
	}

}
