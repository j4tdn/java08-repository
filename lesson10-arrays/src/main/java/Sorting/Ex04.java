package Sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;

public class Ex04 {
	public static void main(String[] args) {
		String[] names = {"B","b","c","C"};
		//Arrays.sort(names);
		
		//Arrays.stream(names).forEach(name -> System.out.println(name));
//		Arrays.sort(names, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			}
//			
//		});
		
		Collator c = Collator.getInstance();
		
		c.setStrength(Collator.TERTIARY);
		
		
		Arrays.sort(names,c);
		
		
		
		
	}
}
