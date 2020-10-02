package collections.list;

import java.util.List;

import bean.Item;

public class A3 {

	public static void main(String[] args) {
		List<Item> items = getItems();
		
		//remove, contains
		items.remove(new Item(1, "A"));
		items.contains(new Item(2, "B"));
		
		System.out.println("size: " + items.size());

	}
	
	private static List<Item> getItems(){
//		List<Item> items = new ArrayList<>();
//		items.add(new Item(1, "A"));
//		items.add(new Item(2, "B"));
//		items.add(new Item(3, "a"));
//		items.add(new Item(4, "b"));
//		items.add(new Item(5, "c"));
		//return items;
		//dynamic list, fixed size
//		return Arrays.asList(
//				new Item(1, "A"),
//				new Item(1, "A"),
//				new Item(1, "A"),
//				new Item(1, "A")
//				);
		// unmodify, immutable
		return List.of(new Item(1, "A"),
				 new Item(2, "B"));
				
	}

}
