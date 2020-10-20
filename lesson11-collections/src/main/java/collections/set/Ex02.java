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
		Item itemB = new Item(8, "B");
		Item itemC = new Item(17, "C");
		Item itemD = new Item(19, "D");

		Set<Item> items1 = new HashSet<Item>();
		items1.add(itemA);
		items1.add(itemB);
		items1.add(itemC);
		items1.add(itemD);

		Set<Item> items2 = new LinkedHashSet<Item>();
		items2.add(itemA);
		items2.add(itemB);
		items2.add(itemC);
		items2.add(itemD);

		Comparator<Item> comp = Comparator.nullsFirst(Comparator.comparing(Item::getId));
		
		Set<Item> items3 = new TreeSet<Item>(comp);
		items3.add(itemA);
		items3.add(itemB);
		items3.add(itemC);
		items3.add(null);
		items3.add(itemD);

		System.out.println("Size: " + items3.size());
		items3.forEach(item -> System.out.println(item));
	}
}
