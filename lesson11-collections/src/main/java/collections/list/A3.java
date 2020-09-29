package collections.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		List<Item> items = getItems();
		
		// remove
		items.remove(new Item(2, "B"));
		System.out.println("size: " + items.size());
		System.out.println(items.contains(new Item(7, "a")));
		
		items.stream().forEach(e -> System.out.println(e));
	}
	
	private static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "A"));
		items.add(new Item(2, "B"));
		items.add(new Item(3, "b"));
		items.add(new Item(4, "a"));
		items.add(new Item(5, "Z"));
		items.add(new Item(6, "K"));
		
		return items;
	}
}
