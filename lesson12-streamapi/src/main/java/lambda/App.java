package lambda;

import java.util.Comparator;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		// lambda: instance of functional interface

		Comparator<String> comp = Comparator.comparing(Function.identity());
		
		
	}
}
