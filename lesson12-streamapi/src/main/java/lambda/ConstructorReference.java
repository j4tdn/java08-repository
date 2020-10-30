package lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
		
		Supplier<Iteam> noArgs = Iteam::new;
		Iteam iteam=noArgs.get();
		System.out.println(iteam.getId());
		Function<Integer, Iteam> oneArg = Iteam::new;
		Iteam iteam1=oneArg.apply(1);
		System.out.println(iteam1.getId());
	}
}

class Iteam {
	private int id;

	public int getId() {
		return this.id;
	}

	public Iteam() {
		System.out.println("noArgs");
	}

	public Iteam(int id) {
		System.out.println("oneArg");
		this.id = id;
	}
}