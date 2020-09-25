package sorting;

import static java.util.Comparator.reverseOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	// String[]
		public static void main(String[] args) {
			String[] sequences = {"1", "0", null, "x", "a", "b", null, "10", "2"};
			
			// sort manually: bubble sort
//			sort(sequences);
//			Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));
			
			// Arrays.sort(quick-sort)
//			Arrays.sort(sequences, (String o1, String o2) -> { 
//				// null first
//					if (o1 == null) {
//						return o2 == null ? 0 : -1;
//					}
//					
//					if (o2 == null) {
//						return 1;
//					}
//				// sort asc
//					return o2.compareTo(o1) * -1;
//				});	
			
			Arrays.sort(sequences, Comparator.nullsLast(Comparator.comparing(Function.identity(), reverseOrder())));
			Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));
		}
		
		private static void sort(String[] sequences) {
			for (int out = sequences.length - 1; out > 0; out--) {
				for (int in = 0; in < out; in++) {
					if (sequences[in] == null) {
						continue;
					}
					
					if (sequences[out] == null || sequences[in].compareTo(sequences[out]) > 0) {
						String tmp = sequences[in];
						sequences[in] = sequences[out];
						sequences[out] = tmp;
					}
				}
			}
		}
}
