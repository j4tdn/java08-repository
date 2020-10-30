package lambda;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		
//		Supplier<Item>  noArgs = new Supplier<Item >() {
//
//			@Override
//			public Item get() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		// -->
//		Supplier<Item> noArgs = () -> new Item();
//		Function<Integer,Item> noArgs = (i) -> new Item(i);
		Supplier<Item> noArgs = () -> new Item();
		Item item1 = noArgs.get();
		System.out.println("item Suplier: " + item1.getId());
		Function<Integer, Item> oneArgs = Item::new;
		Item item = oneArgs.apply(1);
		System.out.println("item Suplier: " + item.getId());
		// -->
//		Supplier<Item> noArgs = Item::new;

	}
}

class Item {
	private int id;

	public Item() {
		System.out.println("NoAgrs");
	}

	public Item(int id) {
		System.out.println("OneAgrs");
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
