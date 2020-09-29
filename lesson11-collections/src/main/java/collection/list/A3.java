package collection.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
		List<Item> items = getItems();
		
		items.remove(new Item(2, "B"));
		
	}
	
	
	private static List<Item> getItems(){
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "A"));
		items.add(new Item(2, "B"));
		items.add(new Item(3, "C"));
		items.add(new Item(4, "D"));
		items.add(new Item(5, "a"));
		items.add(new Item(6, "X"));
		items.add(new Item(7, "K"));
		return items;
	}
}
