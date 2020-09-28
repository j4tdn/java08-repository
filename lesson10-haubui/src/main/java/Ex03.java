

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-8", "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		sortAsc(strings);
		System.out.println(Arrays.toString(strings));
		System.out.println("------------------------");
		sortDesc(strings);
		System.out.println(Arrays.toString(strings));
	}

	private static void sortAsc(String[] strings) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if (o1 == null) {
					return o2 == null ? -1 : 0;
				}

				if (o2 == null) {
					return -1;
				}

				if (o1.equals("Special") || o2.equals("Special")) {
					return -1;
				}

				if (o1.matches("[-]{0,1}\\d*") && o2.matches("[-]{0,1}\\d*")) {
					return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
				} else {
					return o2.compareTo(o1) * -1;
				}
			}
		});
	}

	private static void sortDesc(String[] strings) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if (o1 == null) {
					return o2 == null ? 0 : -1;
				}

				if (o2 == null) {
					return 1;
				}

				if (o1.equals("Special") || o2.equals("Special")) {
					return -1;
				}

				if (o1.matches("[-]{0,1}\\d*") && o2.matches("[-]{0,1}\\d*")) {
					return Integer.valueOf(o2).compareTo(Integer.valueOf(o1));
				} else {
					return o2.compareTo(o1);
				}
			}
		});
	}
}
