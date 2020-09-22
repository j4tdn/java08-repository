package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	// int[], String, Item[] id, name
	public static void main(String[] args) {
		String[] sequences = { "B", "C", "K", null, "E", "D", "F" };

		// sort manually
		// sort(number);

		// sort(number: ASC
		// Arrays.sort(number, ( o1, o2) -> o1.compareTo(o2));
		Arrays.sort(sequences, Comparator.nullsFirst((o1, o2) -> o1.compareTo(o2)));

		Arrays.sort(sequences, ((o1, o2) -> {
			// null last
			if(o1 == null) {
				return o2 == null ? 0 : 1;
			} 
			if(o2 == null) {
				return -1;
			}
			return o1.compareTo(o2);
		}));
		
		Arrays.sort(sequences, Comparator.comparing(Function.identity()));

		Arrays.stream(sequences).forEach(System.out::println);

	}

	private static void sort(String[] sequences) {
		for (int i = 0; i < sequences.length; i++) {
			for (int j = i; j < sequences.length; j++) {
				if (sequences[i] == null) {
					continue;
				}
				if (sequences[j] == null || sequences[i].compareTo(sequences[j]) > 0) {
					String temp = sequences[i];
					sequences[i] = sequences[j];
					sequences[j] = temp;
				}
			}
		}
	}
}
