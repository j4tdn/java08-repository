package lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
	public static void main(String[] args) {
		
		
		Stream <Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
		//stream.forEach(System.out::println);/ chi duoc thao tac 1 lanw
		
		
		Supplier<Item> noAgrs = Item::new;
		Function<Integer, Item>	oneAgrs	= Item::new;
		noAgrs.get();
		oneAgrs.apply(1);
		
	}
}

class Item{
	private int id;
	public Item() {
		System.out.println("noA");
		
	}
	public Item(int id) {
		this.id=id;
		System.out.println("id oneA: "+id);
	}
}


// arrayva collection luu tru dl con stream thao tac vs dl
// collection luu tru dl cofn stream xu ly dl va cung cos luu tru dl(chusc nang phu)