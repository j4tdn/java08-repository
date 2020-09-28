package Ex03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Ex01 {

	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		Arrays.sort(strings, (String o1, String o2) -> {
			if (o1 == null) {
				return o2 == null ? 0 : -1;
			}

			try {
				return Integer.parseInt(o1) - Integer.parseInt(o2);
			} catch (Exception e) {
				e.getMessage();
			}

			if (o2.equals("Special")) {
				return o1 == null ? 0 : -1;
			}

			if (o1.equals("Special")) {
				return 0;
			}
			return o1.compareTo(o2);
		});

		Arrays.stream(strings).forEach(number -> System.out.print(number + " "));
		System.out.println();
		reverse(strings);
	}

	public static void reverse(String[] array) {
		String[] newArray = new String[array.length];
		int j = array.length;
		for (int i = 0; i < array.length; i++) {
			newArray[j - 1] = array[i];
			j = j - 1;
		}

		for (int k = 0; k < array.length; k++) {
			System.out.print(newArray[k] + " ");
		}
	}
}