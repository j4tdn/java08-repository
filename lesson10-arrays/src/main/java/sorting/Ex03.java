package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import java.util.function.Function;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		//sort(items);
		//Arrays.sort(items, Comparator.comparing(item -> item.getId()));		
//		Arrays.sort(items, comparing(Item::getId).thenComparing(Item::getName));
		
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				int id1 = o1.getId();
				int id2 = o2.getId();
				
				if (id1 == id2) {
					return o1.getName().compareTo(o2.getName());
				}
				
				return id1 - id2;
			}
			
		});
		
		Arrays.stream(items).forEach(item -> System.out.println(item));		
	}	
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "D"),
				new Item(2, "Z"),
				new Item(3, "C"),
				new Item(4, "A"),
				new Item(2, "K"),
				new Item(4, "F")				
		};
	}
	
	private static void sort(Item[] items) {
		for (int out = items.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (items[in] == null) {
					continue;
				}
				
				if (items[out] == null || items[in].getId() > items[out].getId()) {
					Item tmp = items[in];
					items[in] = items[out];
					items[out] = tmp;
				}
			}
		}
	}
}
