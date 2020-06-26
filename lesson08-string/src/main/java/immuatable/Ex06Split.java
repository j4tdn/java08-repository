package immuatable;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Ex06Split {
	public static <T> void main(String[] args) {
		String student = "LeNa-LeTeo-HoangNa-VanTeo-LeTa";

		System.out.println(Arrays.toString(student.split("-")));

		System.out.println("\n=============\n");

		// System.out.println(Arrays.toString(Pattern.compile("-").split(student)));

		Consumer<String> consumer = new Consumer<String>() {

			public void accept(String t) {
				System.out.println(t);
			}

		};
		String[] students = Pattern.compile("-").split(student);

		Pattern.compile("-").splitAsStream(student).forEach(consumer);

		forEach(students, consumer);

	}

	private static void forEach(String[] students, Consumer<String> consumer) {
		for (String student : students) {
			consumer.accept(student);
		}
	}
}
