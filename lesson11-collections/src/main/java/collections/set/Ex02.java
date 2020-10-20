package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		Item itemA = new Item(11, "A");
		Item itemB = new Item(12, "D");
		Item itemC = new Item(13, "C");
		Item itemD = new Item(15, "L");

		Set<Item> items = new HashSet<Item>();

		items.add(itemA);
		items.add(itemC);
		items.add(itemB);
		items.add(itemD);
		
		Comparator<Item> comp = new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				if(o1 == null) {
					return 1;
				} 
				if(o2 == null) {
					return -1;
				}
				return o1.getId() - o2.getId();
			}
		};
		
		Set<Item> treeItems = new TreeSet<Item>(Comparator.nullsFirst(Comparator.comparing(Item::getId)));
		
		treeItems.add(itemA);
		treeItems.add(itemC);
		treeItems.add(null);

		treeItems.add(itemB);
		treeItems.add(itemD);
		
		System.out.println(treeItems.size());
		
		treeItems.forEach(System.out::println);

	}
}
