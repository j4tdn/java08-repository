package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
	public static void main(String[] args) {
		// taoj mangr 

		// T : Integer || String 
		
		
		
		// Mảng số nguyên
		
		// attribute : Object[];
		
		// capacity ;

		Integer[] digitss = new Integer[5];
		
		
		
		List<Integer> digits = new ArrayList<>();
		
		System.out.println("size    "  + digits.size());
		
		//add 
		// bound unbound : 1.5 -- > tự động chuyển int thành Integer nếu có thể
		
		digits.add(1);
		digits.add(3);
		digits.add(5);
		digits.add(2);
		digits.add(10);
		digits.add(9);
		
		System.out.println("size" +digits.size());
		
		
		
		
		//remove 
		digits.remove(1);
		digits.remove(new Integer(2));
		
		
		//remove If  behind the sences
		Iterator<Integer> iterator = digits.iterator();
		while(iterator.hasNext()) {
			Integer digit = iterator.next();
			if(digit %2 ==0) {
				iterator.remove();
			}
		};


		




		
		//digits.removeIf(el -> el % 5 == 0  );
		digits.removeIf(new Predicate<Integer>() {

			@Override
			public boolean test(Integer digit) {
				// TODO Auto-generated method stub
				return digit % 5 == 0 ;
			}
		});
		
		//get
		System.out.println("Index 0 : " +digits.get(0));
		
		// set
		digits.set(0, 9);
		
		//check contains
		
		digits.contains(11);

		digits.stream().forEach(el -> System.out.println(el));

	}
}
