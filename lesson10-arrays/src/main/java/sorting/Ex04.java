package sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex04 {
	public static void main(String[] args) {
		String[] names = { "B", "b", "A", "a" };
		Arrays.sort(names);
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		
		Arrays.stream(names).forEach(name -> System.out.println(name));
		
		
		Collator c= Collator.getInstance();
		c.setStrength(Collator.TERTIARY);// dn loai sort minh mong muon
		Arrays.sort(names,c);
		Arrays.stream(names).forEach(name -> System.out.println(name));
	}
	
	
}
