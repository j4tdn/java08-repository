package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		Item itemA = new Item(11, "A");
		Item itemB = new Item(8, "D");
		Item itemC = new Item(17, "B");
		Item itemD = new Item(8, "D");
		 
//		Comparator<Item> comp = new Comparator<Item>() {
//			@Override
//			public int compare(Item o1, Item o2) {
//				if (o1 == null) return 1;
//				if (o2 == null) return -1;
//				return o1.getId() - o2.getId();
//			}
//		};
		
		Comparator<Item> comp = Comparator.nullsFirst(Comparator.comparing(Item::getId));
		
		Set<Item> items = new TreeSet<Item>(comp);
		items.add(itemA);
		items.add(itemB); 
		items.add(null); 
		items.add(itemC);
		items.add(itemD);
		
		System.out.println("size: " + items.size());
		items.forEach(item -> System.out.println(item));
	}
}
