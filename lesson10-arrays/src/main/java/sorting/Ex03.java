package sorting;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		// sort(items);
		// Arrays.sort(items, comparing(Item::getId).thenComparing(Item::getName));
		// //sort tang dan
		// Arrays.sort(items, comparing(Item::getId, reverseOrder())); //giam dan

		// Arrays.sort(items, Comparator.comparing(Item::getName));

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				int id1 = o1.getId();
				int id2 = o2.getId();

				if (id1 == id2) {
					return o1.getName().compareTo(o2.getName());
					// return o2.getName().compareTo(o1.getName()); //giam dan
				}

				return id1 - id2;

//				if (id1 > id2) {
//					return 1;
//				}
//				
//				if (id1 < id2) {
//					return -1; //giu nguyen vi tri ko hoan vi
//				}
//				
//				
//				return 0;
			}
		});
		Arrays.stream(items).forEach(item -> System.out.println(item));
	}

	private static Item[] getItems() {
		return new Item[] { 
				new Item(1, "D"), 
				new Item(2, "c"), 
				new Item(3, "C"), 
				new Item(2, "C"), 
				new Item(2, "B"),
				new Item(2, "b") 
		};
	}

	private static void sort(Item[] items) { // Alt shift R
		for (int out = items.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {

				if (items[in] == null) {
					continue;
				}

				if (items[out] == null || items[in].getId() > items[out].getId()) {
//					int tmp = items[in].getId();
//					items[in].setId(items[out].getId());
//					items[out].setId(tmp);

					Item tmp = items[in];
					items[in] = items[out];
					items[out] = tmp;
				}
			}
		}
	}
}
