package ex03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		String input = "xyz";

		System.out.println(Arrays.toString(permutation(input)));
	}

	//tim so cach sap xep
//	private static long factorial(int n) {
//		long fact = 1;
//		for (int i = 2; i <= n; i++) {
//			fact = fact * i;
//		}
//		return fact;
//	}
//
//	private static long mulOfFactorial(String input) {
//
//		long mul = 0;
//
//		Map<Object, Long> map = input.chars().mapToObj(value -> (char) value)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		for (Map.Entry<Object, Long> entry : map.entrySet()) {
//			// mul *= factorial(entry.getValue());
//		}
//
//		return mul;
//	}

	private static String[] permutation(String input) {
		// length = factorial(input.length()) / mulOfFactorial(input);
		String[] result = new String[6];
		int index = 0;
		StringBuilder builder = new StringBuilder();
		while (index < result.length) {
			String temp = builder.toString();

			builder.append(input.charAt(new Random().nextInt(input.length())));

			if (builder.length() == 3 && !temp.equals(builder.toString())) {
				result[index++] = builder.toString();
				builder.delete(0, builder.length());
			}
		}
		return result;
	}

}
