package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import static java.util.Comparator.comparing;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		sort(items);
		
		/*Arrays.sort(items, new Comparator<Item>() {
			
			public int compareTo(Item o1, Item o2) {
			return o1.getId() - o2.getId();
			}
		});*/
		

		/*Arrays.sort(items, Comparator.comparing(Item::getName));*/
		Arrays.sort(items, comparing(Item::getId).thenComparing(Item::getName));
		
		Arrays.stream(items).forEach(item -> System.out.println(item));
	}
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "D"),
				new Item(3, "A"),
				new Item(5, "M"),
				new Item(8, "K"),
				new Item(11, "L"),
				new Item(10, "G"),
				new Item(7, "E")
		};
	}
	public static void sort(Item[] items) {
		for (int out = items.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(items[in] == null) {
					continue;
				}
				
				if (items[out] == null|| items[in].getId() > items[out].getId() ) {
					Item tmp = items[in];
					items[in] = items[out];
					items[out] = tmp;
					
				}
			}
		}
	}
	
	

}
