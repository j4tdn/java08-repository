package colections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
	public static void main(String[] args) {
		// T: Integer || String
		// T: Student || Employee
		
		// Mảng số nguyên
		// attribute: Object[]
		// capacity 
		List<Integer> digits = new ArrayList();
		System.out.println("size " + digits.size());
		
		// add
		// bound: transform primitive to Object 
		// unbound < 1.5
		digits.add(1);	digits.add(7);
		digits.add(3);	digits.add(15);
		digits.add(5);
		digits.add(2);
		System.out.println("size " + digits.size());
		
		// remove
		digits.remove(0);
		digits.remove(new Integer(3));
		
		// removeIf
		Iterator<Integer> iterator = digits.iterator();
		while (iterator.hasNext()) {
			Integer digit = iterator.next();
			if (digit % 2 == 0)
				iterator.remove();
		}
		
//		digits.removeIf(new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer digit) {
//				return digit % 5 == 0;
//			}
//		});		
		digits.removeIf(digit -> digit % 5 == 0);
		
		digits.stream().forEach(e -> System.out.print(e + " "));
		System.out.println("\nIndex 0: " + digits.get(0));
		digits.set(0, 11);
		digits.stream().forEach(e -> System.out.print(e + " "));
		System.out.println("\nContain 11: " + digits.contains(11));
	}
}
