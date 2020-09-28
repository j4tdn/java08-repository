import java.util.Arrays;

public class Bai3 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", "4", null, "8", null, "g", "Special", "a", "c", "b", "xx", "-3" };
		
		System.out.println(" Sap xep tang dan:");
		sortASE(strings);
		Arrays.stream(strings).forEach(e -> System.out.print(e + "\t"));
		
		System.out.println("\n==================");
		System.out.println(" Sap xep giam dan:");
		Arrays.stream(sortDSE(strings)).forEach(e -> System.out.print(e + "\t"));
		
	}

	private static void sortASE(String[] strings) {
		String s1 = "Special";
		for (int out = 1; out < strings.length; out++) {
			for (int in = 0; in <= out; in++) {
				if (s1.equals(strings[in]) || strings[out] == null) {
					continue;

				}

				if (s1.equals(strings[out]) || strings[in] == null) {
					String tmp = strings[in];
					strings[in] = strings[out];
					strings[out] = tmp;
					continue;

				}

				if (isNumber(strings[in]) && isNumber(strings[out])) {
					if (Integer.parseInt(strings[in]) > Integer.parseInt(strings[out])) {
						String tmp = strings[in];
						strings[in] = strings[out];
						strings[out] = tmp;

					}
				} else if (strings[in].compareTo(strings[out]) > 0) {
					String tmp = strings[in];
					strings[in] = strings[out];
					strings[out] = tmp;
				}

			}
		}
	}

	private static String[] sortDSE(String[] strings) {
		String[] strings2 = new String[strings.length];
		int count = 0;
		sortASE(strings);
		for (int i = strings.length - 1; i >= 0; i--) {
			strings2[count++] = strings[i];
		}
		return strings2;
	}

	private static boolean isNumber(String s) {
		char[] a = s.toCharArray();
		for (char c : a) {
			if (Character.isLetter(c)) {
				return false;
			}
		}

		return true;
	}

}