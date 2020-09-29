package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
	public static <T> void main(String[] args) {
		// tao mang T: integer || string
		
		// mang so nguyen
		// list la 1 mang object , cac pt nam ke nhau, capacity
		List<Integer> digits=new ArrayList<Integer>();
		System.out.println("size: "+digits.size());		
		digits.add(1);
		digits.add(12);
		digits.add(14);
		digits.add(21);
		digits.add(3);
		digits.add(51);
		digits.add(2);
		System.out.println("size: "+digits.size());
		
		//remove
		digits.remove(0);
		digits.remove(new Integer(12));
		
		// removeif
		Iterator<Integer> iterator=digits.iterator();
		while(iterator.hasNext()) {
			Integer digit=iterator.next();
			if(digit%2==0) {
				iterator.remove();
			}
		}
		digits.removeIf(digit->digit%5==0);
		
		System.out.println("Index 0: "+digits.get(0));
		//System.out.println("Index 0: "+digits.get(0));
		
		digits.set(0,11);
		
		System.out.println("contain: "+digits.contains(11));
		digits.stream().forEach(digit->System.out.println(digit));

	}
}
