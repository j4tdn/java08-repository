package collections.list;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		List<Item> items = getItems();

		// remove, contain
		items.remove(new Item(2, "E"));
		System.out.println("size:" + items.size());
	}

	private static List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "A"));
		items.add(new Item(2, "E"));
		items.add(new Item(3, "B"));
		items.add(new Item(4, "C"));
		items.add(new Item(5, "D"));
		return items;
	}

}
