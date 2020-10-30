package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		stream.forEach(System.out::println);
	//	stream.forEach(System.out::println); -> chỉ cho phép duyệt một lần
		
//		Supplier<Item> noArgs = new Supplier<Item>() {
//
//			@Override
//			public Item get() {
//				return new Item();
//			}
//		};
//		
		Supplier<Item> noArgs = Item::new; //ko co j -> return T
		Item item = noArgs.get();
		System.out.println("item: " + item.getId());
		
	//	Function<Integer, Item> oneArg = (id) -> new Item(id);
		Function<Integer, Item> oneArg = Item::new;
		Item item2 = oneArg.apply(100);
		System.out.println("item2: " + item2.getId());
	}
	
	
}

class Item {
	private int id;
	
	public Item() {
		System.out.println("NoArgs");
	}
	
	public Item(int id) {
		System.out.println("OneArg");
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
