package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
	public static void main(String[] args) {
		Supplier<Item> noArgs = Item::new;
		noArgs.get();
		Function<Integer, Item> oneArg = Item :: new;
		Item item2 = oneArg.apply(100);	
	}
}

class Item {
	private int id;
	public Item() {
		// TODO Auto-generated constructor stub
		System.out.println("NoArgs");
	}
	
	public Item(int id) {
		System.out.println("OneArgs");
		this.id=id;
	}
}
