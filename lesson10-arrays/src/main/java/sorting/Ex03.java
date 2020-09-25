package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItem();
		// sort(items);
		//Arrays.sort(items, comparing(Item::getId).thenComparing(Item::getName));
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				int id1 = o1.getId();
				int id2 = o2.getId();
				
				if(id1 > id2) {
					return 1;
				}
				if(id1 < id2) {
					return -1;
				}
				if(id1 == id2) {
					return o1.getName().compareTo(o2.getName());
				}
				return id1 -id2;
			}
			
		});
		Arrays.stream(items).forEach(item -> System.out.println("  " + item));

	}

	private static Item[] getItem() {
		return new Item[] { new Item(1, "A"), new Item(2, "Z"), new Item(3, "E"), new Item(2, "D"), new Item(4, "E"),
				new Item(6, "F"), };

	}

	private static void sort(Item[] item) {
		for (int out = item.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {

				if (item[in] == null) {
					continue;

				}

				if (item[out] == null || item[in].getId() > item[out].getId()) {
					Item tmp = item[in];
					item[in] = item[out];
					item[out] = tmp;

				}

			}
		}
	}
}
