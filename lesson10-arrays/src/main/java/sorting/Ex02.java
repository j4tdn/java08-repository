package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {

	public static void main(String[] args) {
		String[] sequence = { "1", null, "9", "5", "a", null, "x", "b", "2", "10" };
		// sort(sequence);
		/*
		 * Arrays.sort(sequence, (o1, o2) -> { // null last if (o1 == null) return o2 ==
		 * null ? 0 : -1; if (o2 == null) return 1; // asc return o1.compareTo(o2); });
		 */

		Arrays.sort(sequence, Comparator.nullsFirst(Comparator.comparing(Function.identity())));

		Arrays.stream(sequence).forEach(numbers -> System.out.print("  " + numbers));

		// sort manually: bubble sort
		// Array.sort(quick-sort)
	}

	private static void sort(String[] sequence) {
		for (int out = sequence.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {

				if (sequence[in] == null) {
					continue;

				}

				if (sequence[out] == null || sequence[in].compareTo(sequence[out]) > 0) {
					String tmp = sequence[in];
					sequence[in] = sequence[out];
					sequence[out] = tmp;
				}

			}
		}
	}

}
