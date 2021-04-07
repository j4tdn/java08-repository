package lambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class ConstructorReference {
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		Supplier<Item> noArgs = Item::new;
		Item item1 = noArgs.get();
		System.out.println("item1 id: " + item1.getId());
		Function<Integer, Item> oneArg = Item::new;  
		Item item2 = oneArg.apply(100);
		System.out.println("item2 id: " + item2.getId());
	}
}

class Item {
	private int id;
	
	public int getId() {
		return id;
	}
	
	public Item() {
		System.out.println("NoArgs");
	}
	
	public Item(int id) {
		System.out.println("OneArg");
		this.id = id;
	}
}
