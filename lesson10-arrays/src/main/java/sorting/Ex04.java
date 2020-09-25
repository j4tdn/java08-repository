package sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex04 {
	public static void main(String[] args) {
		String[] names = { "B", "a", "A", "a", "Á", "á" };
//		compareToIgnoreCase

		Collator c = Collator.getInstance();

		c.setStrength(Collator.PRIMARY);

		Arrays.sort(names, c);

//		Arrays.sort(names, Comparator.comparing(Function.identity().andThen(after)))
		Arrays.stream(names).forEach(t -> System.out.println(t));
	}
}
