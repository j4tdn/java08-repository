package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	// String[]
	public static void main(String[] args) {
		String[] sequences = { "1", "0", null, "x", "a", "b", null, "10", "2" };
		sort(sequences);
		
		Arrays.stream(sequences).forEach(System.out::println);
		
		System.out.println("=======================");
		Arrays.sort(sequences);
		new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
//		Arrays.sort(sequences, (String o1, String o2) -> {
//			// null last
//			if (o1 == null) {
//				return o2 == null ? 0 : 1;
//			}
//			
//			if (o2 == null) {
//				return -1;
//			}
//			
//			// asc
//			return o1.compareTo(o2);
//		});
		
		Arrays.sort(sequences, 
				Comparator.nullsLast(Comparator.comparing(Function.identity(), Comparator.reverseOrder())));
		
		Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));

		// sort manually: bubble sort
		// Arrays.sort (quick-sort)
	}

	private static void sort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {

				if (sequences[out] == null) {
					continue;
				}
				
				if (sequences[in] == null || sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}

}
