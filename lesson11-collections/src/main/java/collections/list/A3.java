package collections.list;

import java.util.ArrayList;
import java.util.List;

import Bean.Item;

public class A3 {
	public static void main(String[] args) {
		
		List<Item> items = getItems();
		
		
		// remove 
		
		// sau khi overiding ham equals trong Item thi ta co the dung nhu nay 
		items.remove(new Item(2,"b"));
		// vi trong ham remove cua ArrayList no so sanh theo kieu equals 
		
		items.contains(new Item(2,"b"));
		
		// ham contains nay cung vay 
		
		
		items.removeIf(el -> el.getId() == 2 && el.getName() == "b");
		
		
	}
	
	private static List<Item> getItems(){
		List<Item> items = new ArrayList<Item>();
		
		items.add(new Item(1,"A"));
		items.add(new Item(2,"b"));
		items.add(new Item(3,"c"));
		items.add(new Item(4,"e"));
		items.add(new Item(5,"g"));
		items.add(new Item(6,"fff"));
		
		return items ;
		
		
	}
}
