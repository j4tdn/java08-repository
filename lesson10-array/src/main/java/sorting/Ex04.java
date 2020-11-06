package sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {

	public static void main(String[] args) {
		String[] names = {"B", "a", "A", "b", "á", "Á"};
		Collator c = Collator.getInstance();
		c.setStrength(Collator.TERTIARY);
		Arrays.sort(names, c);
		/*Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}
		});*/
		Arrays.stream(names).forEach(item -> System.out.println(item + " "));

	}

}
