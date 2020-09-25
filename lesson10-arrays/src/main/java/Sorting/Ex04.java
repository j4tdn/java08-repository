package Sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		String[] names = {"B", "a", "A", "b"};
		
		
		Item[] items = getItems();
		
		// Sort special
		Collator c = Collator.getInstance();
		
		c.setStrength(Collator.SECONDARY);
		
		
		Arrays.stream(items).forEach(System.out::println);

	}
	

	private static Item[] getItems() {
		return new Item[] { new Item(1, "K"), new Item(2, "B"), new Item(3, "C"), new Item(4, "A"), new Item(1, "D"),
				new Item(2, "F") };
	}
}
