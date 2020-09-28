package Exercise;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {

		public static void main(String[] args) {
			String[] sequences = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
					"b", "xx"};
			Arrays.sort(sequences, (String o1, String o2) -> {
				if(o1 == null) {
					return o2 == null ? 0 : -1;
				}
				if(o2 == null) {
					return 1;
				}
				if(o1.equals("Special")) {
					return o2 == null ? 0 : 1;
				}
				if(o2.equals("Special")) {
					return -1;
				}
				 try {        
			            int number1 = Integer.parseInt(o1);
			            int number2 = Integer.parseInt(o2);
			            return number1 - number2;
			        } catch (Exception e) {
			            e.getMessage();
			       }
				return o1.compareTo(o2);
			});
			Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));
			System.out.println();
			Collections.reverse(Arrays.asList(sequences));
			Arrays.stream(sequences).forEach(number -> System.out.print(number + " "));
			
		}
	}

