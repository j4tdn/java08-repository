package sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	public static void main(String[] args) {
		String[] names= {"B","a","A","b","Á","á"}; 
		/*
		 * Arrays.sort(names,new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) {
		 * 
		 * return o1.compareToIgnoreCase(o2); } });
		 */
		Collator c=Collator.getInstance();
		c.setStrength(Collator.TERTIARY);
		Arrays.sort(names,c);
		Arrays.stream(names).forEach(name->System.out.println(name));
	}
}
