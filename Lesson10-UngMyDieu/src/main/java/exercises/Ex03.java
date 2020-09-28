package exercises;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		
		Arrays.sort(strings, (String o1, String o2) -> { 
			// special first
				if (o1 == "Special") {
					return o2 == "Special" ? 0 : -1;
				}
				
				if (o2 == "Special") {
					return 1;
				}
				
				// null last
				if (o1 == null) {
					return o2 == null ? 0 : 1;
				}
				
				if (o2 == null) {
					return -1;
				}
				
			// sort asc
				return o2.compareTo(o1) * -1;
			});	
		
		Arrays.stream(strings).forEach(e -> System.out.print(e + " "));		
	}
		
}
