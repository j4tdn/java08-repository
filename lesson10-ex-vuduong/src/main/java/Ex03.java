import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "f", "-6", "d", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		Arrays.sort(strings, comparator().reversed());

		Arrays.stream(strings).forEach(x -> System.out.println(x));
	}

	private static Comparator<String> comparator() {
		return Comparator.comparing(Function.identity(), (String o1, String o2) -> {
			if (o1 == null) {
				return o2 == null ? 0 : 1;
			}

			if (o2 == null) {
				return -1;
			}

			if (o2.equals("Special")) {
				return o1.equals("Special") ? 0 : 1;
			}

			if (o1.equals("Special")) {
				return -1;
			}

			try {
				int n1 = Integer.parseInt(o1);
				int n2 = Integer.parseInt(o2);
				return n1 - n2;
			} catch (NumberFormatException ex) {
			}

			return o1.compareTo(o2);
		});
	}
}
