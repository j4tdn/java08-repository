package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		// lambda: instance of Functional interface
		// anonymous class
		// paramater
		Runnable runnable = () -> {
		};
		BinaryOperator<String> binaryOperator = (String t, String u) -> {
			return "asd";
		};

		Comparator<String> comp = Comparator.comparing(Function.identity());

	}
}
