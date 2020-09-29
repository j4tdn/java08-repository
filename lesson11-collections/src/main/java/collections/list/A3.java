package collections.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		
		List<Item> items = getItems();
		
		//remove, contains
		items.remove(new Item(2, "B"));
		//items.sort(c);
		
		System.out.println("size: " + items.size());
	}
	
	private static List<Item> getItems() {
		
		List<Item> items = new ArrayList<>(); //LinkedList
		
		items.add(new Item(1, "A"));
		items.add(new Item(2, "B"));
		items.add(new Item(3, "b"));
		items.add(new Item(4, "a"));
		items.add(new Item(5, "Z"));
		items.add(new Item(6, "k"));
		
		return items;
	}
}

//Ctrl + Shift + T
