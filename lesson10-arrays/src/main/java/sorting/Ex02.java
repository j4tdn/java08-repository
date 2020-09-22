package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
// String: id, name
	public static void main(String[] args) {
		String[] sequences = { "a","b","f",null,"g","2","1", null};

//		Arrays.sort(sequences, ( o1, o2)-> {
//			//return o2.compareTo(o1) * -1;// giam dan -> *-1 tang dan
//			
//			// dung nhieu (kho)
//			// null first
//			if(o1==null) { 
//				return o2==null ? 0 : -1;
//			}
//			if(o2==null) {
//				return 1;
//			}
//			return o1.compareTo(o2);
//		});
//		
		Arrays.sort(sequences, Comparator.nullsLast(Comparator.comparing(Function.identity())));
		
		Arrays.stream(sequences).forEach(sequence -> System.out.print(sequence + " "));
		// khi moi pt bi null => loi

	}

	private static void sort(String[] sequences) {

		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				
				if(sequences[in]==null) {
					continue;// re 0
				}
				
				if(sequences[out]==null || sequences[in].compareTo(sequences[out]) > 0 ) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
				
			}
		}
	}
}
