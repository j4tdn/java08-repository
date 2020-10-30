package lambda;

import java.util.Comparator;
import java.util.function.Function;

public class App {

	public static void main(String[] args) {
		// lambda: instance of functional interface
		// annonymous class
		// (parameters) -> { body: override from abstract method }

		/*
		 * Function<String, Integer> function = (String s) -> { return 1; };
		 */

		// BinaryOperator<String> binaryOperator = (s1, s2) -> "";

		Comparator<String> comp = Comparator.comparing(Function.identity()); // s->s
		
	}

}
