package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	// String[]
	public static void main(String[] args) {
		String[] sequenses = { "1", "0", "x", null,"b", "10", "2" };
//		sort(sequenses);
//		Arrays.sort(sequenses, (o1, o2) -> {
//			if (o1 == null) {
//				return o2 == null ? 0 : -1;
//			}
//			if (o2 == null) {
//				return 1;
//			}
//
//			return o1.compareTo(o2);
//		});
		// sort manually: bubble sort
		// Array.sort (quick-sort)
//		Arrays.sort(numbers); // ASC, java have not DESC
//		Arrays.sort(sequenses, Comparator.comparing(t-> t));
//		Arrays.sort(sequenses, Comparator.comparing(Function.identity()));
		Arrays.sort(sequenses,Comparator.nullsFirst(Comparator.comparing(Function.identity())));
		Arrays.sort(sequenses,Comparator.nullsFirst(Comparator.comparing(Function.identity(), Comparator.reverseOrder())));
		Arrays.stream(sequenses).forEach(value -> System.out.println(value));
	}

	private static void sort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
					continue;
				}

				if (sequences[out] == null || sequences[in].compareTo(sequences[out]) < 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[in] = tmp;
				}

			}
		}

	}
}
