package collection.list;

import java.util.Arrays;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		List<Item> items = getItems();

//		items.remove(new Item(2, "B"));
		items.set(0, new Item(7,"X"));

		System.out.println("size :" + items.size());
	}

	private static List<Item> getItems() {
//		List<Item> items = new ArrayList<Item>();
//		items.add(new Item(1, "A"));
//		items.add(new Item(2, "B"));
//		items.add(new Item(3, "C"));
//		items.add(new Item(4, "D"));
//		items.add(new Item(5, "F"));
//		items.add(new Item(6, "G"));
		// hard code size so can't remove or add
		return Arrays.asList(new Item(1, "A"), new Item(2, "B"), new Item(3, "C"), new Item(4, "D"), new Item(5, "F"),
				new Item(6, "G"));
		
//		return List.of(new Item(1, "A"), new Item(2, "B"), new Item(3, "C"), new Item(4, "D"), new Item(5, "F"),
//				new Item(6, "G"));
	}
}
