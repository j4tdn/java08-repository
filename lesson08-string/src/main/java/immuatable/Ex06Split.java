package immuatable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {
	public static void main(String[] args) {
		String students = "LeNa-LeTeo-HoangNa-VanTeo-LeTa";
		String[] studentInfo = students.split("-");

		System.out.println("lenght:" + studentInfo.length);
		for (String info : studentInfo) {
			System.out.println(info);
		}
		/*
		 * System.out.println("================"); String[] studentInfoPattern =
		 * Pattern.compile("-").split(students); for (String info : studentInfoPattern)
		 * { System.out.println(info); }
		 */
		System.out.println("================");
		Stream<String> studentInfoPattern = Pattern.compile("-").splitAsStream(students);
		Consumer<String> consumer = new Consumer<String>() {
		
		

			public void accept(String t) {
				System.out.println("->" + t);

			}
		};
		//JAVA
		studentInfoPattern.forEach(consumer);
		//EX06Slipt#forEach
		foreach(studentInfo, consumer);
	}

	private static void foreach(String[] students, Consumer<String> consumer) {
		for (String student : students) {
			consumer.accept(student);
		}
	}

}