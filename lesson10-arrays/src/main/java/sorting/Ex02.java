
package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
//string
	public static void main(String[] args) {
		String[] sequences= {"1","2","0",null,"b","x",null,"a","23"};
		//sort(sequences);
		/*
		 * Arrays.sort(sequences,(o1,o2)->{ if(o1==null) { return o2==null?0:-1; }
		 * if(o2==null) { return 1; } return o1.compareTo(o2); });
		 */
		
		Arrays.sort(sequences,Comparator.nullsLast(Comparator.comparing(Function.identity())));
		
		Arrays.stream(sequences).forEach(numbers -> System.out.print("  "+numbers));
		
		// sort manually: bubble sort
		// Array.sort(quick-sort)
	}

	private static void sort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(sequences[in]==null) {
					continue;
				}
				if(sequences[out]==null || sequences[in].compareTo(sequences[out])>0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] =tmp;
				}

			}
		}
	}

}

