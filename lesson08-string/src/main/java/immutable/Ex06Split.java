package immutable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {

	public static void main(String[] args) {
		String students = "LeNa-LeHoang-LeHieu-LeLa-LeLinh";

		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t + " ");
			}
		};
		String[] studentInfor = students.split("-");

		System.out.println("length: " + studentInfor.length);
		for (String string : studentInfor) {
			System.out.print(string + " ");
		}
		/*
		 * String[] studentInforPatern = Pattern.compile("-").split(students);
		 * System.out.println("\nlength: "+studentInforPatern.length); for (String
		 * string : studentInforPatern) { System.out.print(string+" "); }
		 */
		System.out.println();
		Stream<String> studentInforPatern = Pattern.compile("-").splitAsStream(students);
		/*
		 * studentInforPatern.forEach(new Consumer<String>() {
		 * 
		 * @Override public void accept(String t) { System.out.print(t + " "); } });
		 */

		forEach(studentInfor, consumer);

	}

	private static void forEach(String[] studentss, Consumer<String> consumer) {
		for (String student : studentss) {
			consumer.accept(student);
		}
	}
}
