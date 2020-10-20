package colection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		Item candy = new Item(11,"Candy");
		Item cake = new Item(8,"Custas");
		Item coca = new Item(5,"CoCacolas");
		Item pepsi = new Item(8,"pepsi");
		
		Comparator<Item> comp = Comparator.nullsFirst(Comparator.comparing(Item :: getId));
		Set<Item> items= new TreeSet<>(comp);
		
		items.add(candy);
		items.add(cake);
		items.add(null);
		items.add(coca);
		items.add(pepsi);
		System.out.println("Size: "+ items.size());
		
		items.forEach(item -> System.out.println(item));
		
	}

}
