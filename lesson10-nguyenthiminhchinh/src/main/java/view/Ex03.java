package view;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		System.out.println("---Mang tang dan---");
		String[] sortAsc = sortAsc(strings);
		Arrays.stream(sortAsc).forEach(string -> System.out.print(string + " "));
		System.out.println("\n---Mang giam dan---");
		String[] sortDes = sortDes(strings);
		Arrays.stream(sortDes).forEach(string -> System.out.print(string + " "));
	}

	private static String[] sortAsc(String[] strings) {
		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[j] == null) {
					continue;
				}
				if (strings[j].equals("Special")) {
					swap(strings, i, j);
					break;
				}
				if (isNumber(strings[i]) && isNumber(strings[j])) {
					if (Integer.parseInt(strings[i]) > Integer.parseInt(strings[j])) {
						swap(strings, i, j);
					}
				} else if (strings[i] == null || strings[i].compareTo(strings[j]) > 0) {
					swap(strings, i, j);
				}
			}
		}
		return strings;
	}

	private static String[] sortDes(String[] strings) {
		for (int i = 0; i < strings.length / 2; i++) {
			String tmp = strings[i];
			strings[i] = strings[strings.length - i - 1];
			strings[strings.length - i - 1] = tmp;
		}
		return strings;
	}

	private static boolean isNumber(String strings) {
		try {
			Integer.parseInt(strings);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	private static void swap(String[] strings, int i, int j) {
		String tmp = strings[i];
		strings[i] = strings[j];
		strings[j] = tmp;
	}
}
