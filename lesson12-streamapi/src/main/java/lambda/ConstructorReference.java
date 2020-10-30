package lambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		Supplier<Item> noArgs = Item::new;
		noArgs.get();

		Function<Integer, Item> oneArg = Item::new;
		Item item = oneArg.apply(10);
	}
}

class Item {
	private int id;
	public Item() {
		System.out.println("no args");
	}
	
	public Item(int id) {
		System.out.println("one args");
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
