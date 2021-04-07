package sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex04 {
	public static void main(String[] args) {
		String[] names = {"B", "b", "A", "a", "Á", "á"};
		
		Collator c = Collator.getInstance();
		c.setStrength(Collator.TERTIARY);
		
		Arrays.sort(names, c);
		
		Arrays.stream(names).forEach(name -> System.out.println(name));
	}
	
}
