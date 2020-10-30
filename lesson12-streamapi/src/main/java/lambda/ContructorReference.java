package lambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ContructorReference {
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,6,3,4,5);
		stream.forEach(System.out::println);
		
		Supplier<Item> noArgs = Item:: new;
		Item item1 = noArgs.get();
		System.out.println("Item1 id: " + item1.getId());
		
		Function<Integer, Item> oneArgs = Item::new;
		Item item2 = oneArgs.apply(100);
		System.out.println("Item2 id: " + item2.getId());
		
		
		
		
		
	}
}
 
class Item{
	private int id;
	
	public int getId() {
		return id;
	}
	public Item() {
		System.out.println("No Args");
	}
	
	public Item(int id) {
		System.out.println("One Args");
	}
	
}
