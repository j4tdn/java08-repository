package java08.array_exercises;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] array = {"-3",null,"7","Special","a","n"};
		
		Arrays.sort(array, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return o2 == null ? 0:1;
				}
				if(o2 == null) {
					return -1;
				}
				if(o2.equals("Special")) {
					return o1.equals("Special")?0:1;
				}
				if(o1.equals("Special")) {
					return -1;
				}
				try {
					int n1 = Integer.parseInt(o1);
					int n2 = Integer.parseInt(o2);
					return n2-n1;
				}
				catch(NumberFormatException ex){
					
				}
				return o1.compareTo(o2);
			}
		});
		
		Arrays.stream(array).forEach(arr -> System.out.print(arr + " "));
	}
	
	

}
