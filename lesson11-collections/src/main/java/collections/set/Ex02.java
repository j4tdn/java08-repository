package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		Item itemA = new Item(11, "A");
		Item itemB	= new Item(8 , "D"); 
		Item itemC	= new Item(17 , "C"); 
		Item itemD	= new Item(8 , "D"); 
		
		Set<Item> items = new LinkedHashSet<>();           //LinkedHashSet: duy trì thứ tự add vao
															// HashSet: khong duy tri thứ tự add vào
															//TreeSet: tu dong sort . phải implement comparable
		items.add(itemA);
		items.add(itemB);
		items.add(itemC);
		items.add(itemD);
		items.add(null);
		
		
		
		System.out.println("Size: " + items.size());
		
		
		items.forEach(item -> System.out.println(item));
	}
}
