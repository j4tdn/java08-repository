package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		Item itemA = new Item(11, "A");
		Item itemB = new Item(8, "B");
		Item itemC = new Item(17, "C");
		Item itemD = new Item(18, "D");
		
		Comparator<Item> comp = Comparator.nullsFirst(Comparator.comparing(Item::getId));
		
		//Set<Item> items = new HashSet<>();
		//Set<Item> items = new LinkedHashSet<>(); //duy tri thu tu phan tu on dinh truoc -> sau != sort
		Set<Item> items = new TreeSet<>(comp);

		items.add(itemA);
		items.add(itemB);
		items.add(null);
		items.add(itemC);
		items.add(itemD);
		
		System.out.println("size: " + items.size());
		items.forEach(item -> System.out.println(item));
	}
}

//tu sort Item phai co comparable
//sort san comparator
//hashcode va equal