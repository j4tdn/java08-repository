package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import bean.Item;

public class Ex03 {

	public static void main(String[] args) {
		Item[] items = getItem();
		//sort(items);
		//Arrays.sort(items, comparing(Item::getId).thenComparing(Item::getName));
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				if(o1.getId() == o2.getId()) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getId() - o2.getId();
			}
		});
		Arrays.stream(items).forEach(item -> System.out.println(item + " "));
        //System.out.println("==================================");
		//Arrays.sort(items, comparing(Item::getName));
		//Arrays.stream(items).forEach(item -> System.out.println(item + " "));

	}
	
	private static Item[] getItem() {
		return new Item[] {
				new Item(1, "D"),
				new Item(2, "c"),
				new Item(3, "C"),
				new Item(2, "F"),
				new Item(2, "C"),
				new Item(2, "B"),
		};
	}
	private static void sort(Item[] items) {
		for (int out = items.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(items[in] == null) {
					continue;
				}
				if(items[out] == null || items[in].getId() > items[out].getId()) {
					Item tmp = items[in];
				    items[in] = items[out];
				    items[out] = tmp;
				}
			}
			
		}
	}

}
