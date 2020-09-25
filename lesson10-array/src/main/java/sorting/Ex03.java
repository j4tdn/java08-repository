package sorting;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		//sort(items);
		//Arrays.sort(items, Comparator.comparing(Item::getId).thenComparing(Item::getName));// phut 47   (Item::getId , reverseOrder()) : giam dan
		
		
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				int id1 = o1.getId();
				int id2 = o2.getId();
				if (id1 == id2) {
					return o2.getName().compareTo(o1.getName());
				}
				return id1 -id2;
			}
		});
		Arrays.stream(items).forEach(item -> System.out.println(item ));
		
		
		

	}
	private static Item[] getItems() {
		return new Item[] {
				new Item(1,"B"),
				new Item(4,"A"),
				new Item(3,"C"),
				new Item(1,"A"),
				new Item(3,"K"),
				new Item(4,"F"),
		};
	}
	
	private static void sort(Item[] items) {
		for (int out = items.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(items[in] == null) {
					continue;
				}
				
				if (items[out] == null|| items[in].getId() > items[out].getId()) {
					Item tmp = items[in];
					items[in] = items[out];
					items[out] = tmp;
				}
			}
		}
	}

}
