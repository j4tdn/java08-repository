import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		System.out.print("Tăng dần:  ");
		sortAsc(strings);
		Arrays.stream(strings).forEach(string -> System.out.print(string + ",  "));

		System.out.print("\nGiảm dần:  ");
		sortDesc(strings);
		Arrays.stream(strings).forEach(string -> System.out.print(string + ",  "));

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

				if (isNumber(o1) && isNumber(o2)) {
					return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
				} else {
					return o1.compareTo(o2);
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

				if (isNumber(o1) && isNumber(o2)) {
					return Integer.valueOf(o2).compareTo(Integer.valueOf(o1));
				} else {
					return o2.compareTo(o1);
				}
			}

		});
	}

	private static boolean isNumber(String strings) {
		if (strings.substring(0, 1).equals("-") && strings.length() > 1) {
			String tmp = strings.substring(1);
			if (number(tmp)) {
				return true;
			}
		} else {
			if (number(strings)) {
				return true;
			}
		}
		return false;
	}

	private static boolean number(String strings) {
		for (int i = 0; i < strings.length(); i++) {
			if (!"0123456789".contains(strings.substring(i, i + 1))) {
				return false;
			}
		}
		return true;
	}
}