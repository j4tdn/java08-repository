package sorting;

import java.text.Collator;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] names = { "B", "a", "A", "b" ,"ớ", "à"};
		Collator c = Collator.getInstance();
		c.setStrength(Collator.TERTIARY);
		Arrays.sort(names, c);
		Arrays.stream(names).forEach(name -> System.out.println(name));
	}
}
