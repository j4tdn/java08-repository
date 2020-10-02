package collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		
		List<Item> items = getItems();
		
		//remove.contains=>equal
		//items.remove(new Item(2, "B"));
		
		items.set(0, new Item(7, "x"));
		
		items.stream().forEach(System.out::println);
	}

	private static List<Item> getItems() {
//		List<Item> items = new ArrayList<Item>();
//		items.add(new Item(1, "A"));
//		items.add(new Item(2, "B"));
//		items.add(new Item(3, "c"));
//		items.add(new Item(4, "d"));
//		items.add(new Item(5, "e"));
//		items.add(new Item(6, "f"));
//		return items;
		
		//dynamic list=>fixed-size=> no remove and no add but be setted
		return Arrays.asList(new Item(1, "A"),
				new Item(2, "B"));
		
		//unmodifiable, immutable => no remove and no add and no set
//		return List.of(new Item(1, "A"),
//			new Item(2, "B"));
	}
}
