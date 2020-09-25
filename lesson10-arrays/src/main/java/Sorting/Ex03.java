package Sorting;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		// sortById(items);
		// Arrays.stream(items).forEach(System.out::println);

		// Cach 2
		Arrays.sort(items, (o1, o2) -> o1.getId() - o2.getId());
		Arrays.sort(items, Comparator.comparing(Item::getId, Comparator.reverseOrder()).thenComparing(Item::getName));

		Arrays.sort(items, (Item o1, Item o2) -> {
			int id1 = o1.getId();
			int id2 = o2.getId();

			if (id1 == id2) {
				return o1.getName().compareTo(o2.getName());
			}
			return id1 - id2;
		});

		Arrays.stream(items).forEach(System.out::println);

	}

	private static Item[] getItems() {
		return new Item[] { new Item(1, "K"), new Item(2, "B"), new Item(3, "C"), new Item(4, "A"), new Item(1, "D"),
				new Item(2, "F") };
	}

	private static void sortById(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = i; j < items.length; j++) {
				if (items[i] == null) {
					continue;
				}
				if (items[j] == null || items[i].getId() > items[j].getId()) {
					Item tmp = items[i];
					items[i] = items[j];
					items[j] = tmp;
				}
			}
		}
	}
}
