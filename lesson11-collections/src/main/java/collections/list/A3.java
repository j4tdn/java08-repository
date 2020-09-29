package collections.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A3 {
	public static void main(String[] args) {
	
		
		
		
		
		
		List<Item> items = getItems();
		
		//remove phải override lại hàm equals
		items.remove(new Item(2,"B"));
		
		
		
		System.out.println("Size: " +items.size());
	}
	
	private static List<Item> getItems(){
		List<Item> items = new ArrayList<>();
		items.add(new Item(1,"A"));
		items.add(new Item(2,"B"));
		items.add(new Item(3,"C"));
		items.add(new Item(4,"D"));
		items.add(new Item(5,"E"));
		items.add(new Item(6,"F"));
		
		return items;
	}
}
