package Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		String s = "xyz";
		permutation(s).stream().forEach(System.out::println);
	}

	private static List<String> permutation(String s) {
		List<String> chars = new ArrayList<String>();
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			chars.add(s.charAt(i) + "");
		}

		Collections.shuffle(chars);

		long numberOfPermutation = numberOfPermutation(s.length());
		
		while (result.size() < numberOfPermutation) {
			Collections.shuffle(chars);
			String shuffleString = String.join("", chars);
			if (!result.contains(shuffleString)) {
				result.add(shuffleString);
			}
		}

		return result;

	}

	private static long numberOfPermutation(int number) {
		if (number == 1) {
			return 1;
		}
		return number * numberOfPermutation(number - 1);
	}

}
