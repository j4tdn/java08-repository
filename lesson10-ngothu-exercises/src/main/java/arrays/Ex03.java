package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex03 {
	public static void main(String[] args) {
		String[] arrs = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		sortIncrease(arrs);
		Arrays.stream(arrs).forEach(System.out::println);
		
		System.out.println("-----------------");
		
		sortReduction(arrs);
		
	}

	private static void sortIncrease(String[] arrs) {

		Arrays.sort(arrs, (o1, o2) -> {


			if (o2 == null) {
				return o1 == null ? 0 : -1;
			}
			if (o1 == null) {
				return 1;
			}

			if (o1 != "Special" && o1 != null) {
				if (o2 != "Special" && o2 != null) {
					if (o1.compareTo(o2) > 0) {
						return 1;

					}
				}
			}

			if (o2 == "Special") {
				return 0;
				

			}
			return o2.compareTo(o1);
		});	
	}
	private static void sortReduction(String[] arrs) {
		
		sortIncrease(arrs);
		
		for (int i=arrs.length-1;i>=0;i--) {
			System.out.println(arrs[i]);
		}
		
	}
}
