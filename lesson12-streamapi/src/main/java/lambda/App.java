package lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		// lambda: instance of functional interface
		// anonymous class
		// parameters
		// ->
		// {body} override abstract method

		//BinaryOperator<String> operator = (s1, s2) -> " ";
		Comparator<String> comp = Comparator.comparing(Function.identity());

		/*
		 * Function<String, Integer> function = (String s) -> { return 1; };
		 * 
		 * Runnable runnable = () -> {
		 * 
		 * };
		 */

	}
}
// thay vi new functional interface thi goi lambda