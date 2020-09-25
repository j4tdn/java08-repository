package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	
	// int[] , String , Item[] id , name 
	public static void main(String[] args) {
		String[] sequences = {"a",null, "b", "1", "-1", "5",null} ;
		
		//sort manually ( bubble sort ) ;
//		sort(sequences);
		
		
		// Arrays.sort (quick sort ) ; // mặc định nó thực hiện thuật toán quick sort() ;
		
		Arrays.sort(sequences, (String o1,  String o2) -> {
			// null first 
			if(o1 == null  ) {
				return o2 ==null ? 0 : -1  ;
			}
			if(o2 == null ) {
				return 1 ;
			}
			
			
			return (o1.compareTo(o2));
		});
		
		Arrays.sort(sequences, Comparator.nullsFirst(Comparator.comparing(Function.identity(),Comparator.reverseOrder())));
		
		Arrays.stream(sequences).forEach(sequence -> System.out.print(sequence+"\t"));
		
		
		
		
		
	}
	
	private static void sort(String[] sequences) {
		for(int out = sequences.length - 1 ; out > 0 ; out --) {
			for(int in = 0 ;in < out; in++) {
				
				if(sequences[in] ==null ) {
					continue ;
				}
				
				
				
				if(sequences[out] == null || sequences[in].compareTo(sequences[out]) > 0) {
					String temp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = temp ;
				}
			}
		}
	}
}
