package lambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {

	public static void main(String[] args) {
		Supplier<Item> noArgs = Item::new;
		Item item1 = noArgs.get();
		System.out.println("item1 id: " + item1.getId());
		Function<Integer, Item> oneArgs = Item::new;
		Item item2 = oneArgs.apply(100);
		System.out.println("item2 id: " + item2.getId());
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
	}

}

class Item {
	private int id;

	public Item() {
		System.out.println("NoArgs");
	}

	public Item(int id) {
		System.out.println("OneArgs");
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
