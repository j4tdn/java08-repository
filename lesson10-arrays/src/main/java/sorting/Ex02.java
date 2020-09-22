package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	// String[], Item[] id, name;
	public static void main(String[] args) {
		String[] sequences = { "1", "0", null, "x", "a", "b", "10", null, "2" };

		// sort manually: bubble sort
		// sort(sequences);

		// Array.sort (quick-sort)
		/*
		 * Arrays.sort(sequences, (o1, o2) -> { if (o1 == null) { return o2 == null ? 0
		 * : -1; } if (o2 == null) { return 1; } return o1.compareTo(o2); // ASC });
		 */

		// theo java
		Arrays.sort(sequences, Comparator.nullsFirst(Comparator.comparing(Function.identity())));
		Arrays.stream(sequences).forEach(sequence -> System.out.print(sequence + " "));

	}

	private static void sort(String[] sequences) { // Alt shift R
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
