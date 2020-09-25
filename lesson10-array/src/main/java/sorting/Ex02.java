package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

//int[] , String[], Item[]

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "1", "10", "x", null,"a", "8",null, "z" };
		// sort(numbers);
		/*Arrays.sort(sequences,(String o1, String o2)->{
			if(o1==null) {
			return o2 ==null? 0 : -1;
			}
			if(o2==null) {
				return 1;
			}
			return o1.compareTo(o2);
		});*/
		//o1.compareTo(o2)
		
		//Arrays.sort(sequences, Comparator.nullsLast(Comparator.comparing(Function.identity())));;
		
		Arrays.stream(sequences).forEach(sequence -> System.out.print(sequence + " "));

	}

	public static void sort(String[] sequences) {
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(sequences[in] == null) {
					continue;
				}
				
				if (sequences[out] == null|| sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}

}