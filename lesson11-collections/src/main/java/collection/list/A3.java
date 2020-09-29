package collection.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		List<Item> items = getItems();

		// remove, contain
		items.remove(new Item(2, "B"));

		System.out.println("size: " + items.size());
		System.out.println("contain: " + items.contains(new Item(4, "D")));
	}

	private static List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "A"));
		items.add(new Item(2, "B"));
		items.add(new Item(3, "b"));
		items.add(new Item(4, "a"));
		items.add(new Item(5, "Z"));
		items.add(new Item(6, "K"));
		return items;
	}
}
